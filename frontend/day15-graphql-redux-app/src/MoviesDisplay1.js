import { gql, useLazyQuery, useQuery } from "@apollo/client";
import { useEffect, useState } from "react";

const allMoviesQuery = gql`
    query allMoviesQuery {
        allMovies {
            id
            title
            year
            genre
            language
        }
    }
`;

const fetchMovieDetailsQuery = gql`
    query fetchMovieDetailsQuery($titleVar: String) {
        movie(title: $titleVar) {
            title  
            actors {
               name
                age
            }
            ratings {
                name
                score
            }
        }
}`;

const MoviesDisplay1 = () => {
    const [loadAllMovies, loadAllMoviesResult] = useLazyQuery(allMoviesQuery, {fetchPolicy: "cache-first", pollInterval: 45000});
    const [movies, setMovies] = useState([]);
    const [errorMessage, setErrorMessage] = useState('');
    
    const [movieDetails, setMovieDetails] = useState({});
    const [loadMovieDetails, loadMovieDetailsResult] = useLazyQuery(fetchMovieDetailsQuery);

    // this option is used to actively fetch data from GraphQL Api
    // const {data} = useQuery(allMoviesQuery);
    // useEffect(() => {
    //     setMovies(data.allMovies);
    // }, []);

    useEffect(() => {
        const {data, error} = loadAllMoviesResult;
        if(error) {
            setErrorMessage(error.message);
        }
        if(data) {
            setMovies(data.allMovies);
        }
    }, [loadAllMoviesResult]);

    useEffect(() => {
        const {data, error} = loadMovieDetailsResult;
        if(error) {
            setErrorMessage(error.message);
        }
        if(data) {
            setMovieDetails(data.movie)
        }
    }, [loadMovieDetailsResult]);


    const fetchMoviesButtonClicked = () => {
        loadAllMovies();
    };

    const fetchMovieDetails = (title) => {
        loadMovieDetails({
            variables: {
                "titleVar": title
            }
        });
    }

    return (<div>
        <h5>Movies</h5>
        {
            movies.map(m => (<div onClick={() => fetchMovieDetails(m.title)} key={m.id}>
                {m.title}, {m.year}, {m.genre}, {m.language}
            </div>))
        }
        <br/>
        <p>{
            movieDetails.title ? JSON.stringify(movieDetails) : ''
        }</p>
        <button onClick={fetchMoviesButtonClicked}>Fetch movies</button>
        <h4>{errorMessage}</h4>
    </div>);
};

export default MoviesDisplay1;
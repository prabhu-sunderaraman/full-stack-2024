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

const MoviesDisplay1 = () => {
    const [loadAllMovies, { loading, error, data }] = useLazyQuery(allMoviesQuery);
    const [movies, setMovies] = useState([]);
    const [errorMessage, setErrorMessage] = useState('');

    // this option is used to actively fetch data from GraphQL Api
    // const {data} = useQuery(allMoviesQuery);
    // useEffect(() => {
    //     setMovies(data.allMovies);
    // }, []);

    useEffect(() => {
        if(error) {
            console.log("Error", error);
            setErrorMessage(error.message);
        }
        if(data) {
            setMovies(data.allMovies);
        }
    });

    const fetchMoviesButtonClicked = () => {
        loadAllMovies();
    };
    return (<div>
        <h5>Movies</h5>
        {
            movies.map(m => (<div key={m.id}>
                {m.title}, {m.year}, {m.genre}, {m.language}
            </div>))
        }
        <br/>
        <button onClick={fetchMoviesButtonClicked}>Fetch movies</button>
        <h4>{errorMessage}</h4>
    </div>);
};

export default MoviesDisplay1;
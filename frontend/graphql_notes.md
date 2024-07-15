### Set up GraphQL using Apollo Server

* Create a folder [graphql-api]
* Navigate to that folder in Terminal/cmd
* Run this command 
```
   sudo npm init
```            
* Keep pressing enter till the end. You will notice a **package.json** file created

* Run the following command

```
    sudo npm i --save graphql @apollo/server
```
* Create a file **hello-server.js** file

### Queries

``` gql

mutation($title1: String, $title2: String) {
  m1: removeMovie(title: $title1)
  m2: removeMovie(title: $title2)
}

mutation($title: String) {
  removeMovie(title: $title)
}

query($title: String) {
  movie(title: $title) {
    title
    actors {
      name
      age
    }
  }
}

# query {
#  titleWithActors: allMovies {
#    title
#    actors {
#      name
#    }
#  }

#  titleWithRatings: allMovies {
#    title
#    ratings {
#      name
#      score
#    }
#  }

#  titleWithLanguages: allMovies {
#    title
#    language
#  }

# }

# # query  {
# #   allMovies {
# #     title
# #     ratings {
# #       name
# #       score
# #     }
# #   }
# # }

```
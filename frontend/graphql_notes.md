### GraphQL

* GraphQL is a middleware API that takes in queries and filters the response data

##### Need

* If you have multiple applications(or frontend) invoking backend API, you may need different forms of data; 
* If you want to fetch variety of data from backend API, you can combine the requests into one single request
* You have a complex data structure like social media applications

##### Setup

* Setup GraphQL in any technology; NodeJS(Apollo server), Java, .NET, Python
* Define Schema and Resolvers(tech specific)

``` gql
type Person {
  id ID!,
  name String,
  age Int,
  cars: [Car]
}

type Car {
  model: String,
  year: Int
}

type Query {
  persons: [Person]
}

type Mutation {
  addPerson(name: String, age: Int): Person,
  removePerson(id: ID): ID
}

```


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

### Setup Apollo Client

* Create a react application **sudo npx create-react-app day15-graphql-redux-app**
* Install @apollo/client and graphql libraries to this project

```
sudo npm i --save graphql @apollo/client
```

* Start the server
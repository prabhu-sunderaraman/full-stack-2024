* Create a spring boot REST API(movies-api) with the following endpoint
```
	GET /movies/{title}
```

* You will go to a cache and check if the information about the movie is available. If available send the response to the user
* If not send a response **'Fetching the details. Try again later'** to the user. Also post a message to **movie-topic**

<br/>

* Create a spring boot kafka consumer (movie-fetcher-app)
* It listens to **movie-topic** and connects to http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f&t="movieName" for response.
* It collects the response and writes to the cache	 

<br/>

* **docker compose** both these applications and deploy them
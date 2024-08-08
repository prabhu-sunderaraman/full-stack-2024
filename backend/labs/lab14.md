* Create Lab13.java. In this lab you will practice working with parallel streams, Http and JSON
* Work with the __movies.txt__ file in the repo
* For each movie you have to connect to the following site __**http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f**__ and print the year of release, genre and language details
* Design using **parallel streams** to load the movies and invoke the URLs
* Print those movie names, whose details you are not able to fetch, on the console.

* You can fetch the details of the movie by connecting to this API

```
http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f&t=<movieName>
```

* For example, if you want information about __Spectre__ movie use this URL **http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f&t=Spectre**

* Try this url in browser and observe the output structure

* Print the **title, year, language and genre** of the movie names on the console


* Use Json library(Jackson or Gson) of your choice (__You need to configure Maven dependency for this__)
* You can also use  __HttpClient__ class introduced in Java 11 like shown below

``` java
		HttpRequest req = HttpRequest
					.newBuilder(new URI("url"))
					.GET()
					.build();
		HttpResponse<String> response = HttpClient.newBuilder().build().send(req, HttpResponse.BodyHandlers.ofString());
		String result = response.body();
```


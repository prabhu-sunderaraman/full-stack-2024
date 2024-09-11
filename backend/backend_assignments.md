* Input to your API is JSON file that contains information about one IPL match.
* Sample files are provided in the **backend/matches** folder in the repository
* Study the format of the JSON file
* Design a database schema in postgres that captures all the details present in the file 
* Implement the Entity classes with appropriate relationships

### Part I

* Create a Spring boot API with the following endpoints
* Configure Swagger documentation for the API

``` markdown

* Upload a JSON file
* get all the matches played by a given player (name)
* get all the cummulative score of a given player (name)
* get all the scores of the match(es) on given a date
* display the list of all top batsmen in ascending order (paginated results)  
```


* **Note:** The above list will continue growing

### Part II

* Create a **"dev"** branch in your github repository and push this code and NOT in "main" branch
* I will show you the steps and strategies on how to merge it to the **main** branch
* Write unit and integration tests for the API
* create dev, qa and production profiles


### Part III

* Set up a cache to avoid frequent trips to database; ie., when user asks for the matches by a given player check if it's available in the cache, if not go to the database and fetch the results and push them in the cache
* When you upload a new JSON file, remove the old cache information, because now you have new data

### Part IV

* After every call to an endpoint, create a log message in JSON and write it to a kafka topic say **match-logs-topic**
* Ignore creating a consumer

### Part V

* Add an API gateway service (**no need for Eureka server**)


### Part VI

* Containerize and kubernetize(2 pods) your API


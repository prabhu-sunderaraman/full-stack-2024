* Create a folder called __lab-01__ and implement the following

* You have the following data about covid

``` json
[
	{ "country": "USA", "cases": 188592, "recovered": 7251, "deaths": 4055 },
	{ "country": "Italy", "cases": 105792, "recovered": 15729 , "deaths": 12428 },
	{ "country": "Spain", "cases": 95923, "recovered": 19259, "deaths": 8464 },
	{ "country": "France", "cases": 52128, "recovered": 9444, "deaths": 3523 },
	{ "country": "India", "cases": 1590, "recovered": 148, "deaths": 45 }
]
```

* Load this JSON only once

### Part I

* Display this in a tabular format.
* Just display the country and cases columns only
* Each row in the table is a separate component
* So you will have to design **atleast two** components say **CovidGrid** and **CovidRowItem**
* Display the row in **red** if the deaths are more than 5000

### Part II

* When you click on any row in the __CovidGrid__, display all the data about the clicked country in __Summary__ component in a paragraph

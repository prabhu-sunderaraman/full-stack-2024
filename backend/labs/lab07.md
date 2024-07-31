* You have a collection of items with their names and prices

```java


public class Item {
	private String name;
	private double price;
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
}
```

```java
	List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));
```


## To Do - Declarative Style

* Create Lab07.java
* Print the names of all the shoes
* Generate a new Set of shoe names only
* Print the name and price of the costliest shoe
* Concatenate all the item names using comma and print the value (ie., Nike, Adidas, Reebok, Puma, Fila) You can use **collect()** method on Stream. Refer to the API documentation
* Convert the entire collection to a JSON array like this

``` json
[
	{
		"name": "Nike",
		"price": 20.45
	},
	{
		"name": "Adidas",
		"price": 31.45
	}
	...
]
```

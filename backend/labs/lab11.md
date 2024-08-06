#### Create a generic utility class that can dynamically map database results to Java objects using JDBC and reflection.

* You already have accounts table.
* Additionally create table named users with columns: id (INT, primary key auto increment), name (VARCHAR), email (VARCHAR), age (INT); Insert a few records to this table
* Create methods to fetch accounts/users records.

### To Do

* Utility Class: Create a utility class named **DatabaseMapper** with a generic method **mapResultSetToObjects(ResultSet resultSet, Class clazz)** that:
* Takes a ResultSet and a target class as input.
* Uses reflection to get the fields of the target class.
* Iterates over the ResultSet and creates instances of the target class, setting the field values based on the ResultSet column names.
* Returns a List of the created objects.

* Here is an outline for the DatabaseMapper class

``` java

public class DatabaseMapper {
	
	public List<Object> mapResultSetToObjects(ResultSet resultSet, Class clazz) {
		
		// Dynamically generate List<Account> or List<User> objects
		
	}
	
}

```
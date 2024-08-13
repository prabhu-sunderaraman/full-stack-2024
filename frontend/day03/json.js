//OLD STYLE OF CREATING OBJECTS
let oldBook = new Object();
oldBook.title = "Programming Scala";
oldBook.price = 15.34;
oldBook.buy = function(store) {
    console.log(`Buying ${this.title} from ${store} for $${this.price}`);
};
// console.log(oldBook);
// oldBook.buy("Amazon");

let book = {
    "title": "Seven Languages in Seven Weeks",
    "price": 30.23,
    buy(store){ //This syntax was introduced in ES 2019
        console.log(`Purchasing ${this.title} from ${store} for $${this.price}`);
    }
};
// console.log(book);
// book.buy("Flipkart");


let car = { "model": "Ferrari", "yearOfMake": 2024, "color": "Red" };
// let model = car.model;
// let yearOfMake = car.yearOfMake;
let {model, yearOfMake, price} = car; //Object Destructuring; Used extensively while working with ReactJS(states, props)
console.log(model, yearOfMake, price);
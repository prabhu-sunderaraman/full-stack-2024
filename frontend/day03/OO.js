class Book {
    constructor(theTitle, thePrice) {
        this.title = theTitle;
        this.price = thePrice;
    }
    buy(store) {
        return `Buying ${this.title} from ${store} for $${this.price}`;
    }
}

const book1 = new Book("AJAX hacks", 30);
const book2 = new Book("RoR", 50);
let result = book1.buy("Amazon");
console.log(result);


class ComicBook extends Book {
    constructor(theTitle, thePrice, theMainCharacter) {
        super(theTitle, thePrice);
        this.mainCharacter = theMainCharacter;
    }
    buy(store) {
        let result = super.buy(store);
        console.log(`Comic book purchase: ${result}`);
    }
}

const comicBook1 = new ComicBook('Amar chitra katha', 100, 'Ram');
comicBook1.buy('Higgin Bothams');


// All class names start with UpperCase letter
class Person {
    // let name;
    // let age;
    constructor(name, age) {
        this.name = name;
        this.age = age;
        this.alive = true;
    }
    // sleep is referred to as a "method" instead of a "function"
    sleep(hours) {
        console.log(`${this.name} is sleeping for ${hours} hours`);
    }
}

// create an Object using "new" keyword; OR instantiate a class to create an object
const person1 = new Person("Sam", 12);
person1.sleep(4);

const person2 = new Person("Ram", 22);
person2.sleep(5);


// const person1 = {
//     "name": "Sam",
//     "age": 12
// };

// const person2 = {
//     "firstName": "Ram",
//     "age": 22
// };

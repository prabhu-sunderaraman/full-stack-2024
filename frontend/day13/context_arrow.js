let person = {
    name: "Sam",
    age: 12,
    print() {
        console.log("print()", this);
        console.log(this.name, this.age);
    },
    printArrow: () => {
        //Changes the context (this) to the caller
        console.log("printArrow()", this);
        console.log(this.name, this.age);
    }
};

person.print();

console.log();

this.name = "Joey";
this.age = 5;

person.printArrow();
person.print();

function work() {
    //keyword arguments
    console.log("working", arguments);
    for(let i = 0; i < arguments.length; i++) {
        console.log(arguments[i]);
    }
}

work();
work(24, 7);
work(365, "days", 24, 7);
work(false);
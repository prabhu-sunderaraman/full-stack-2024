const num = 100;

const printInfo = function(value) {
    console.log(value);
}
printInfo(num);


const watch = function(programme) {
    console.log("Watching", programme);
}
watch("Movie");

//Higher Order function
const wasteTime = function(mode) {
    if(typeof(mode) === "function") {
        mode("Cricket");
    }
};

wasteTime(watch);

const followNews = function(item) {
    console.log("Following", item, "news on the internet");
}

wasteTime(followNews);
wasteTime("sdkfjdsklfkdsjfksdjnf");

//Higher order function
const killTime = function() {
    const instaReels = function() {
        console.log("My index finger is blunt now");
    }
    return instaReels;
}


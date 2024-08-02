try {
    let person = null;
    person.eat();
} catch (e) {
    console.log("Error", e.message);
} finally {
    console.log("Inside finally");
}

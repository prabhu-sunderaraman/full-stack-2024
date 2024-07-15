const { ApolloServer } = require("@apollo/server");
const { startStandaloneServer } = require('@apollo/server/standalone');

let schema = `
    type Query {
        temperature: Float,
        stockPrice(symbol: String): Float,
        capital(country: String): String
    }
`;

let resolvers = {
    Query: {
        temperature() {
            return Math.random() * 100;
        },
        stockPrice(src, args) {
            return Math.random() * 10000;
        },
        capital(src, args) {
            if(args.country === "India") {
                return "New Delhi";
            } else if(args.country === "USA") {
                return "Washington DC";
            } else if(args.country === "France") {
                return "Paris";
            } else {
                return "NA in DB";
            }
        }
    }
};

let server = new ApolloServer({
    typeDefs: schema,
    resolvers
});

startStandaloneServer(server, {
    listen: 9000
})
.then(response => console.log("GraphQL server started at 9000"));



const { ApolloClient, InMemoryCache } = require("@apollo/client");

const graphqlApi = new ApolloClient({
    uri: 'http://localhost:9000',
    cache: new InMemoryCache()
});

export default graphqlApi;
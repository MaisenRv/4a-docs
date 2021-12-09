const {gql} = require("apollo-server");

const transactionTypeDefs = gql 
`
type Transaction{
    id: String!
    usuarioOrigen: String!
    usuarioDestino: String!
    tipoTransaccion: String!
    producto: String!
    cantidad: Int!
    total: String!
    fecha: String!
}

input TransactionInput{
    usuarioOrigen: String!
    usuarioDestino: String!
    tipoTransaccion: String!
    producto: String!
    cantidad: Int!
    total: String!
    fecha: String!
}

extend type Query{
    transactionById(id: String!): Transaction
}

extend type Mutation{
    createTransaction(transaction: TransactionInput!): Transaction
}

`;

module.exports = transactionTypeDefs;
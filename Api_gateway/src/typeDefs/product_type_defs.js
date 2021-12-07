const {gql} =require('apollo-server');

const productTypeDefs = gql
`
type Product {
    nombre: String!
    descripcion: String!
    cantidad: Int!
    talla: Float!
    tipo: String!
    fechaCreacion: String!
}

input ProductInput {
    nombre: String!
    descripcion: String!
    cantidad: Int!
    talla: Float!
    tipo: String!
    fechaCreacion: String!
}

extend type Query{
    productByName(name: String!): Product
}

extend type Mutation{
    createProduct(product: ProductInput): Product
}

`;

module.exports = productTypeDefs;
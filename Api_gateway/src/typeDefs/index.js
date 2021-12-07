const authTypeDefs = require("./auth_type_defs");
const productTypeDefs = require("./product_type_defs"); 
const transactionTypeDefs = require("./transaction_type_defs"); 

const schemasArrays = [authTypeDefs,productTypeDefs,transactionTypeDefs];

module.exports = schemasArrays;
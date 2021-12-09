const authResolver = require("./auth_resolver");
const productResolver = require("./product_resolver")
const transactionResolver = require("./transaction_resolver")

const lodash = require("lodash");

const resolvers = lodash.merge(authResolver,productResolver,transactionResolver);


module.exports = resolvers;
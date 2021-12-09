const transactionResolver = {
    Query:{
        transactionById: (_, {id }, { dataSources})=>{
            return dataSources.productAPI.transactionById(id);
        }
    },
    Mutation:{
        createTransaction: async(_, {transaction}, { dataSources })=>{
            return dataSources.productAPI.createTransaction(transaction);
        }   
     }
}

module.exports = transactionResolver;
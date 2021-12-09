const productResolver = {
    Query:{
        productByName:(_,{productId}, { dataSources })=> {
            return dataSources.productAPI.getProduct(productId)
        }
    },
    Mutation:{
        createProduct: async(_,{ product }, { dataSources })=>{            
            return await dataSources.productAPI.createProduct(product);
        }
    }

}

module.exports = productResolver;;
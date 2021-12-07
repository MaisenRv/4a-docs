const { RESTDataSource } = require('apollo-datasource-rest');
const serverConfig = require('../server');

class ProductAPI extends RESTDataSource{
    constructor() {
        super();
        this.baseURL = serverConfig.product_api_url
    }

    async createProduct(product){
        product = new Object(JSON.parse(JSON.stringify(product)));
        return await this.post("/product/",product)
    }

    async getProduct(productId){
        return await this.get(`/product/${productId}`);
    }

    async updateProduct(productId,product){
        product = new Object(JSON.parse(JSON.stringify(product)))
        return await this.put(`/updateProduct/${productId}`,product);
    }

    async getAllProducts(){
        return await this.get(`/products/`);
    }

    async createTransaction(trasaction){
        trasaction = new Object(JSON.parse(JSON.stringify(trasaction)));
        return await this.post('/transaction',trasaction)
    }

    async transactionById(transactionId){
        return await this.get(`/transaction/${transactionId}`);
    }

}
module.exports = ProductAPI;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author dsre1
 */
public class StoreManagement {
    
    public void NewProduct(List<Store> stores, int storeIndex, Product product) {
        if (stores.getNode(storeIndex) != null) {
            Store store = stores.getNode(storeIndex).getData();
            List<Product> products = store.getProducts();
            products.append(product);
        }
    }

    public void IncreaseQuantity(List<Store> stores, int storeIndex, int productIndex, int newQuantity) {
        if (stores.getNode(storeIndex) != null) {
            Store store = stores.getNode(storeIndex).getData();
            List<Product> products = store.getProducts();
            if (products.getNode(productIndex) != null) {
                Product product = products.getNode(productIndex).getData();
                product.setQuantity(newQuantity);
            }
        }
    }
}

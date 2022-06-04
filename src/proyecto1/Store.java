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
public class Store {
    private String name;
    private List<Product> products;
    
    public Store(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }
    
    public Store(String name) {
        this.name = name;
        this.products = new List<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
}

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

    public void NewStore(GrafMatPeso gf, List<Store> stores, Store store) {
        stores.append(store);
        Node<Store> node = stores.searchNode(store);
        gf.insertNode(node);
    }
}

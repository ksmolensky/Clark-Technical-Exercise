package com.app.clark;

/**
 *
 * @author karasmolensky
 */
public class ProductInventoryTest {
    public static void main(String [] args) {
        testAddProduct();
        testRemoveProduct();
        testUpdateProduct();
        testCalculateInventory();
    }
    public static void testAddProduct() { //unit test for adding a new product
        StoreInventory inventory = new StoreInventory();
        
        Product product = new Product("Conveyer Toaster", "23", 338.19, 15);
        
        inventory.addProduct(product);
        inventory.viewInventory(); //viewing current inventory
    }

    public static void testRemoveProduct() { //unit test for removing a product
        StoreInventory inventory = new StoreInventory();
        
        Product product1 = new Product("Ice Cream Machine", "57", 5857.00, 25);
        Product product2 = new Product("Vacuum", "46", 239.99, 30);
        
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        
        inventory.removeProduct("57");
        inventory.viewInventory(); //viewing current inventory
    }
    
    public static void testUpdateProduct() { //unit test for updating a product
        StoreInventory inventory = new StoreInventory();
        
        Product product3 = new Product("Sweeper", "15", 299.99, 20);
        Product product4 = new Product("Waffle Maker", "33", 484.99, 30);
        
        inventory.addProduct(product3);
        inventory.addProduct(product4);
        
        inventory.updateProductQuantity("15", 10);
        inventory.viewInventory(); //viewing current inventory
    }
    
    public static void testCalculateInventory() { //unit test for calculating inventory
        StoreInventory inventory = new StoreInventory();
        
        Product product7 = new Product("Cotton Candy Machine", "83", 288.99, 10);
        
        inventory.addProduct(product7);
        inventory.viewInventory(); //viewing current inventory
        inventory.displayTotalInventory();
        
    }
    

}

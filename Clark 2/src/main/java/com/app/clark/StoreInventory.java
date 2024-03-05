package com.app.clark;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author karasmolensky
 * StoreInventory class implemented to manage the inventory of products
 */
public class StoreInventory {
    private List<Product> products;


    public StoreInventory() {
        products = new ArrayList<>();
    }
    
    public void addProduct(Product product) { //adding a new product to the inventory
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }
    
    public void removeProduct(String productId) { //removing a product from inventory by its ID
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId().equals(productId)) {
                iterator.remove();
                System.out.println("Product removed: " + product.getName());
            }          
        }
    }
    
    public void updateProductQuantity(String productId, int newQuantity) { //updating quantity of product in inventory
        for(Product product : products) {
            if (product.getId().equals(productId)) {
                product.setQuantity (newQuantity);
                System.out.println("Quantity updated for product: " + productId + " to " + newQuantity);
            }
        }
    System.out.println("Product not found for " + productId);
    }
    
    public void viewInventory() { //viewing current inventory (listing all products with their details)
        System.out.println("Current inventory: ");
        for(Product product : products) {
            System.out.println(product);
        }

    }
    
    public double calculateTotalInventory() { //calculating the total value of inventory
        double totalValue = 0.0;
        for(Product product : products) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }
    
    public void displayTotalInventory() { //displaying the total value of inventory
        double totalValue = calculateTotalInventory();
        System.out.println("Total value of inventory: $" + totalValue);
    }
}
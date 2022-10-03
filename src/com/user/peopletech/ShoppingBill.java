package com.user.peopletech;
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  

public class ShoppingBill   
{  
    public static void main(String args[])   
        {  
           
            String id = null;  
            String productName = null;  
            int quantity = 0;  
            double price = 0.0;  
            double totalPrice = 0.0;  
            double overAllPrice = 0.0;  
            double cgst, sgst, subtotal=0.0, discount=0.0;  
            char choice = '\0';  
            System.out.println("\t\t\t\t--------------------Invoice-----------------");  
            System.out.println("\t\t\t\t\t "+"  "+"Gyana Mart");  
            System.out.println("\t\t\t\t\t3/Synchrony Raidurg");  
            
            System.out.println("Contact: (+91) 9989886556");  
            
            
           
           
           
            Scanner scan = new Scanner(System.in);  
            System.out.print("Enter Customer Name: ");  
            String customername=scan.nextLine();  
           
            List<Product> product = new ArrayList<Product>();  
            do   
                {  
                    
                    System.out.println("Enter the product details: ");  
                    System.out.print("Product ID: ");  
                    id = scan.nextLine();  
                    System.out.print("Product Name: ");  
                    productName = scan.nextLine();  
                    System.out.print("Quantity: ");  
                    quantity = scan.nextInt();  
                    System.out.print("Price (per unit): ");  
                    price = scan.nextDouble();  
                   
                    totalPrice = price * quantity;  
                   
                    overAllPrice = overAllPrice + totalPrice;  
                   
                    product.add( new Product(id, productName, quantity, price, totalPrice) );  
                   
                    System.out.print("Want to add more items? (y or n): ");  
                  
                    choice = scan.next().charAt(0);  
                   
                    scan.nextLine();  
                }   
            while (choice == 'y' || choice == 'Y');  
            
            Product.display();  
            for (Product p : product)   
            {  
                p.display1();  
            }  
           
            System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice);  
            
           
             
            subtotal = overAllPrice;   
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal "+subtotal);  
           
            
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " +(subtotal));  
            System.out.println("\t\t\t\t----------------Thank You for Shopping-----------------");  
            System.out.println("\t\t\t\t                     Visit Again");  
           
            scan.close();  
        }     
}  
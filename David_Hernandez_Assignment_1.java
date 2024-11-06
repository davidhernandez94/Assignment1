/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package david_hernandez_assignment_1;

import java.util.Scanner;
/**
 *
 * @author 6309110
 */
public class David_Hernandez_Assignment_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        task4();
    }
    public static void task1() {
        Scanner console = new Scanner(System.in);
       
        System.out.print("Please enter your name: ");
        String name = console.nextLine();

        System.out.print("Please enter your age: ");
        int age = console.nextInt();
        console.nextLine();
        
        System.out.print("Please enter your gender: ");
        String gender = console.nextLine();

        System.out.print("Please enter your department: ");
        String department = console.nextLine();
        
        System.out.print("Please enter the value of PI (3.1415926):");
        double pi = console.nextDouble();
        
        System.out.printf("\n %-18s: %s \n %-18s: %d \n %-18s: %s \n %-18s: %s \n %-18s: %.2f \n","Name", name, "Age", age, "Gender", gender, "Department", department, "PI", pi);
        }
    
    public static void task2() {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter the item price: ");
        double originalPrice = console.nextDouble();
        
        System.out.print("Please enter the discount ratio (5 for 5%): ");
        double discountRatio = console.nextDouble();
        
        double priceBeforeTax = originalPrice * (1-(discountRatio/100));
        double fedTax = priceBeforeTax * .05;
        double provTax = priceBeforeTax * .09975;
        double finalPrice = priceBeforeTax + fedTax + provTax;
        
        System.out.printf("\n%-20s: %.2f \n%-20s: %.2f%% \n%-20s: %.2f \n", "Original Price", originalPrice, "Discount ratio", discountRatio, "Price Before Tax", priceBeforeTax);
        System.out.println("-------------------------------------------------");
        System.out.printf("%-20s: %.2f \n%-20s: %.2f \n%-20s: %.2f\n", "Federal Tax", fedTax, "Provincial Tax", provTax, "Final Price", finalPrice);
    }
    
    public static void task3() {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter a 4-digits Octal number: ");
        int oct = console.nextInt();
        
        int dec = (oct / 1000 * 512) + (oct % 1000 / 100 * 64) + (oct % 100 / 10 *8) + (oct % 10);
        System.out.printf("\n%-20s: %d\n%-20s: %d\n", "Octal Number", oct, "Decimal Number", dec);
    }   
    
    public static void task4() {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter the intial balance: ");
        double initial = Integer.parseInt(console.nextLine().substring(1));
        
        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double rate = console.nextDouble();
        
        System.out.print("Please enter the number of years the client wants to save the money in the bank: ");
        int years = console.nextInt();
        
        double after5Years = initial * Math.pow(1+(rate/100), years);
        
        System.out.printf("\n%-25s: %10.2f \n%-25s: %10.2f \n%-25s: %10d\n", "Initial Balance", initial, "Annual Interest Rate", rate, "Saving Years", years);
        System.out.println("------------------------------------");
        System.out.printf("%-25s: %10.2f\n", "Balance After 5 Years", after5Years);
    }
}

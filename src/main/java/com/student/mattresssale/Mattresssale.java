/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.student.mattresssale;
import com.student.mattresssale.Implementation.Product;
import com.student.mattresssale.InterfadeIProduct.IProduct;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Mattresssale {

public class Main {

    public static void main(String[] args) {
        String[] productNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };
        int months = 3;
        int[][] sales = new int[productNames.length][months];

        Scanner scanner = new Scanner(System.in);

        for (int p = 0; p < productNames.length; p++) {
            for (int m = 0; m < months; m++) {
                sales[p][m] = readSales(scanner, m + 1, productNames[p]);
            }
            System.out.println();
        }

        // Names shown in the report without the word "mattress", as in the sample
        String[] reportNames = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};

        IProduct product = null;
        IProduct product1 = product;
new Product(reportNames, sales);
        PrintProduct printer = new PrintProduct((com.student.mattresssale.IProduct) product);
        printer.printReport();

        scanner.close();
    }

    private static int readSales(Scanner scanner, int month, String name) {
        while (true) {
            System.out.print("Enter number of sales for month " + month + " for " + name + ": ");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value >= 0) {
                    return value;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid input. Please enter a whole number of 0 or more.");
        }
    }
}
}

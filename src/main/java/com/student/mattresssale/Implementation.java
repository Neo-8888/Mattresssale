/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.student.mattresssale;

import com.student.mattresssale.Mattresssale.IProduct;

/**
 *
 * @author Student
 */
public class Implementation {

public abstract class Product implements IProduct {

    private final String[] productNames;
    private final int[][] sales; // [product][month]

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] productSales : sales) {
            for (int monthSales : productSales) {
                total += monthSales;
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = 0;
        for (int[] productSales : sales) {
            count += productSales.length;
        }
        return count == 0 ? 0 : (double) GetTotalProductsSold() / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0;
        int bestTotal = -1;

        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int monthSales : sales[i]) {
                productTotal += monthSales;
            }
            if (productTotal > bestTotal) {
                bestTotal = productTotal;
                bestIndex = i;
            }
        }

        int highestMonth = 0;
        for (int monthSales : sales[bestIndex]) {
            if (monthSales > highestMonth) {
                highestMonth = monthSales;
            }
        }
        return productNames[bestIndex] + "(" + highestMonth + ")";
    }
} 
}

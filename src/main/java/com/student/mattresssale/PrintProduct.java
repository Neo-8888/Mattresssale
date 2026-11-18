/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.student.mattresssale;

import com.student.mattresssale.Mattresssale.IProduct;
import java.text.DecimalFormat;
/**
 *
 * @author Student
 */
public class PrintProduct {

    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void printHeader() {
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*****************************************");
    }

    public void printTotalProductsSold() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void printAverageProductSold() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("AVERAGE PRODUCT SALES: " + df.format(product.GetAverageProductSold()));
    }

    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    public void printReport() {
        printHeader();
        printTotalProductsSold();
        printAverageProductSold();
        printMostPopularProduct();
    }
}  


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.electronicsfranchise;

/**
 *
 * @author emeris
 */
import java.util.Scanner;
public class ElectronicsFranchise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String cities[]= {"Cape Town", "Port Elizabeth", "Pretoria"};
        String consoles[] = {"PS5", " XBOX", "NINTENDO SWITCH"};
        
        int[][] consoleSales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        
        //One-dimensional array to store the total sales per city
        int[] cityTotals = new int[cities.length];

        System.out.println("=========================================");
        System.out.println("   NUMBER 1 ELECTRONICS - YEARLY REPORT");
        System.out.println("=========================================");

        //Loop through each city (rows)
        for (int i = 0; i < cities.length; i++) {
            System.out.println("\nCity: " + cities[i]);

            //Loop through each console (columns)
            for (int j = 0; j < consoles.length; j++) {
                System.out.println("  " + consoles[j] + ": " + consoleSales [i][j]);
                cityTotals[i] += consoleSales [i][j];
            }

            System.out.println("  Total sales for " + cities[i] + ": " + cityTotals[i]);
        }

        //Find the city with the most console sales
        int highestIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[highestIndex]) {
                highestIndex = i;
            }
        }

        System.out.println("\n-----------------------------------------");
        System.out.println("City with the most console sales: " + cities[highestIndex]);
        System.out.println("Total sales: " + cityTotals[highestIndex]);
        System.out.println("-----------------------------------------");
    }
}
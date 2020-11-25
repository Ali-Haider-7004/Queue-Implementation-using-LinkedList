/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;

public class LabTaskcode {

    public static int findBinary(int n_Number) {

        if (n_Number == 0) {
            return 0;
        } 
        else
        {
            
            int m;
            m=n_Number % 2 + 10*findBinary(n_Number / 2);
                        
            
            return m;
            
           
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n_Number;
        System.out.println("Please Enter Number Of Which You Want in Binary =");

        n_Number = s.nextInt();
        System.out.println(findBinary(n_Number));

    }

}

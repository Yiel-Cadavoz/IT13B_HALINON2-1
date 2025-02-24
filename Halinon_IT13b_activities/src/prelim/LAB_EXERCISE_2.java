/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

/**
 *
 * @author User
 * 
 * 
 */
 import java.util.Scanner;
         
     public class LAB_EXERCISE_2 {
     public static void main(String[]args){
          
         Scanner in = new Scanner(System.in);
        
         System.out.println("enter first number:");
         int X = in.nextInt();
                 
          System.out.println("enter second number:");
         int Y = in.nextInt();
         
          System.out.println("enter third number:");
         int Z = in.nextInt();
         
         int A = X;
         if (Y > A) {
             
             A = Y ;   
         }
         if (Z > A ){
         
            A = Z;
         
         
         
         }
         
 
      System.out.println("The greatest among numbers is :" + A );
     
     in.close();
     }
       
         
         
         
         
     }
    
    


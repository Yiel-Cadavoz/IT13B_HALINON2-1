/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author User
 */
public class FIBONACCI_SEQUENCe {
//    public static void main(String[]args ){
//        
//        int n=10;
//        
//        for (int i = 0; 1 < n; i++){
//            System.out.print(fibonacci(i)+ ",");
//        }
//        
//    }
//    
//    public static int fibonacci(int n){
//        
//        if (n <=1){
//            return n;
//        } else{ 
//         return fibonacci(n-1)+fibonacci(n-2);
//    }
//}
//
//    
//    } 
//    
//}
     
    public static int fibonacci(int n){
        
        if (n <=1){
            return n;
        }
         return fibonacci(n-1)+fibonacci(n-2);
    
}

     public static void main(String[]args ){
        
        int n=10;
        
        for (int i = 0; i < n; i++){
            System.out.print(fibonacci(i)+ ",");
        }
        
    } 
    
    }


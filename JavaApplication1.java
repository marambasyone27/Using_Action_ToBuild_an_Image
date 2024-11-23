/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Maram Basyone
 */
public class JavaApplication1 {

    public static void main(String[] args) {
          System.out.println(" Dockerfile finish his mission successfully");
        try{
       int x=10;
       int y=0;
       int div=x/y;
        System.out.println("x/y = " + div);
        }
        catch(ArithmeticException e){
            System.out.println("invalid Operation divide by zero is not available");
            e.printStackTrace();
        }
      
       
    }
    
}

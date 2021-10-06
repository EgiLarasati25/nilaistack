/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;

public class formula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Stack<String> stack = new Stack<> (10);
        String input = "f(x) = (2x + y) - (3+ (2x-x) + 20) ";
        Scanner scan = new Scanner (input);
        
       scan.useDelimiter("");
       
       for (int i = 0; i < 10; i++){
        String bentuk = scan.next();
        if (bentuk.equals("(")){
            stack.push("(");
        } else if (bentuk.equals ("(")){
            stack.pop();
        }
       }
       if(stack.isEmpty()){
           System.out.println("valid");
       }else{
           System.out.println("tidak valid");
       }
    }
    
}

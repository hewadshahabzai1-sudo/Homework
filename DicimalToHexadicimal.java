
package dicimal.to.hexadicimal;

import java.util.Scanner;

public class DicimalToHexadicimal {

    public static void main(String[] args) {
        // deicimal to hexdecimal
        Scanner input = new Scanner(System.in);
        System.out.println("please enter an integer number between (0-15): ");
        int decimal = input.nextInt();
        if(decimal>=0 && decimal<=15){
            if(decimal<10){
                System.out.println("the hexa value is " + decimal);
                }
        
            else{
              char hex = (char)('A' + (decimal - 10));
                System.out.println("the hexa value is " + hex);
                }
                

            }   
            else{
                System.out.println("inavalid input!");        
                }
                    

            
            
    
    }

}
    
    
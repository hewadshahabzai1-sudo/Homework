
package pyramid;

import java.util.Scanner;

public class Pyramid {

   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
       System.out.println("enter a number"); 
   int num = input.nextInt();
    for(int i =2;i<num-1;i++){
        if(num%i!=0){
            i++;
            System.out.println("it is prime number");
          
        }
       else{
            System.out.println("it is not prime number");
            break;
        } 
       
    }
       
    }
    
}

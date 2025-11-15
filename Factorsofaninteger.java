package factorsofaninteger;

import java.util.Scanner;

public class Factorsofaninteger {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter an integer number ");
    int num = input.nextInt();
    int factor = 2;
    while(num>1){
    if(num%factor==0){
        System.out.println(factor);
    num = num/factor;
    }
    else{
        factor = factor+1;
    }
    
    }
        
        
        
        
        
    }
    
}

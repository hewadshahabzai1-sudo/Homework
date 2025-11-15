
package subtractionquiz;
import java.util.Scanner;


public class Subtractionquiz {

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int correctAnswer = 0;
    final int numberOfQuestion = 10;
    int a,b,userAnswer=0;
    int answer = 0;  
    System.out.println("welcome to our subtraction quiz ");
       System.out.println("you will be asked " + numberOfQuestion +" Question ");
        for(int i = 1; i<=10;i++){
        a = (int)(Math.random()*15+1);
        b = (int)(Math.random()*15+1);
        answer = a-b;
        System.out.println("Question "+i+" what is the answer "+ a + " - " + b + "=?");
        userAnswer = input.nextInt();
        }        
        
        if(userAnswer == answer){
        correctAnswer++;
        }
     
        else{
            System.out.println("worng, the correct answer is"+answer+"\n");
        }
   
        System.out.println("your correct answer is " +correctAnswer);
   
   
   }
      
      
    }
 
        
       
    


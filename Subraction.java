
package subraction;

import java.util.Scanner;


public class Subraction {

    public static void main(String[] args) {
    // subtraction quiz 
 
    Scanner input = new Scanner(System.in);    
    int num1 = (int)(Math.random()*100);
    int num2 = (int)(Math.random()*100);
    
    int correctAnswer = 0;
    int inCorrectAnswer = 0;
    int result = num2-num1;
    for(int i = 0; i<=0; i++){
        System.out.println("what is the answer  "+ num2 + " - " + num1+"?");
        int answer1 = input.nextInt();
        if(result==answer1){
           correctAnswer=correctAnswer+1; 
        
        }
        else if(answer1!=result){
        inCorrectAnswer=inCorrectAnswer+1;
            }
        

        num1 = (int)(Math.random()*100);
        num2 = (int)(Math.random()*100);
        System.out.println("what is the answer  "+ num2 + " - " +num1+"?");
        int answer2 = input.nextInt();
        if(result==answer2){
            correctAnswer+=1;
        }
        
        else if(answer2!=result){
        inCorrectAnswer+=1;
            
        }
        num1 = (int)(Math.random()*100);
        num2 = (int)(Math.random()*100);
           System.out.println("what is the answer  "+ num2 + " - " +num1+"?");
        int answer3 = input.nextInt();
        if(result==answer3){
        correctAnswer+=1;
            }

        else if(answer3!=result){
            inCorrectAnswer+=1;
            }
        
     
    num1 = (int)(Math.random()*100);
    num2 = (int)(Math.random()*100);
    System.out.println("what is the answer  "+ num2 + " - " +num1+"?");
        int answer4 = input.nextInt();
        if(answer4==result){
            correctAnswer+=1;
                }
        else if(answer4!=result){
        inCorrectAnswer+=1;
        }

        }
        
        
        System.out.println("your correct answer is " + correctAnswer);
    
        System.out.println("your incorrect answer is " + inCorrectAnswer );
        


    
    
    
    
    
        
        
        
    }
    
}

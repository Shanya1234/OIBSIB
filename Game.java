package Shanyagame;

import java.util.Objects;
import java.util.Scanner;

public class Game{

    public static void numberGame(){
        Scanner sc = new Scanner(System.in);
        int num;

        {
            num = 1 + (int) (100 * Math.random());
        }
        System.out.println("Choosing a number between 1 and 100...");
        System.out.println("You've to guess the number within 8 trials.");
        int i,guess;
        for(i=1;i<9;i++) {
            System.out.println("Enter your guess :");
            guess=sc.nextInt();
            if(guess<num){
                System.out.println("Guess is low");
                System.out.println("No. of attempts left = "+(8-i));

            } else if (guess>num) {
                System.out.println("Guess is high");
                System.out.println("No. of attempts left ="+ (8-i));

            }
            else{
                System.out.println("Congratulations You Guessed the Correct Number");
            }
        }
        System.out.println("You are out of moves");
        System.out.println("The number was : "+num);
    }

    public static void main(String[] args) {
        numberGame();
        System.out.println("Want to play again ?"+ "\n Type 'YES' for Yes and 'NO' for No");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        if(Objects.equals(s, "YES")){
            numberGame();
        }
        else{
            System.out.println("Thank You For Playing..."+"\n Have a Nice Day :)");
        }
    }
}

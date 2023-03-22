import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //generate a random number between 1 and 100
        int randomNumber =(int) (Math.random()*100) + 1;//casting

        //promp the user to guess the number
        System.out.print("Enter a guess: ");
        int userGuess = input.nextInt(); //reads user's input an integer


        //check user's input
        //as long as user's input is incorrect
        while(userGuess != randomNumber)
        {
            //display too high or too low
            if(userGuess>randomNumber)
                System.out.println("Too high!");
            else
                System.out.println("Too low!");
            //read next guess
            System.out.print("Enter another guess: ");
            userGuess = input.nextInt(); //reads user's input an integer
        }
        

        //you only get here when the user has the correct answer
        //display congratulations!!
        System.out.println("Congratulations!!!! You Won!!!");

        input.close();
    }
}
import java.util.Random;
import java.util.Scanner;

class guess {
    int a,b,c=0;
    public void guess() {
        Random com_input=new Random();
        a=com_input.nextInt(0,100);
        System.out.println("Computer has guessed the number !!");
    }

    public void takeUserInput() {
        System.out.println("The game begins ");
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<15; i++) {
            if (c==10) {
                System.out.println("Game over !!, better luck next time.");
                break;
            }
            c++;
            System.out.print("Guess the number: ");
            b=sc.nextInt();
            if (b>a) {
                System.out.println("Too high, think of a smaller number");
            } else if (b<a) {
                System.out.println("Too low, think of a bigger number");
            } else {
                System.out.println("Congragulations !!, you have guessed the number");
                break;
            }
        }
    }

    public void score() {   
        System.out.println("Your score = "+c);
        if (c<5) {
            System.out.println("You are a mastermind !!");
        } else if (c<10) {
            System.out.println("You are a good guesser !");
        } else {
            System.out.println("You can do better");
        }
    }
}

public class game {
    public static void main(String[] args) {
        System.out.println("Game: Guess the number");
        guess game=new guess();
        game.guess();
        game.takeUserInput();
        game.score();
    }
}
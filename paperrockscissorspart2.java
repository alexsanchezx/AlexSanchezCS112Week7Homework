


import java.util.Random;
import java.util.Scanner;
 
public class paperrockscissorspart2  {
        static int win =  0;
        static int loss = 0;
        static int ties = 0;
        static boolean play = true;
        static String player = "";
        // rock = 1 paper = 2 scissors = 3
       
        static void count(){
                Scanner k;
                k = new Scanner(System.in);
                System.out.printf("You currently have %d wins, %d Losses and %d ties.", win ,loss ,ties);
                System.out.println("do you wish to keep playing? Y/N");
                player = k.next();
                if(player.equalsIgnoreCase("y")){
                        play = true;
                }
                else {
                        if(player.equalsIgnoreCase("n")) {
                                play = false;
                        }
                }
        }
 
        public static void main(String[] args) {
                Scanner k;
                int num = 0;
                String comp ="";
                int input = 0;
               
                k = new Scanner(System.in);
                Random r = new Random();
                while(play = true) {   
                System.out.println("Type either Rock, Paper or Scissors.");
                                                                player = k.next();
                                                switch (player) {
                                                case "rock":  input = 1;
                                                break;
                                                case "paper":  input = 2;
                                                break;
                                                case "scissors":  input = 3;
                                                break;
                                                }
                System.out.printf("you chose %s\n", player);
                                                                num += r.nextInt(2) + 1;
                                                switch (num) {
                                                case 1:  comp = "Rock";
                                                break;
                                                case 2:  comp = "Paper";
                                                break;
                                                case 3:  comp = "Scissors";
                                                break;
                                                case 0:  comp = "rock";
                                                break;
                                                }
                System.out.printf("your opponent chose %s\n", comp);
                                                        if(num == 2 && input == 1) {
                                                                System.out.println("You lose.");
                                                                loss +=1;
                                                                count();
                                                                System.out.println(" ");
                                                }
                                                else {
                                                        if(num == 3 && input == 1) {
                                                                System.out.println("You Win.");
                                                                win += 1;
                                                                count();
                                                                System.out.println(" ");
                                                        }
                                                        else {
                                                                if(num == 1 && input == 1) {
                                                                        System.out.println("It's a tie.");
                                                                        ties += 1;
                                                                        count();
                                                                        System.out.println(" ");
                                }
                        }
                }
                                                                if(num == 2 && input == 2) {
                                                                        System.out.println("It's a tie.");
                                                                        ties += 1;
                                                                        count();
                                                                        System.out.println(" ");
                                                                }
                                                                else {
                                                                        if(num == 3 && input == 2) {
                                                                                System.out.println("You lose.");
                                                                                loss +=1;
                                                                                count();
                                                                                System.out.println(" ");
                }
                                                                else {
                                                                        if(num == 1 && input == 2) {
                                                                                System.out.println("You win.");
                                                                                win += 1;
                                                                                count();
                                                                                System.out.println(" ");
                                }
                        }
                }
                                                                if(num == 2 && input == 3) {
                                                                        System.out.println("You win.");
                                                                        win += 1;
                                                                        count();
                                                                        System.out.println(" ");
                                                                }
                                                                else {
                                                                        if(num == 3 && input == 3) {
                                                                                System.out.println("It's a tie.");
                                                                                ties += 1;
                                                                                count();
                                                                                System.out.println(" ");
                                                                        }
                                                                        else {
                                                                                if(num == 1 && input == 3) {
                                                                                        System.out.println("You Lose.");
                                                                                        loss +=1;
                                                                                        count();
                                                                                        System.out.println(" ");
                                }
                        }
                }
                }
        }
}
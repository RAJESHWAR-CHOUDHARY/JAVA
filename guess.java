import java.util.Random;
import java.util.Scanner;
public class guess
 {
    public static void main(String[] args){
        System.out.println("Guess the character from a to z");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        char guess = (char) ('a' + rd.nextInt(26));
        for(int i=0 ; i<=26 ; i++){
            System.out.println("try " +i+ ": ");
            char alpha = sc.next().charAt(0);
            if(alpha==guess){
                System.out.println("you guessed the right alphabet");
                break;
            }
            else if(alpha > guess){
                System.out.println("guessed alphabet is greater");
            }
            else if(Character.isDigit(alpha)){
                System.out.println("wrong input");
            }
            else {
                System.out.println("guessed alphabet is smaller");
            }
        }
    }
}

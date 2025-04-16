import java.util.Scanner;
public class cgpa {
    public static void main(String[] arg){
        System.out.println("ENTER MARKS");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter maths marks");
        int a = sc.nextInt();
        System.out.println("enter physics marks");
        int b = sc.nextInt();
        System.out.println("enter chemistry marks");
        int c = sc.nextInt();
        float perc = ((a+b+c)/3)/9.5f;
        System.out.print("percentage is : ");
        System.out.print(perc);
    }
}

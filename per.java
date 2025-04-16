import java.util.Scanner;
public class per {
    public static void main(String[] arg){
        System.out.println("Enter marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths marks");
        int a = sc.nextInt();
        System.out.println("Enter chemistry marks");
        int b = sc.nextInt();
        System.out.println("Enter physics marks");
        int c = sc.nextInt();
        System.out.println("Enter it marks");
        int d = sc.nextInt();
        System.out.println("Enter bio marks");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        float perc = ((a+b+c+d+e)/5);
        System.out.print("Percentage is : ");
        System.out.print(perc);
    }
}

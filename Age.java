import java.util.Scanner;
public class Age{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=13){
            System.out.println("Child");
        } else if (n<=18){
            System.out.println("Teenager");
        } else if(n<=30){
            System.out.println("Adult");
        } else {
            System.out.println("Odd");
        }
    }
}
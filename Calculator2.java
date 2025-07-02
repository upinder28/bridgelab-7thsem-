//import java.util.Scanner;
//public class Calculator2 {
//    int a,b;
//
//    public void methodAdd(){
//        int ValueA=a;
//        int ValueB=b;
//        int result=a+b;
//        System.out.println(result);
//    }
//
//    public void methodSubtract(){
//        int ValueA=a;
//        int ValueB=b;
//        int result=a-b;
//        System.out.println(result);
//    }
//
//    public void methodMultiply(){
//        int ValueA=a;
//        int ValueB=b;
//        int result=a*b;
//        System.out.println(result);
//    }
//
//    public void methodDivision(){
//        int ValueA=a;
//        int ValueB=b;
//        int result=a/b;
//        System.out.println(result);
//    }
//
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first value");
//        int ValueA = sc.nextInt();
//        System.out.println("Enter second value");
//        int ValueB = sc.nextInt();
//
//        Calculator2 obj = new Calculator2();
//        obj.a=ValueA;
//        obj.b=ValueB;
//
//        obj.methodAdd();
//        obj.methodSubtract();
//        obj.methodMultiply();
//        obj.methodDivision();
//    }
//}


import java.util.Scanner;
public class Calculator2 {
    float a,b;

    public void methodAdd(){
        float ValueA=a;
        float ValueB=b;
        float result=a+b;
        System.out.println(result);
    }

    public void methodSubtract(){
        float ValueA=a;
        float ValueB=b;
        float result=a-b;
        System.out.println(result);
    }

    public void methodMultiply(){
        float ValueA=a;
        float ValueB=b;
        float result=a*b;
        System.out.println(result);
    }

    public void methodDivision(){
        float ValueA=a;
        float ValueB=b;
        float result=a/b;
        System.out.println(result);
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        float ValueA = sc.nextFloat();
        System.out.println("Enter second value");
        float ValueB = sc.nextFloat();

        Calculator2 obj = new Calculator2();
        obj.a=ValueA;
        obj.b=ValueB;

        obj.methodAdd();
        obj.methodSubtract();
        obj.methodMultiply();
        obj.methodDivision();
    }
}
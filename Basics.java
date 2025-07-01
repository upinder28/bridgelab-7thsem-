public class Basics {

    public void myMethod(){
        int x = 1;
        int y = 2;
        int q = x + y;
        System.out.println(q);
    }

    public static void main(String[] args){
        // Create an object of the class
        Basics obj = new Basics();

        // Call the method using the object
        obj.myMethod();
    }

}
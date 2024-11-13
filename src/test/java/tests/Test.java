package tests;

public class Test {

    public int Add(int a , int b) {

        int result = (a + b);

        return result;
    }
    public static void main(String[] args) {
        Test sum = new Test();
        System.out.println("Sum is : " +sum.Add(4,6));
    }
}

package Assignment2;

public class ternaryOperator
{
    public static void main(String[] args)
    {

        // variable declaration
        int n1 = 5, n2 = 10, max, min;
        max = (n1 > n2) ? n1 : n2;

        // Print the n1 > n2 is false, print n2 : 10
        System.out.println("Max is = " + max);

        min = (n1 < n2) ? n1 : n2;

        // Print the n1 < n2 is true , print n1 : 5
        System.out.println("Min is = " + min);
    }
}

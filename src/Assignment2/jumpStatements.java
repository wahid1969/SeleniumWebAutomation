package Assignment2;

public class jumpStatements
{
    public static void main(String[] args)
    {
        System.out.println("===========Break Statement (Break point : 5 =====");
        // break statement
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
            System.out.println("===========Continue Statement Continue Point : 5 =====");
            // break statement
            for (int j = 1; j <= 10; ++j) {

                // if the value of i is 5 the loop terminates
                if (j == 5) {
                    continue;
                }
                System.out.println(j);

            }


    }
}

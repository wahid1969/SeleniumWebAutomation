package Assignment2;

public class decisionMaking
{
    public static void main(String[] args)
    {
        // variable declaration
        int n1 = 5, n2 = 10;

        // If statement
        if (n1>0) {
            System.out.println("The condition is true ");
        }
        // If and else statement
        if (n1<0) {
            System.out.println("The condition is false, not print this ");
        }
        else
        {
            System.out.println("System print the else block ");
        }

        //if-else-if ladder
        // initializing expression
        int i = 20;

        // condition 1
        if (i == 10)
            System.out.println("i is 10\n");

            // condition 2
        else if (i == 15)
            System.out.println("i is 15\n");

            // condition 3
        else if (i == 20)
            System.out.println("i is 20\n");

        else
            System.out.println("i is not present\n");

        System.out.println("Outside if-else-if ladder");

        //Nested if-statement
        int a=10;
        int b=20;

        if(a==10){

            if(b!=20){
                System.out.println("b is 20");
            }

            else{
                System.out.println("a is 10");
            }
            System.out.println("Outside Nested if-statement");
        }
        //Switch Statement
        int day = 5;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
            // Outputs "Looking forward to the Weekend"
    }
}

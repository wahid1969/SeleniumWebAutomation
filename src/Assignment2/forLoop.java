package Assignment2;

public class forLoop
{
    public static void main (String[] args)
    {
        //for loop
        System.out.println("=========for loop=====");
        for (int i=0;i<=5;i++)
        {
            System.out.println(i);
        }
        //java for loop
        System.out.println("============Java for loop=======");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // iterating through an array using a for loop
        for (int i = 0; i < vowels.length; ++ i) {
            System.out.println(vowels[i]);
        }
        System.out.println("============for each loop=======");
        // create an array
        int[] numbers = {3, 9, 5,11,23,35, -5};

        // for each loop
        for (int number: numbers) {
            System.out.println(number);
        }

        System.out.println("============while loop=======");
        // initialization expression
        int i = 1;

        // test expression
        while (i < 6)
        {
            System.out.println("i is : " + i);

            // update expression
            i++;
        }
        //do loop
        System.out.println("=========do loop=====");
        int j=0;
        do
        {
            System.out.println("j is : " + j);
            j++;
        }while(j<=6);

    }

}

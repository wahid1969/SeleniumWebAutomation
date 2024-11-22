package Assignment1;

public class orgEmployee
{
    //variable
    String empName;
    int empAge;
    boolean empMaile; //maile is true and female is false

    //default Constructor
    orgEmployee(){}

    //Method
    public static void display(String name, int age)
    {

        System.out.println("My name is " + name);
        System.out.println("My Age is " + age);
    }
    //Main method and calling a declared method
    public static void main(String [] arg) {
        // Calling the method
        display("Abdul Kader Mollah", 27);
    }

}

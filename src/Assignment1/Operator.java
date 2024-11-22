package Assignment1;

public class Operator
{
    public static void main(String[] arg)
    {
        //    Unary Operator: expr++ expr-- ++expr --expr
        System.out.println("===============Unary Operator===============");
        int expr=30;
        System.out.println("The Value is : " + expr++);  //show 30 30+1=31
        System.out.println("The Value is : " + ++expr);  //31+1=32 show 32
        System.out.println("The Value is : " + expr--);  //show 32 32-1=31
        System.out.println("The Value is : " + --expr);  //31-1=30 Show 30
        //    Arithmetic Operator: * / % + -
        System.out.println("===============Arithmetic Operator===============");
        int mVar=10;
        System.out.println("The * Value is : " + (mVar*5)); //show 10*5=50
        System.out.println("The / Value is : " + (mVar/5)); //show 10/5=2
        System.out.println("The % Value is : " + (mVar%6)); //show 10%6=4
        System.out.println("The + Value is : " + (mVar+30)); //show 10+30=40
        int mVar2=30;
        System.out.println("The Value is : " + (mVar2 - mVar)); //show 30-10=20
        //    Relational Operator: < > <= >= instanceof == !=
        System.out.println("===============Relational Operator===============");
        int var1 = 5, var2 = 10, var3 = 5;
        // Comparing var1 and var2 and printing corresponding boolean value
        System.out.println("var1 < var2 : " + (var1 < var2));  //true
        System.out.println("var1 > var2 : " + (var1 > var2));  //false
        System.out.println("var1 <= var2 : " + (var1 <= var2));  //true
        System.out.println("var1 >= var2 : " + (var1 >= var2));  //false
        Operator s = new Operator();
        System.out.println("var1 instanceof var2: " + (s instanceof Operator));  //true
        System.out.println("var1 == var2 : " + (var1 == var2));  //false
        System.out.println("var1 != var2 : " + (var1 != var2));  //true
        //    Logical Operator: && ||
        int x = 5;
        System.out.println("x > 3 && x < 10 : " + (x > 3 && x < 10)); // returns true because 5 is greater than 3 AND 5 is less than 10
        System.out.println("x > 3 || x < 4 : " + (x > 3 || x < 4)); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
        System.out.println("!(x > 3 && x < 10) : " + (!(x > 3 && x < 10))); // returns false because ! (not) is used to reverse the result
    }
}

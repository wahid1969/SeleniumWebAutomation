package Assignment2;

public class bracitEmployee
{
    int age;
    String name;
    bracitEmployee()
    {

    }
    bracitEmployee(int age)
    {
        this.age=age;
    }
    bracitEmployee(String name)
    {
        this.name=name;
    }
    bracitEmployee(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void Display()
    {
        if (this.name!=null) {
            System.out.println("Employee Name is : " + this.name);
        }
        if (this.age>0) {
            System.out.println("Employee Age is : " + this.age);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("======Show only Age=========");
        bracitEmployee aEmp = new bracitEmployee(30);
        aEmp.Display();
        System.out.println("======Show only Name=========");
        bracitEmployee nEmp = new bracitEmployee("Wahiduzzaman");
        nEmp.Display();
        System.out.println("======Show Name and Age=========");
        bracitEmployee naEmp = new bracitEmployee("Hiro Mia",18);
        naEmp.Display();

    }
}

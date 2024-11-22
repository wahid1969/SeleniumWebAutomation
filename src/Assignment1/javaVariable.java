package Assignment1;

public class javaVariable
{
    static int mBasic=10000;//static variable
    public static void HouseRent(int hRent)
    {
        int lhRent=hRent;//local variable
        System.out.println("House Rent : "+lhRent);
    }
    public static void main(String[] args)
    {
        int mAllowance=5000;//instance variable
        System.out.println("Basic : " +mBasic);
        HouseRent(8500);
        System.out.println("Medicale Allowance : "+mAllowance);
    }
}

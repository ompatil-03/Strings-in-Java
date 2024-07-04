package Test6;

public class exception {
    public void checkeligible(int age,int n,int n2)throws  CustomEligibleBlood
    {
        if(age<18 || age>60)
        {
            throw new  CustomEligibleBlood("Your "+age+" age is NOT eligible for blood donation.");
        }
        else
        {
            System.out.println("Your "+age+" age is  eligible for blood donation.");
        }
    }
    public static void main(String[] args)  {
        int age=15;
        int n=18;
        int n2=60;
        exception obj=new exception();
        try
        {
            obj.checkeligible(age, n, n2);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}

class  CustomEligibleBlood extends Exception
{
    CustomEligibleBlood(String msg)
    {
        super(msg);
    }
}

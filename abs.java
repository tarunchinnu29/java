package pack;

 abstract class abs {
    void sum()
    {

    }
    
}
class add extends abs{
    void sum()
    {
        int a=10,b=20;
        System.out.println("sum of two numbers is:"+(a+b));
    }

    }
class test
{
    public static void main (String args[])
    {
add hello=new add();
hello.sum();
    }
}
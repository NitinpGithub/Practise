package P1;

public class Methods
{
    int add(int a,int b)
    {
        int c = a+b;
        return c;
    }

    int min(int a,int b)
    {
        int c = a-b;
        return c;
    }

    float div(float a,float b)
    {
        float c = a/b;
        return c;
    }

    int mul(int a,int b)
    {
        int c = a*b;
        return c;
    }

    public static void main(String[] args)
    {
        Methods m1 = new Methods();
        System.out.println("Addition is - "+m1.add(10,20));
        System.out.println("Subtraction is - "+m1.min(40,10));
        System.out.println("Division is - "+m1.div(10,4));
        System.out.println("Multiplication is - "+m1.mul(5,8));
    }
}

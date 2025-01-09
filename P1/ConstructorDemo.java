package P1;

public class ConstructorDemo
{
    public static void main(String[] args)
    {
        Human1 h1= new Human1("Nitin",34);
        h1.talk("Hello!");
    }
    static class Human1
    {
        String name;
        int age;

        Human1(String name,int age)
        {
            this.name=name;
            this.age=age;
        }
        void talk(String content)
        {
            System.out.println(content+" - "+ name +"-"+age);
        }
    }
}
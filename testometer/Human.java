package testometer;

public class Human {
    int i;
    String s;
    double d;
    boolean b;
    long l;
    short sh;
    char c;
    float f;

    public static void main(String[] args) {

        Human human = new Human();
        System.out.println("int  - "+human.i);
        System.out.println("string  - "+human.s);
        System.out.println("double  - "+human.d);
        System.out.println("boolean  - "+human.b);
        System.out.println("long  - "+human.l);
        System.out.println("short  - "+human.sh);
        System.out.println("char  - "+human.c);
        System.out.println("float  - "+human.f);

    }
}

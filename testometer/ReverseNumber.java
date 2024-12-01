package testometer;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 62345;
        int reminder=0;
        int reverse=0;

/*
        reminder=number%10;
        reverse=reminder+(reverse*10);
        number=number/10;

        reminder=number%10;
        reverse=reminder+(reverse*10);
        number=number/10;

        reminder=number%10;
        reverse=reminder+(reverse*10);
        number=number/10;

        reminder=number%10;
        reverse=reminder+(reverse*10);
        number=number/10;

        reminder=number%10;
        reverse=reminder+(reverse*10);
        number=number/10;
        */
        while(number>0)
        {
            reminder=number%10;
            reverse=reminder+(reverse*10);
            number=number/10;
        }

        System.out.println(reverse);

    }
}

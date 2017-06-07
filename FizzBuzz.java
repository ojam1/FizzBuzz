package com.ojam1;

class FizzBuzz
{
    static void fizzBuzzer(int x)
    {
        if (fizzBuzzChecker(x)) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else System.out.println("Buzz");
        } else if (fizzBuzzChecker2(x));
        else System.out.println(x);
    }

    private static boolean fizzBuzzChecker2 (int x)
    {
        boolean found = false;
        int count = 0;
        String s = "";
        String intAsString = Integer.toString(x);
        for (int i=0; i<intAsString.length();i++)
        {

            if (intAsString.charAt(i)=='3')
            {
                s = "Fizz";
                found = true;
                count++;
            } else if (intAsString.charAt(i)=='5')
            {
                s = "Buzz";
                found = true;
                count++;
            }

        } if (count==2)
    {
        s = "FizzBuzz";
    }
        System.out.println(s);
        return found;
    }

    private static boolean fizzBuzzChecker(int x)
    {
        return (x % 3 == 0 || x % 5 == 0);
    }
}

class Main
{
    public static void main(String[] args)
    {
        for (int i = 1;i<=100;i++)
        {
            FizzBuzz.fizzBuzzer(i);
        }
    }
}
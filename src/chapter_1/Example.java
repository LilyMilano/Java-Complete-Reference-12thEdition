package chapter_1;

public class Example {
    public static void main(String[] args) {
        System.out.println("This is a simple Java program");

        // Variables:
        int num; // this declares a variable called num
        num = 100; // this assigns num the value 100
        System.out.println("This is num: " + num);

        num *= 2;
        System.out.print("The value of num * 2 is ");
        System.out.println(num);

        // If statement sample:
        int x, y;
        x = 10;
        y = 20;

        if(x < y)
            System.out.println("x is less than y");

        x *= 2;
        if(x == y)
            System.out.println("x now equal to y");

        x *= 2;
        if(x > y)
            System.out.println("x now greater than y");

        // this won't display anything
        if(x == y)
            System.out.println("you will not see this");

        // For loop test:
        int i;  // Control loop variable
        for(i = 0; i < 10; i++)
            System.out.println("This is i: " + i);
        /*
        This is i: 0
        This is i: 1
        This is i: 2
        This is i: 3
        This is i: 4
        This is i: 5
        This is i: 6
        This is i: 7
        This is i: 8
        This is i: 9
        */

        int a, b;
        b = 20;
        // the target of this loop is a block
        for(a = 0; a < 10; a++) {
            System.out.println("This is a: " + a);
            System.out.println("This is b: " + b);
            b -= 2;
        }
        /*
        This is a: 0
        This is b: 20
        This is a: 1
        This is b: 18
        This is a: 2
        This is b: 16
        This is a: 3
        This is b: 14
        This is a: 4
        This is b: 12
        This is a: 5
        This is b: 10
        This is a: 6
        This is b: 8
        This is a: 7
        This is b: 6
        This is a: 8
        This is b: 4
        This is a: 9
        This is b: 2
        */

    }
}

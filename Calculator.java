import java.util.*;
public class Calculator {
    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);
        int choice;
        System.out.println("Main Menu");
        System.out.println("------------");
        System.out.println("Linear");
        System.out.println("Quadratic");
        System.out.println("Cubic");
        System.out.println("Prime Number Check");

        double y = 0;

        choice = keyb.nextInt();
        if (choice == 1) { // Linear mode

            System.out.print("Enter a slope (m) ");
            Scanner mvalue = new Scanner(System.in);
            int m = mvalue.nextInt();
            System.out.print("Enter a y-intercept (b) ");
            Scanner yintvalue = new Scanner(System.in);
            int yint = yintvalue.nextInt();

            Scanner intkeyb = new Scanner(System.in);
            System.out.print("Enter x1: ");
            double x1 = intkeyb.nextDouble();
            System.out.print("Enter x2: ");

            double x2 = intkeyb.nextDouble();
            double x = x1;

            System.out.println(" x   |   y ");
            System.out.println("-----------");

            while (x <= x2) {
                y = (m * x + yint);
                System.out.println(x + " | " + y);
                x++;
            }


        } else if (choice == 2) { //Quadratic mode

            System.out.print("Enter an a value");
            Scanner avalue = new Scanner(System.in);
            int a = avalue.nextInt();

            System.out.print("Enter a b value");
            Scanner bvalue = new Scanner(System.in);
            int b = bvalue.nextInt();

            System.out.print("Enter a c value");
            Scanner cvalue = new Scanner(System.in);
            int c = cvalue.nextInt();

            Scanner intkeyb = new Scanner(System.in);
            System.out.print("Enter x1: ");
            double x1 = intkeyb.nextDouble();
            System.out.print("Enter x2: ");

            double x2 = intkeyb.nextDouble();
            double x = x1;

            System.out.println(" x   |   y ");
            System.out.println("-----------");

            while (x <= x2) {
                y = ((a * Math.pow(x, 2)) + (b * x) + c);
                System.out.println(x + " | " + y);
                x++;

            }

        } else if (choice == 3) { // Cubic mode
            System.out.print("Enter an a value");
            Scanner avalue = new Scanner(System.in);
            int a = avalue.nextInt();

            System.out.print("Enter a b value");
            Scanner bvalue = new Scanner(System.in);
            int b = bvalue.nextInt();

            System.out.print("Enter a c value");
            Scanner cvalue = new Scanner(System.in);
            int c = cvalue.nextInt();

            System.out.print("Enter a d value");
            Scanner dvalue = new Scanner(System.in);
            int d = dvalue.nextInt();

            Scanner intkeyb = new Scanner(System.in);
            System.out.print("Enter x1: ");
            double x1 = intkeyb.nextDouble();
            System.out.print("Enter x2: ");

            double x2 = intkeyb.nextDouble();
            double x = x1;

            System.out.println(" x   |   y ");
            System.out.println("-----------");

            while (x <= x2) {
                y = ((a * Math.pow(x, 3)) + (b * Math.pow(x, 2) + (c * x) + d));
                System.out.println(x + " | " + y);
                x++;
            }

            if (y < 10) {
                System.out.println("The value is low");
            } else if (y < 20) {
                System.out.println("The value is medium");
            } else {
                System.out.println("The value is high");
            }
        }else if(choice == 4){ // Prime check mode
            Scanner prime = new Scanner(System.in);
            double num;
            System.out.print("Enter a number to check for primeness: ");
            num = prime.nextInt();

            double p = 2;
            boolean isprime = true;

            while (p<num) {
                if (num % p == 0) {
                    isprime = false;
                }
                p++;
            }

            if (isprime==true)
                System.out.println("This number is prime");
            else
                System.out.println("The number is not prime");
        }
    }
}
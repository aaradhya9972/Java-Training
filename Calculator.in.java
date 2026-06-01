import java.util.Scanner;

class hello
{   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter 1st number : ");
        double num1 = sc.nextDouble();

        
        System.out.print("Enter 2nd number : ");
        double num2 = sc.nextDouble();

        
        System.out.print("Enter operator (+, -, *, /) : ");
        char op = sc.next().charAt(0);

        
        if (op == '+')
        {
            System.out.println("Result : " + (num1 + num2));
        }
        else if (op == '-')
        {
            System.out.println("Result : " + (num1 - num2));
        }
        else if (op == '*')
        {
            System.out.println("Result : " + (num1 * num2));
        }
        else if (op == '/')
        {
            if (num2 == 0)
                System.out.println("Error : Cannot divide by zero!");
            else
                System.out.println("Result : " + (num1 / num2));
        }
        else
        {
            System.out.println("Error : Invalid operator!");
        }

        sc.close();
    }
}
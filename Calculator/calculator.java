import java.util.*;

public class calculator {
    public static void main(String[] args) { 

        Scanner in = new Scanner(System.in);

        int press = 111;

        while(press != 0)
        {
            System.out.println("\n::::WELCOME::TO::FUN::CALCULATION:::\n");
                
            System.out.println("press - 1 - simple calculation");
            System.out.println("press - 2 - AREA");
            System.out.println("press - 3 - DISCOUNT");
            System.out.println("press - 4 - VOLUME");
            System.out.println("press - 5 - GST");
            System.out.println("press - 6 - BMI");
            System.out.println("press - 7 - DATA");
            System.out.println("press - 8 - LENGTH");
            System.out.println("press - 9 - TEMPERATURE");
            System.out.println("press - 0 - EXIT");

            press = (int)in.nextInt();

            switch(press)
            {   case 0:
                    System.out.println("\n:::THANK::YOU::VISIT::AGAIN:::\n");
                     break;
                case 1:
                    simple.calculation();
                    break;
                case 2:
                    Area.area();
                    break;
                case 3:
                    System.out.println("You Enterd 3");
                    break;                
                case 4:
                    System.out.println("You Enterd 4");
                    break;
                case 5:
                    System.out.println("You Entered 5");
                    break;
                case 6:
                    System.out.println("You Enter 6");
                    break;
                case 7:
                    System.out.println("You Entered 7");
                    break;
                case 8:
                    System.out.println("You Entered 8");
                    break;
                case 9: 
                    System.out.println("You Enterd 9");
                    break;
                default :
                    System.out.println("\n***INVAL ID KEY PRESSED, TRY AGAIN***\n");
                    break;
            }

             in.close();
            
        }
        
    }
    




class simple
{
    

    static void calculation()
    {  
        Scanner in = new Scanner(System.in);
            
            
            
        while(true)
        {   System.out.println("\n<choose operation>\n");
            System.out.println("press - 1 - Addition");
            System.out.println("press - 2 - Subtraction");
            System.out.println("press - 3 - Multiplication");
            System.out.println("press - 4 - Division");
            System.out.println("press - 5 - Square");
            System.out.println("press - 6 - Percentage");
            System.out.println("press - 0 - Exit");

            int press = (int)in.nextInt();
            

            switch(press)
            {   case 0:                   
                    return;
                
                case 1:
                    Addition.add();
                    break;
                case 2:
                    Subtraction.subtract();
                break;
                case 3:
                    Multiplication.multiply();
                break;
                case 4:
                    Division.divide();
                    break;
                case 5:
                    Square.square();
                    break;
                case 6:
                    Percentage.percent();
                    break;
                default:
                    System.out.println("Invalid Entery. try again");
                    break;
            }
            in.close();
        }
    }

}

class Addition
{
    static void add()
    {   Scanner in = new Scanner(System.in);

        
        System.out.print("\n<How name numbers do want to add? : >");
        int num = (int)in.nextInt();
        long total = 0l;

        long arr[] = new long[num];
        for(int i =0; i < num; i++)
        {   System.out.print("Enter value : ");
            arr[i] = in.nextLong();
            total += arr[i];
        }

        System.out.println("\nFinal Sum = " + total + "\n");
         
        in.close();
    }
}

class Subtraction
{
    static void subtract()
    {   Scanner in = new Scanner(System.in);

        
        System.out.print("\n<Let me know the numbers : >\n");
        long num1 = (long)in.nextLong();
        long num2 = (long)in.nextLong();
        long total = num1 - num2;

        

        System.out.println("\nFinal Answer = " + total + "\n");

        in.close();
    }
}


class Division 
{
    static void divide()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("\n<Let me know divisor and divident>\n");
        
        System.out.print("Divident : ");
        int divident = (int)in.nextInt();
        System.out.print("Divisor : ");
        int divisor = (int)in.nextInt();

        int quatioent = divident / divisor;
        int remainder = divident % divisor;
        System.out.print("\nYour Quatioent  : " + quatioent);
        System.out.println("\nAnd Remainder   : " + remainder);
        in.close();
    }
}

class Multiplication
{
    static void multiply()
    {   
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Values : ");
        int num1 = (int)in.nextInt();
        int num2 = (int)in.nextInt();
        int product = num1 * num2;

        System.out.println("\nProduct : " + product);
        in.close();
    }
}

class Square
{
    static void square()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Youe Number : ");
        int num = (int)in.nextInt();
        long sqr = num * num;
        System.out.println("\n Square : " + sqr);
        in.close();
    }
}

class Percentage
{
    static void percent()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        float num =(float) in.nextInt();
        float perce = num / 100;
        in.close();

        System.out.printf("\n1 Percent of %.0f : %f \n", num, perce);
    }
}

class Area
{
    static void area()
    {
        System.out.println("\n<Whose area do you want to find>");
        System.out.println("press - 1 - circle");
        System.out.println("press - 2 - square");
        System.out.println("press - 4 - rectangle");
        System.out.println("press - 5 - triangle");
        System.out.println("press - 6 - trapezium");

        Scanner in = new Scanner(System.in);

        int press = (int)in.nextInt();

        switch(press)
        {
            case 1 :
                Circle.circleArea();
                break;
            case 2 :
                SSquare.squareArea(); 
                break;
            default:
                System.out.println("Invalid entery, try again");
        }

        in.close();
    }

    


}

class Circle 
{
    static void circleArea()
    {
        System.out.print("\nLet me know Radius of the circle : ");

        Scanner in = new Scanner(System.in);
        float radius = (float)in.nextFloat();

        double area = ( 3.14 * radius );

        System.out.println("\nArea of circle with " + radius + " unit radius : " + area + " unit square\n");

        in.close();
    }
}

class SSquare 
{
    static void squareArea()
    {
        System.out.print("Enter the measurement of side : ");
        Scanner input = new Scanner(System.in);

        int side = (int)input.nextInt();

        System.out.println("The area of Square : " + side * side + " suare unit");
        input.close(); 
    }
}
}
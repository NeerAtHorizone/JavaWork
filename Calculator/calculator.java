import java.util.Scanner;

class Scan
{
    static int choose()
    {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        
        return num;
    }
}
public class calculator {
    public static void main(String[] args) { 


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

            press = Scan.choose();

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

            
        }
        
    }
    




class simple
{
    

    static void calculation()
    {  
            
            
            
        while(true)
        {   System.out.println("\n<choose operation>\n");
            System.out.println("press - 1 - Addition");
            System.out.println("press - 2 - Subtraction");
            System.out.println("press - 3 - Multiplication");
            System.out.println("press - 4 - Division");
            System.out.println("press - 5 - Square");
            System.out.println("press - 6 - Percentage");
            System.out.println("press - 0 - Exit");

            int press = Scan.choose();
            

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
             
        }
    }

}

class Addition
{
    static void add()
    {
        
        System.out.print("\n<How name numbers do want to add? : >");
        int num = Scan.choose();
        long total = 0l;

        long arr[] = new long[num];
        for(int i =0; i < num; i++)
        {   System.out.print("Enter value : ");
            arr[i] = Scan.choose();
            total += arr[i];
        }

        System.out.println("\nFinal Sum = " + total + "\n");
         
        
    }
}

class Subtraction
{
    static void subtract()
    {    

        
        System.out.print("\n<Let me know the numbers : >\n");
        long num1 =  Scan.choose();
        long num2 =  Scan.choose();
        long total = num1 - num2;

        

        System.out.println("\nFinal Answer = " + total + "\n");

         
    }
}


class Division 
{
    static void divide()
    {
         

        System.out.println("\n<Let me know divisor and divident>\n");
        
        System.out.print("Divident : ");
        int divident =  Scan.choose();
        System.out.print("Divisor : ");
        int divisor =  Scan.choose();

        int quatioent = divident / divisor;
        int remainder = divident % divisor;
        System.out.print("\nYour Quatioent  : " + quatioent);
        System.out.println("\nAnd Remainder   : " + remainder);
         
    }
}

class Multiplication
{
    static void multiply()
    {   
         
        System.out.println("Enter the Values : ");
        int num1 = Scan.choose();
        int num2 = Scan.choose();
        int product = num1 * num2;

        System.out.println("\nProduct : " + product);
         
    }
}

class Square
{
    static void square()
    {
         
        System.out.print("\nEnter Youe Number : ");
        int num = Scan.choose();
        long sqr = num * num;
        System.out.println("\n Square : " + sqr);
         
    }
}

class Percentage
{
    static void percent()
    {
         
        System.out.print("\nEnter the Number : ");
        float num =(float) Scan.choose();
        float perce = num / 100;
         

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

         

        int press = Scan.choose();

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

         
    }

    


}

class Circle 
{
    static void circleArea()
    {
        System.out.print("\nLet me know Radius of the circle : ");

         
        float radius = (float)Scan.choose();

        double area = ( 3.14 * radius );

        System.out.println("\nArea of circle with " + radius + " unit radius : " + area + " unit square\n");

         
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
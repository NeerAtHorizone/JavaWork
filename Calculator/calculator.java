import java.util.Scanner;

class Scan {
    static int choose(int argu) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        return num;
    }

    static long choose(long argu) {
        long num;
        Scanner input = new Scanner(System.in);

        num = input.nextLong();

        return num;
    }
    static float choose(float argu)
    {
        float num ;
        Scanner input = new Scanner(System.in);

        num = input.nextFloat();
        return num;
    }
    static double choose(double argu)
    {
        Scanner input = new Scanner(System.in);

        double num = input.nextDouble();

        return num;
    }

}

public class calculator {
    public static void main(String[] args) {

        int press = 111;

        while (press != 0) {
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

         
            press = Scan.choose(1);

            switch (press) {
                case 0:
                    System.out.println("\n:::THANK::YOU::VISIT::AGAIN:::\n");
                    break;
                case 1:
                    simple.calculation();
                    break;
                case 2:
                    Area.area();
                    break;
                case 3:
                    Discount.count();
                    break;
                case 4:
                    Volume.vol();
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
                default:
                    System.out.println("\n***INVAL ID KEY PRESSED, TRY AGAIN***\n");
                    break;
            }

        }

    }
}

class simple {

    static void calculation() {

        while (true) {
            System.out.println("\n<choose operation>\n");
            System.out.println("press - 1 - Addition");
            System.out.println("press - 2 - Subtraction");
            System.out.println("press - 3 - Multiplication");
            System.out.println("press - 4 - Division");
            System.out.println("press - 5 - Square");
            System.out.println("press - 6 - Percentage");
            System.out.println("press - 0 - Exit");
            
            int press = Scan.choose(1);

            switch (press) {
                case 0:
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

class Addition {
    static void add() {

        System.out.print("\n\t<How name numbers do want to add? : >");
        int num = Scan.choose(1);
        long total = 0l;
        
        long arr[] = new long[num];
        for (int i = 0; i < num; i++) {
            System.out.print("\tEnter value : ");
            arr[i] = Scan.choose(1l);

            total += arr[i];
        }

        System.out.println("\n\tFinal Sum = " + total + "\n");

    }
}

class Subtraction {
    static void subtract() {
        

    System.out.print("\n\tFirst Number  :");
        long num1 = Scan.choose(1l);
        System.out.print("\tSecond Number :");
        long num2 = Scan.choose(1l);
        long total = num1 - num2;

        System.out.println("\n\tFinal Answer = " + total + "\n");

    }
}

class Division {
    static void divide() {

        System.out.print("\n\tNumerator   : ");
        int divident = Scan.choose(1);
        System.out.print("\tDenominator : ");
        int divisor = Scan.choose(1);
        if (divisor == 0) {
            System.out.println("Cann't Divide with 0");

        } else {
            int quatioent = divident / divisor;
            int remainder = divident % divisor;
            System.out.print("\n\t Quatioent  : " + quatioent);
            System.out.println("\t Remainder   : " + remainder);
        }

    }
}

class Multiplication {
    static void multiply() {
        
        System.out.println("\n\tEnter the Values : ");
        int num1 = Scan.choose(1);
        int num2 = Scan.choose(1);
        int product = num1 * num2;

        System.out.println("\nProduct : " + product);

    }
}

class Square {
    static void square() {
        

        System.out.print("\n\tEnter Youe Number : ");
        int num = Scan.choose(1);
        long sqr = num * num;
        System.out.println("\n\tSquare : " + sqr);

    }
}

class Percentage {
    static void percent() {
        
        System.out.print("\n\tEnter the Number : ");
        float num =  Scan.choose(1.0f);
        float perce = num / 100;

        System.out.printf("\n\t1 Percent of %.0f : %f \n", num, perce);
    }
}

class Area {
    static void area() {
        while (true) {
            System.out.println("\n<Whose area do you want to find>");
            System.out.println("press - 0 - Exit");
            System.out.println("press - 1 - circle");
            System.out.println("press - 2 - square");
            System.out.println("press - 3 - triangle");
            System.out.println("press - 4 - rectangle");
            System.out.println("press - 5 - triangle");
            System.out.println("press - 6 - trapezium");

           
            int press = Scan.choose(1);

            switch (press) {
                case 0:
                    return;
                case 1:
                    Circle.circleArea();
                    break;
                case 2:
                    SSquare.squareArea();
                    break;
                case 3:
                    Triangle.triangleArea();
                    break;
                case 4:
                    Rect.rectangleArea();
                    break;
                
                default:
                    System.out.println("\n\tInvalid entery, try again\n");
            }
        }

    }

}

class Circle {
    static void circleArea() {
        System.out.print("\n\tRadius : ");

        
        float radius =  Scan.choose(1.0f);

        double area = (3.14 * radius);

        System.out.println("\n\tArea of circle with " + radius + " unit radius : " + area + " unit square\n");

    }
}

class SSquare {
    static void squareArea() {
        System.out.print("\n\tEnter the measurement of side : ");
        

        int side = Scan.choose(1);

        System.out.println("\n\tThe area of Square : " + side * side + " suare unit");

    }
}

class Rect {
    static void rectangleArea() {
        int length, width;
        long area;

        System.out.print("\n\tEnter Legth :");
        length = Scan.choose(1);
        System.out.print("\tEnter Width   : ");
        width = Scan.choose(1);

        area = length * width;

        System.out.println("\n\tThe Area of Rectangle is : " + area + " sq. unit");

    }
}

class Triangle {

    static void triangleArea() {
        int base, hieght;

        System.out.print("\n\tEnter Base   : ");
        base = Scan.choose(1);
        System.out.print("\tEnter Hieght : ");
        hieght = Scan.choose(1);

        double area = (0.5) * hieght * base;

        System.out.println("\n\tThe Area of Triangel : " + area + " sq. unit\n");
    }
}


class Discount 
{
    static void count()
    {   
        System.out.print("Enter Orignal Price : ");

        double orignalPrice = Scan.choose(1.0);
        System.out.print("Enter Discount ( % Off) :");
        double disc = Scan.choose(1.0);
        
        double discPrice = orignalPrice/disc;

        double finalPrice = orignalPrice - discPrice;
        System.out.println("Final Price : " + finalPrice);
        
    }
}

class Volume
{
    static void vol()
    {
        while(true)
        {
            System.out.println("Enter Your choice");
            System.out.println("press - 0 - Exist");
            System.out.println("press - 1 - Prism");
            System.out.println("press - 2 - Cone");
            System.out.println("press - 3 - Pyramid");
            System.out.println("press - 4 - Sphere");

            int press = Scan.choose(1);

            switch(press)
            {
                case 0 :
                    return;
                case 1 :
                    Prism.volume();
                    break;
                case 2 : 
                    Cone.volume();
                    break;
                case 3 :
                    Pyramid.volume();
                    break;
                case 4 : 
                    Sphere.volume();
                    break;
                default :
                    System.out.println("\n\tEntered Invalid Choice, TRY AGAIN");
                    
            }
        }
    }
}


class Prism
{
    static void volume()
    {
        System.out.println("\nIn order to find out the volume of Prism, we require few measurments : Height, width, and Length");

        System.out.print("\tEnter Height : ");
        float height = Scan.choose(1.0f);
        System.out.print("\tEnter Width  : ");
        float Width = Scan.choose(1.0f);
        System.out.print("\tEnter Length : ");
        float length = Scan.choose(1.0f);

        double volumeOfPrism = height * Width * length;

        System.out.println("\tThe Volume Of Prism is : " + volumeOfPrism + " cubic unit\n");
    }
}

class Cone 
{
    static void volume()
    {
        System.out.print("\n\tRadius : ");
        float radius = Scan.choose(1.0f);
        System.out.print("\tHieght : ");
        float height = Scan.choose(1.0f); 

        double volumeOfCone = (0.33) * (3.14)*radius*radius*height;

        System.out.println("\n\tVolume of Cone : " + volumeOfCone +" cubic unit\n");
    }
}

class Pyramid 
{
    static void volume()
    {
        System.out.print("\n\tHeigth : ");
        float height = Scan.choose(1.0f);
          System.out.print("\tWidth  : ");
        float width = Scan.choose(1.0f);
          System.out.print("\tLenght : ");
        float length = Scan.choose(1.0f);

        double volumeOfPyramid = (0.33)*height*width*length;

        System.out.println("\n\tVolume of Pyramid : " + volumeOfPyramid + " cubic unit\n");

    }
}

class Sphere 
{
    static void volume()
    {
        System.out.print("\n\tRadius : ");
        float radius = Scan.choose(1.0f);

        double volumeOfSphere = 1.33 * 3.14 * radius * radius * radius;

        System.out.println("\tVolume of Sphere : " + volumeOfSphere + " cubic unit \n");
    }
}
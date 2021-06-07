import java.lang.Math;

public class Triangle {

    public static int perimeter(int a, int b, int c){
        return (a + b + c);
    }

    public static double area(int a, int b, int c){
        return Math.sqrt((a + b + c)/2 *((a + b + c)/2 -a)* ((a + b + c)/2- b) * ((a + b + c)/2 -c));
    }


    public static void main(String[] args){

        int p = Triangle.perimeter(3,4,5);
        double a =Triangle.area(3,4,5);
        System.out.println("The perimeter of Triangle is:  " + p);
        System.out.println("The perimeter of Aera is:  " + a);
    }
}


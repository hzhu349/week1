import java.lang.Math;

public class Triangle2{

    private int a;
    private int b;
    private int c;



    public Triangle2(int a, int b,int c){
        this.a =   a;
        this.b = b;
        this.c = c;
    }

    private int perimeter(){
        return (this.a + this.b + this.c);
    }

    private double area(){
        return Math.sqrt((this.a  + this.b  + this.c)/2 *((this.a  + this.b  + this.c)/2 -this.a )* ((this.a  + this.b  + this.c)/2- this.b ) * ((this.a  + this.b  + this.c)/2 -this.c));
    }

    private void display(){
        System.out.println("The perimeter of Triangle is:  " + perimeter());
        System.out.println("The perimeter of Aera is:  " + area());
    }



    public static void main(String[] args){
        Triangle2 triangle2 =new Triangle2(3, 4, 5);
        triangle2.display();
    }
}

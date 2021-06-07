public class Rectangle {
    private double a;
    private double b;




    public Rectangle(double a, double b){
        this.a =   a;
        this.b = b;

    }

    private double area(){
        return this.a * this.b;
    }

    private void display(){
        System.out.println("The area is " + area() + " with the sides of " + this.a + " and " + this.b + ".");
    }
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(4,5);
        rectangle1.display();
        Rectangle rectangle2 = new Rectangle(5,8);
        rectangle2.display();

    }

}

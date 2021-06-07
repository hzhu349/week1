public class Student {
    private String name;
    private int roll_no;




    public Student(String name, int roll_no){
        this.name =   name;
        this.roll_no = roll_no;
    }

    public void setAddress(String address){
        System.out.println(this.name + " address is " + address);
    }

    public void setPhoneNo(String PhoneNo){
        System.out.println(this.name + " phoneNo is " + PhoneNo);
    }


    public void display(){ System.out.println("THe name of student is "+ this.name + " and roll number is " + this.roll_no +".");}


    public static void main(String[] args){
        Student studentJohn = new Student("John",2);
        studentJohn.display();
        Student studentSam= new Student("Sam",3);
        studentSam.setAddress("1 st,apt 2");
        studentSam.setPhoneNo("123-445-6789");
        Student studentJohn4 = new Student("John",4);
        studentJohn4.setAddress("1 st,apt 9");
        studentJohn4.setPhoneNo("987-654-1230");
    }
}

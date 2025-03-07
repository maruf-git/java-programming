class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name,int age)
    {
        System.out.println("Student Constructor Called");
        this.name=name;
        this.age=age;
    }
}

public class OOPS {

    public static void main(String[] args) {
        System.out.println("hello");

        Pen Matador = new Pen();
        Matador.color="red";
        Matador.type="color pen";
        Matador.write();

        Pen Econo = new Pen();
        Econo.color="white";
        Econo.type="normal pen";
        Econo.write();

        Matador.printColor();
        Econo.printColor();

        Student s1 = new Student("Maruf",22);
        s1.printInfo();


    }
}

package OOPS;
import java.util.Scanner;
//creating new class
public class StudentClass {
    //creating new data type with multiple attributes   
    
    public static void change(Student s){
        s.name="rohan";
    }
    public static class Car{
        String name;
        String type;
        int price;
    }
    public static void main(String[] args) {
        Car c1= new Car();
        c1.name="porshe";
        c1.type="911";
        c1.price=11100001;

        Student s1= new Student("amit", 1, 98.0);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.percentage);

        Student s2= new Student("rahul", 67, 99);
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.percentage);
        // Scanner sc= new Scanner(System.in);
        // Student s1= new Student();
        // //initializing the objects
        // s1.name="rahul";
        // // s1.rollno=12;  //SINCE ITS PRIVATE
        // s1.setRoll(23);
        // System.out.println(s1.getRollno());
        // s1.percentage = 98.0;
        // System.out.println(s1.name);
        // //updation
        // s1.name="raghav";
        // System.out.println(s1.name);  //WILL CHANGE SINCE PASS BY VALUE
        // change(s1);
        // System.out.println(s1.name);  //WILL CHANGE SINCE CLASSES ARE PASSED BY REFERENCE TO THE FUCNTIONS 

        // Student s2= new Student();
        // s2.name="tina";
        // // s2.rollno=21;
        // s2.percentage=89.2;
    }
}

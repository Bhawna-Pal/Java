package Opps;

public class Constructors {
   public static void main(String[] args) {
     Student s1 = new Student();
     Student s2 = new Student("Bhawna");
     Student s3 = new Student(123);
    //Student s4 - new Student("Bhawna", 567);
   } 
}

class Student{
    String name ;
    int roll;
    
    // non peremeterized constructor
    Student(){
     System.out.println("Constructor is called...");
    }

    // parameterized constructor
    Student (String name) {
        this.name = name;
    }
    Student(int name) {
      this.roll = roll;
    }

}

public class inheritance {
    public static void main(String[] args) {
    //    fish shark = new fish(); 
    //    shark.eat();

    // Dog dobby = new Dog();
    //  dobby.eat();
    //  dobby.legs = 4;
    //  System.out.println(dobby.legs);
    }
}

// Base class
class Animal{
    String color;

    void eat (){
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("breathe");
    }

}

   class Mammal extends Animal {
    // int legs;
    void walk(){
        System.out.println("walks");
    }
   }

//    class Dog extends Mammal {
//     String breed;
//    }

class Fish extends Animal {
    void swims(){
        System.out.println("swims");
    }
    class Bird extends Animal {
        void fly(){
            System.out.println("fly");
        }
    }
}


// Derived Class / subClass
class fish extends Animal{
    int fins;

    void swims(){
        System.out.println("swims in water");
    }
}
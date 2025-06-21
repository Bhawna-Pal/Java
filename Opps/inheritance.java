package Opps;

public class inheritance {
    public static void main(String[] args) {
       fish shark = new fish(); 
       shark.eat();
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

class fish extends Animal{
    int fins;

    void swims(){
        System.out.println("swims in water");
    }
}
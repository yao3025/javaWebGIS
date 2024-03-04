 package mainStorage;

import mainStorage.entities.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("this is main function\n========");
        Animal Dog=new Animal(7);
        Dog.sayAge();;
    }
}
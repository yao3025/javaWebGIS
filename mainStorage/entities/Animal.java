package mainStorage.entities;

public class Animal {
    private int age;
    public Animal(){

    }

    public Animal(int age){
        this.age=age;
    }

    public void sayAge(){
        System.out.println("ma age is "+this.age+"\n========");
    }

    public void makeSound(){
        System.out.println("there goes a sharp sound!!!!!!\n========");
    }
}

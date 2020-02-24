package org.example.p13;

public class Pet {
    protected int strength;
    protected String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public int fight (Pet pet){
        if (this.getStrength() > pet.getStrength()) {
            System.out.println(this.getName() + " won, " + " " + pet.getName() + " lost.");
        } else if (this.getStrength() < pet.getStrength()) {
            System.out.println(pet.getName() + " won, " + this.getName() + " lost.");
        } else {
            System.out.println("There is draw between " + this.getName() + " and " + pet.getName() + ".");
        }
        return this.getStrength() > pet.getStrength() ? 1 : this.getStrength() < pet.getStrength() ? -1 : 0;
    }

    public void method (){
        System.out.println("Executing method in Pet");
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Pet {
    {
        strength = 2;
    }

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }


}

class Mouse extends Pet {
    {
        strength = 1;
    }

    public Mouse() {
    }

    public Mouse(String name) {
        super(name);
    }
}

class Dog extends Pet {
    {
        strength = 3;
    }

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }
}

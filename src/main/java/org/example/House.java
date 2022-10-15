package org.example;

public class House {
    public void personSalary(){
        System.out.println("People in this house are working: ");
    }
}

class Naomi extends House{
    @Override
    public void personSalary() {
        super.personSalary();
        System.out.println("Naomi earns "+ (19300 + (500*16)));
    }
}

class Collins extends House{
    @Override
    public void personSalary() {
        super.personSalary();
        System.out.println("Collins earns " + (20000 + (300 * 4)));
    }
}

package org.example;

import java.util.Scanner;

public interface Meals {
    public  void breakFirst();
    public  void lunch();
    public void  supper();
}
class MealsImpl implements  Meals{

    enum numbers{
        ONE,TWO,THREE,FOUR,FIVE, OTHER
    }
    @Override
    public void breakFirst() {
        System.out.println("BreakFast at 7:00am");
    }

    @Override
    public void lunch() {
        System.out.println("Lunch at 1:00pm");
    }

    @Override
    public void supper() {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number between 1 & 5");
        int x = sc.nextInt();
       SwitchName switchName = new SwitchName();
       switchName.Switch(x);

       System.out.println("End Of Program.\n======================= \n----------------------\n Supper at 7:00pm");
    }
}


class SwitchName{
    public void Switch(int value){
        switch (value){
            case 1:
                System.out.println(MealsImpl.numbers.ONE);
                break;
            case 2:
                System.out.println(MealsImpl.numbers.TWO);
                break;
            case 3:
                System.out.println(MealsImpl.numbers.THREE);
                break;
            case 4:
                System.out.println(MealsImpl.numbers.FOUR);
                break;
            case 5 :
                System.out.println(MealsImpl.numbers.FIVE);
                break;
            default:
                System.out.println(MealsImpl.numbers.OTHER);
                break;
        }
    }
}
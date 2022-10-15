package org.example;

import java.util.Collections;
import java.util.ArrayList;

public class ArrayListExample {
    Object object = new Object();
    public void CreateArrau(){
        ArrayList<String> names =new ArrayList<String>();
        names.add("Collins");
        names.add("Naomi");
        names.add("Leonard");
        names.add("Gideon");
        names.add("Eugene");
        names.add("Collins");

//        object.MyNamesArray = names;

        Arrays(names);

    }
    public  void Arrays(ArrayList<String> names){

        System.out.println("The original list is: "+ names + ". Its length is: " + names.size());

        Collections.sort(names);

        System.out.println("The sorted list is: "+names);

        java.util.ArrayList<String> reversedNames = new java.util.ArrayList<String>();

        for (int i = names.size()-1;  i >= 0; i--){
//                     System.out.println(names.get(i));
            reversedNames.add(names.get(i));
        }
        System.out.println("The reversed list is "+reversedNames);

        modifyArray(names);

    }

    public  void  modifyArray(ArrayList<String> oldList){

//       ArrayList<String> oldList =  object.MyNamesArray;

        oldList.set(0,"Vince");
        oldList.set(1,"Otieno");
        oldList.set(2,"Lagat");
        oldList.set(3,"Bett");

        System.out.println(oldList);

        object.setMyNamesArray(oldList);


    }
}

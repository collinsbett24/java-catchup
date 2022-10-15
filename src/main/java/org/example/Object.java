package org.example;

import java.util.ArrayList;

public class Object {
    public int x = 59;

    public static final String MyName = "Collins Bett";

    public static final String MyWife = "Naomi Lagat";

    public static String ChildsName = "Miles Kiplangat";

    private ArrayList<String> MyNamesArray;

    public void setMyNamesArray(ArrayList<String> names){
        MyNamesArray = names;
    }
    private String myOthername = "vincente";
    private String myRealName = "vincente";

    public void setMyOthername(String name){
        myOthername = name;
    }

    public ArrayList<String> getMyNamesArray(){
//        MyNamesArray.add("New Value");
        return MyNamesArray;
    }
    static class ImportantNames{
        public void collinsNames(){
            String firstNAme = "Collins";
            String lastName ="Bett";
            int salary = 20000;
        }
        public String naomiNames(){
            String firstNAme = "Naomi";
            String lastName ="Lagat";
            int salary = 19300 + (500*4*4);
            return "Her Name is " + firstNAme + " " + lastName + ". She Earns "+salary;
        }
    }

    public String getMyOtherName(){
        return myOthername;
    }
}

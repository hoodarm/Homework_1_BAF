package com.company;

public class Main {

    public static void main(String[] args) {
        boolean weekday = false;
        boolean vacation = true;

        if((!weekday||vacation)==true)
        {
            System.out.println("Sleep late");
        }
        else
        {
            System.out.println("Don't sleep late");
        }
    }
}

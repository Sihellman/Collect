package edu.ti.caih313.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CountFamilies {
    public static void main(String[] args) {
        List<Double> incomes = new LinkedList<>();
        System.out.println("enter incomes");
        Scanner keyboard = new Scanner(System.in);

        double max = 0;
        double entry = 0;
        while(true){

            entry = keyboard.nextDouble();
            if(entry < 0){
                break;
            }

            if(entry > max){
                max = entry;
            }

            incomes.add(entry);
        }
        Double tenPercent = max * 0.10;
        int count = 0;
        int listSize = incomes.size();
        for(int i = 0; i < listSize; i++){
            if (incomes.get(i) < tenPercent){
                count++;
                System.out.println(incomes.get(i));
            }
        }
        System.out.println("count " + count);


    }


}

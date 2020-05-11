/*
package edu.ti.caih313.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Read3 {
    public static void main(String[] args) {
        List<String[]> list = new LinkedList<>();
        String[] array2 = new String[];
        System.out.println("enter file name");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.next();
        Scanner inputStream = null;
        try {
            File file = new File(fileName);
            inputStream = new Scanner(file);
            String line = "";
            if (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
            }
            List<String> words = new LinkedList<>();
            String word = "";
            while (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
                char[] array = new char[line.length()];

                for (int i = 0; i < array.length; i++) {
                    array[i] = line.charAt(i);
                }
                for (int i = 0; i < array.length; i++){
                    word += array[i];
                    if((array[i] == ' ') && (i != 0)){
                        words.add(word);
                    }
                    if((array[i] == '!') || (array[i] == '?') || (array[i] == '.')){
                        if(i != line.length() - 1){
                            if(array[i+1] == ' '){
                                list.add(words);
                                words.clear();
                            }
                        }
                    }
                }


            }
           */
/* for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }*//*

            for (int i = 0; i < words.size(); i++){
                System.out.println(words.get(i));
            }
            System.out.println("enter a sentence number");
            int sentenceNum = keyboard.nextInt();
            System.out.println("enter a word number");
            int wordNum = keyboard.nextInt();
            words = list.get(sentenceNum);
            System.out.println(words.get(wordNum));

        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + fileName);
            //System.exit(0);
        }

        finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

    }
}
*/

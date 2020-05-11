package edu.ti.caih313.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Read2 {
    public static void main(String[] args) {
        List<List<String>> list = new LinkedList<>();
        System.out.println("enter file name");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.next();
        Scanner inputStream = null;
        List<String> words = new LinkedList<>();
        try {
            File file = new File(fileName);
            inputStream = new Scanner(file);
            String line = "";
            if (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
            }

            String word = "";

            while (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
                char[] array = new char[line.length()];

                for (int i = 0; i < array.length; i++) {
                    array[i] = line.charAt(i);
                }
                for (int i = 0; i < array.length; i++){
                    System.out.println("begining");
                    word += array[i];
                    System.out.println("word is " + word);
                    if(((array[i] == ' ') && (i != 0) && (!word.equals(" "))) || (i == line.length()-1)){
                        System.out.println("yay");
                        words.add(word);
                        word = "";

                    }
                    if((array[i] == '!') || (array[i] == '?') || (array[i] == '.')){
                        if(i != line.length() - 1){
                            System.out.println("yay2");
                            //if(array[i+1] == ' '){
                                //if (!word.equals("")){
                                    words.add(word);
                                    list.add(words);
                                    words = new LinkedList<>();
                                    System.out.println("words is fishally ");
                                    word = "";
                                //}


                        }
                        else{

                                if(!word.equals("")){
                                    list.add(words);
                                    words = new LinkedList<>();
                                    word = "";
                                }

                        }
                    }
                }


            }
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
            /*for (int i = 0; i < words.size(); i++){
                System.out.println(words.get(i));
            }*/
            System.out.println("enter a sentence number");
            int sentenceNum = keyboard.nextInt()-1;
            System.out.println("enter a word number");
            int wordNum = keyboard.nextInt()-1;
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
   /* public static int getSentenceNum(List<List<String>> sentences){
        int sentenceNum = 0;
        Scanner keyboard = new Scanner(System.in);
        try{
            while (true) {
                System.out.println("enter sentence number");
                sentenceNum = keyboard.nextInt()-1;
                if ((sentenceNum > sentences.size()) || (sentenceNum < 1)) {
                    System.out.println("invalid, " + sentences.size() + " sentence(s)");
                } else {
                    break;
                }
            }
        }
        catch (InputMismatchException ime) {
            System.out.println("input mismatch exception");
            getSentenceNum(sentences);
        }
        catch (NumberFormatException nfe) {
            System.out.println("number format exception");
            getSentenceNum(sentences);
        }

        return sentenceNum;
    }
    public static int getWordNum(List<String> oneSentenceOfWords){
        System.out.println(oneSentenceOfWords.size());
        int wordNum = 0;
        Scanner keyboard = new Scanner(System.in);
        try{
            while (true) {
                System.out.println("enter word number");
                wordNum = keyboard.nextInt()-1;
                if ((wordNum >= oneSentenceOfWords.size()) || (wordNum < 1)) {
                    System.out.println("invalid, " + (oneSentenceOfWords.size()-1) + " word(s)");
                } else {
                    break;
                }
            }

        }catch (InputMismatchException ime) {
            System.out.println("input mismatch exception");
            getWordNum(oneSentenceOfWords);
        }
        catch (NumberFormatException nfe) {
            System.out.println("number format exception");
            getWordNum(oneSentenceOfWords);
        }
        return wordNum;
    }
     oneSentenceOfWords = sentences.get(getSentenceNum(sentences));
             //System.out.println("here it is " + oneSentenceOfWords);
             //System.out.println("here is word " + getWordNum(oneSentenceOfWords));
             System.out.println(oneSentenceOfWords.get(getWordNum(oneSentenceOfWords)));

*/
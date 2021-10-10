package exercises;

import java.io.*;
import java.util.Scanner;


public class exercise5_encryption {
    public static void main(String[] args) {

        //Exercise_1
        //crypt('+', 42, false);
        //test_function();
        //_________________________________________4
        //Exercise_2
        //reader();
        userInput();
        writer();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to encrypt or decrypt? (type e or d): ");
        String enc_or_dec = scanner.nextLine();
//        assert enc_or_dec == "d" || enc_or_dec == "e" : "Invalid choice"; // NOT WORKING!!!

        System.out.println("Type your input file name: ");
        String in_fileName = scanner.nextLine();

        System.out.println("Type your output file name: ");
        String out_fileName = scanner.nextLine();

        process_userInput(enc_or_dec, in_fileName, out_fileName);
    }

    private static void process_userInput(String enc_or_dec, String in_fileName, String out_fileName) {
        reader(in_fileName);


//        if (enc_or_dec == "e"){
//        }else{}


    }


    private static int reader(String in_fileName) {
        int c = 0;
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(in_fileName));
            c = reader.read();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("something went wrong while opening the file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("somwthing went wrong while reading: " + e.getMessage());
        }
        return c;
    }

    private static void writer() {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("hello.txt"));
            writer.write(" asdf sadf sdf sdf sdf dsf ");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("something went wrong while creating the file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("something went wrong while writing: " + e.getMessage());
        }
    }






    static char crypt(char input, int random, boolean encrypt) {
        int ascii = input;
        assert ascii >= 32 & ascii <= 127 : "Illegal character";
        assert random >= 0 & random <= 95 : "Illegal random number";

        if (encrypt)
            return (char) encryptChar(ascii, random);
        else
            return (char) decryptChar(ascii, random);
    }

    private static int decryptChar(int ascii, int random) {
        int c = (ascii - 32 - random + 96) % 96 + 32;
        return c;
    }

    private static int encryptChar(int ascii, int random) {
        int c = (ascii - 32 + random + 96) % 96 + 32;
        return c;
    }


    private static void test_function() {
        for (int i = 32; i <= 127; i++) {
            char encrypted = crypt((char) i, 42, true);
            System.out.println((char) i + " " + encrypted + " " + crypt(encrypted, 42, false));
        }
    }
}










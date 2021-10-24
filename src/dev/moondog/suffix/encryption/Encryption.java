package dev.moondog.suffix.encryption;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Encryption {

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;
    Encryption() {
         scanner = new Scanner(System.in);
         random = new Random();
         list = new ArrayList();
         shuffledList = new ArrayList();
         character = ' ';

         newKey();
         askQuestion();
    }
     private void askQuestion() {
      while(true) {
          System.out.println("NewKey = N,GetKey = G,Encrypt = E,Decrypt = D,Quit = Q");
          char response = Character.toUpperCase(scanner.nextLine().charAt(0));

          switch (response) {
              case  'N':
                  newKey();
                  break;
              case 'G':
                  getKey();
                  break;
              case 'E':
                  encrypt();
                  break;
              case 'D':
                  decrypt();
                  break;
              case 'Q':
                  quit();
                  break;
              default:
                  System.out.println("Invalid choice.");
          }
      }
    }
    private void newKey() {
       character = ' ';
       list.clear();
       shuffledList.clear();
       // flush lists.
        for (int i = 32; i<127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }
        shuffledList = new ArrayList(list);
        Collections.shuffle(shuffledList);
        System.out.println("Key created!");
    }
    private void getKey() {
        System.out.println("Key: ");
        for (Character x : list) {
            System.out.println(x);
        }
        System.out.println();
        for (Character x : shuffledList) {
            System.out.println(x);
        }
        System.out.println();
    }
    private void encrypt() {
        System.out.println("Message: ");
        String message = scanner.nextLine();
        letters = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {

            for (int o = 0; o < list.size(); o++) {
                if (letters[i] == list.get(o)) {
                    letters[i] = shuffledList.get(o);
                    break;
                }
            }
        }
        System.out.println("Encrypted: ");
        for (char x : letters) {
            System.out.println(x);
        }
        System.out.println();
    }
    private void decrypt() {
     System.out.println("Enter a message to be decrypted: ");
        String message = scanner.nextLine();
        letters = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {

            for (int o = 0; o < shuffledList.size(); o++) {
                if (letters[i] == shuffledList.get(o)) {
                    letters[i] = list.get(o);
                    break;
                }
            }
        }
        System.out.println("Decrypted: ");
        for (char x : letters) {
            System.out.println(x);
        }
        System.out.println();
    }
    private void quit() {

    }
}

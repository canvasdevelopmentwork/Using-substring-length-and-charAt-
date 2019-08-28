import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Create a program that will allow users to enter a word, and a character number index.
//        Your program will print out the size of the word, as well as the substring (starting from 0) to the index the user specified.
//        If the user entered index is larger than the size of the word, the program will print "Index is larger than length".
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter in a word!");
        String word = keyboard.nextLine();
        System.out.println("Please enter in a number!");
        int number = Integer.parseInt(keyboard.next());
        System.out.println("The amount of characters in this word is : " + word.length());
        if(number<=word.length()) {
            System.out.println("The section of word from index 0-" + (number-1) + " is : " + word.substring(0, number));
        } else {
            System.out.println("Index is larger than length");
        }
    }

}

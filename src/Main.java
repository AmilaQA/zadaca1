import java.util.Date;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

// Task 2.
        String someText = "Some random text";
        int someNumber = 1;

        String someText2 = "27";
        int someNumber2 = 1;

        someNumber2 = Integer.parseInt(someText2);

        System.out.println("Some text: " + someText);
        System.out.println("Some number: " + someNumber);

        System.out.println("///////////////");
        System.out.println("Some text: " + someText2);
        System.out.println("Some number: " + someNumber2);

        // task 5
        //
        // Declare vars : Ime i prezime,
        // prvo slovo imena,
        // godina rodjenja,
        // broj 100 000 000 000,
        // broj 42.001

        String name;
        String surName;
        char firstLetterOfName;
        Date dateOfBirth;
        Long longNumber = 100000000000L;
        double doubleNumber = 42.001;


        // task 6
        // Isprintate vase ime koristeci samo brojeve  koji se pretvore u char-ove.

        String myName = "Amila";
        System.out.println(myName);
        char charA = 'A';
        // Converting character to its integer value
        char[] myCharName = {65, 109, 105, 108, 97}; // Unicode values for "Amila"
        System.out.println(myCharName);

        // task 7

        String question = "Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42:";
        Boolean answer1 = true;
        Boolean answer2 = false;
        System.out.println(question + answer1);
        System.out.println(question + answer2);

        // task 8
        // This is a number xxx and it is about to double;
        //   I zatim 8 puta da se udupla njegova vrijednost i svaki put da se isti tekst ispise
        //   sa uduplanim brojem.
        //   PRvi put kad se ispise broj mora biti izvorno upisani broj.
        //   xxx je neki broj koji mogu ja sam da dodam a da se ne narusi logika.

        int numberXXX = 16;
        String thisText = "This is a number " + numberXXX + " and it is about to double";
        System.out.println(thisText);
        String additionalMessage = "The original number has been doubled: X";
        String counterMessage = " Times";

        System.out.println(additionalMessage + counterMessage);

// task 8 + BONUS

        thisText = "This is a number " + (numberXXX) * 2 + " and it is about to double";
        System.out.println(thisText);
        System.out.println(additionalMessage + "X" + counterMessage);
        thisText = "This is a number " + (numberXXX) * 4 + " and it is about to double";
        System.out.println(thisText);
        System.out.println(additionalMessage + "XX" + counterMessage);
        thisText = "This is a number " + (numberXXX) * 8 + " and it is about to double";
        System.out.println(thisText);
        System.out.println(additionalMessage + "XXX" + counterMessage);
        thisText = "This is a number " + (numberXXX) * 16 + " and it is about to double";
        System.out.println(thisText);
        System.out.println(additionalMessage + "XXXX" + counterMessage);
        thisText = "This is a number " + (numberXXX) * 32 + " and it is about to double";
        System.out.println(thisText);
        System.out.println(additionalMessage + "XXXXX" + counterMessage);
        thisText = "This is a number " + (numberXXX) * 64 + " and it is about to double";
        System.out.println(thisText);
        System.out.println(additionalMessage + "XXXXXX" + counterMessage);
        thisText = "This is a number " + (numberXXX) * 128 + " and it is about to double";
        System.out.println(thisText);
        System.out.println(additionalMessage + "XXXXXXX" + counterMessage);
        thisText = "This is a number " + (numberXXX) * 256 + " and it is about to double";
        System.out.println(thisText);
        System.out.println(additionalMessage + "XXXXXXXX" + counterMessage);


    }
}
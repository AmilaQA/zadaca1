import java.util.Date;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task 2.
        String someText = "Some random text";
        int someNumber = 1;
        String someText2 = "27";

        System.out.println("Some text: " + someText);
        System.out.println("Some number: " + someNumber);
        System.out.println("Some text2: " + someText2);
        System.out.println("\n");

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
        // Isprintate vase ime koristeci samo brojeve koji se pretvore u char-ove.
        //
        char charA = 65;   // A
        char char_m = 109; // m
        char char_i = 105; // i
        char char_l = 108; // l
        char char_a = 97;  // a
        System.out.println(charA + "" + char_m + "" + char_i + "" + char_l + "" + char_a);
        System.out.println("\n");

        char myVar_A = 65, myVar_m = 109, myVar_i = 105, myVar_l = 108, myVar_a = 97;
        char A = 65;
        char m = 109;
        char i = 105;
        char l = 108;
        char a = 97;
        System.out.println(myVar_A);
        System.out.println(myVar_m);
        System.out.println(myVar_i);
        System.out.println(myVar_l);
        System.out.println(myVar_a);
        System.out.println(myVar_A + "" + myVar_m + "" + myVar_i + "" + myVar_l + "" + myVar_a);

        // task 7
        // varijabla koja ispisuje odgovarajuci tekst
        String question = "Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42:";
        Boolean answer1 = true;
        Boolean answer2 = false;
        System.out.println(question + answer1);
        System.out.println(question + answer2);
        System.out.println("\n");
        // task 8
        //
        // This is a number xxx and it is about to double;
        // I zatim 8 puta da se udupla njegova vrijednost i svaki put da se isti tekst ispise
        // sa uduplanim brojem.
        // Prvi put kad se ispise broj mora biti izvorno upisani broj.
        //   xxx je neki broj koji mogu ja sam da dodam a da se ne narusi logika.

        int originalNumber = 2;
        String thisText = "This is a number " + originalNumber + " and it is about to double: " + originalNumber * 2;
        System.out.println(thisText);
        String additionalMessage = "The original number has been doubled: ";
        String counterMessage = " Times";
        System.out.println(additionalMessage + "2" + counterMessage);
        System.out.println("\n");

        thisText = "This is a number " + originalNumber * 2 + " and it is about to double: " + originalNumber * 4;
        System.out.println(thisText);
        System.out.println(additionalMessage + "4" + counterMessage);
        System.out.println("\n");

        thisText = "This is a number " + originalNumber * 4 + " and it is about to double: " + originalNumber * 8;
        System.out.println(thisText);
        System.out.println(additionalMessage + "8" + counterMessage);
        System.out.println("\n");

        thisText = "This is a number " + originalNumber * 8 + " and it is about to double: " + originalNumber * 16;
        System.out.println(thisText);
        System.out.println(additionalMessage + "16" + counterMessage);
        System.out.println("\n");

        thisText = "This is a number " + originalNumber * 16 + " and it is about to double: " + originalNumber * 32;
        System.out.println(thisText);
        System.out.println(additionalMessage + "32" + counterMessage);
        System.out.println("\n");

        thisText = "This is a number " + originalNumber * 32 + " and it is about to double: " + originalNumber * 64;
        System.out.println(thisText);
        System.out.println(additionalMessage + "64" + counterMessage);
        System.out.println("\n");

        thisText = "This is a number " + originalNumber * 64 + " and it is about to double: " + originalNumber * 128;
        System.out.println(thisText);
        System.out.println(additionalMessage + "128" + counterMessage);
        System.out.println("\n");

        thisText = "This is a number " + originalNumber * 128 + " and it is about to double: " + originalNumber * 256;
        System.out.println(thisText);
        System.out.println(additionalMessage + "256" + counterMessage);
        System.out.println("\n");

        thisText = "This is a number " + originalNumber * 256 + " and it is about to double: " + originalNumber * 512;
        System.out.println(thisText);
        System.out.println(additionalMessage + "512" + counterMessage);
        System.out.println("\n");
    }
}
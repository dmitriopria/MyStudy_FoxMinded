package ua.com.foxminded.studying;

public class StringUtil {

    public static void main(String[] args) {

        String source = "Hello World!";
        String [] words = source.split(" ");

        System.out.println(words.length);

        System.out.println(words[0]);
        char [] letters1 = words[0].toCharArray();
        System.out.println(letters1.length);

        System.out.println(words[1]);					// первый вывод
        char [] letters2 = words[1].toCharArray();
        System.out.println(letters2.length);

        int i = 0;										// этот так же работает, явно читается хуже
        while(i < words.length) {
            System.out.println(words[i]);
            char [] letters = words[i].toCharArray();
            System.out.println(letters.length);
            i++;
        }

        for(int i1 = 0; i1 < words.length; i1++) {			// универсальный с использованием for
            System.out.print("Word " + "\"" + words[i1] + "\"");
            char [] letters = words[i1].toCharArray();
            System.out.println(" has " + letters.length + " letters");
        }

        for(int i1 = 0; i1 < words.length; i1++) {			// дз
            System.out.println(words[i1]);
            char [] letters = words[i1].toCharArray();
            for (int i2 = 0; i2 < letters.length; i2++) {
                System.out.println(letters[i2]);
            }
        }

        StringBuilder recoverSource = new StringBuilder();
        for(int i1 = 0; i1 < words.length; i1++) {			// дз
            System.out.println(words[i1]);
            char [] letters = words[i1].toCharArray();

            for (int i2 = 0; i2 < letters.length; i2++) {
                System.out.println(letters[i2]);
                System.out.println(recoverSource.append(letters[i2]));
            }
            if (i1 < words.length)
                recoverSource.append(' ');

        }

    }

}

package ua.com.foxminded.studying;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.print("Hello everybody");
        System.out.println(" and my friends");

        String message = "Hello World!";
        System.out.println(message);
        String words = "Java forever!";
        System.out.println(message + "\n" + words);		// конкатенация - склеивание строк
        String space = " ";
        System.out.println(message + space + words);

        int i = 6;
        System.out.println(i);
        int j = 7;
        System.out.println(i + j);
        int answer = i * j;
        System.out.println(answer);
        double d = 2.5;
        System.out.println(i + j * d);

        String stringAnswer = answer + " " + message;
        System.out.println(stringAnswer);

/* Integer.parseInt() Разбирает строковый аргумент в виде десятичного целого числа со знаком
и генерирует исключение NumberFormatException, если строка не может быть преобразована в тип int. */

        String number = "-2";
        int result = answer + Integer.parseInt(number);
        String oneMoreAnswer =  message + " " + result;
        System.out.println(oneMoreAnswer);

        float answerFloat = (float)i / (float)j;	// так сработает, потому что i и j конвертированы в float
        float answerInt = i / j;					// так не сработает, потому что i и j заданы как int
        System.out.println(answerFloat);
        System.out.println(answerInt);

        int hugeNumber = 521124244;
        System.out.println(hugeNumber % i); 		// остаток от деления по модулю

        boolean isMoreThenOne = answerFloat > 1;	// логическая переменная (0.85... > 1 is false)
        System.out.println(isMoreThenOne);

        boolean evenNumber;
        if (i % 2 == 0) {
            evenNumber = true;
        }
        else evenNumber = false;
        System.out.println(evenNumber);

    }

}

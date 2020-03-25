import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        double number1 = 0.0D;
        double number2 = 0.0D;
        int k = 0 ;
        double answer = 0.0D;
        Scanner scanObject = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        number1 = scanObject.nextDouble();
        System.out.println("Введіть друге число: ");
        number2 = scanObject.nextDouble();
        System.out.println("Введіть номер операції яку потрібно виконати: ");
        System.out.print("1. + \n2. - \n3. * \n4. / \n5. Порівняти \n6. Число 1 більше за число 2 \n7. Число 1 менше за число 2 \n");
        k = scanObject.next().charAt(0);
        switch(k) {
            case '1':
                answer = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + answer);
                break;
            case '2':
                answer = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + answer);
                break;
            case '3':
                answer = number1 * number2;
                System.out.println(number1 + "*" + number2 + "=" + answer);
                break;
            case '4':
                answer = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + answer);
                break;
            case '5':
                String str1 = number1 == number2 ? "Рівні" : "Не рівні";
                System.out.println(str1);
                break;
            case '6':
                String str2 = number1 > number2 ? "Так" : "Ні";
                System.out.println(str2);
                break;
            case '7':
                String str3 = number1 < number2 ? "Так" : "Ні";
                System.out.println(str3);
        }

    }

}

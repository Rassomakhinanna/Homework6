import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1.1
        int [] numbers = new int [10];
        numbers [0] = 1;
        int numbersOne = numbers [0];
        System.out.println(numbersOne);
        numbers [1] = 2;
        int numbersTwo = numbers [1];
        System.out.println(numbersTwo);
        numbers [2] = 3;
        int numbersThree = numbers [2];
        System.out.println(numbersThree);
        // Задание 1.2
        double [] num = {1.57, 7.654, 9.986};
        // Задание 1.3
        int [] numb = {21, 22, 23, 24, 25, 26};


        // Задание 2
        int [] intNumber = { 1, 2, 3 };
        String intNumberString = Arrays.toString(intNumber);
        System.out.println( intNumberString );

        double [] intNum = {1.57, 7.654, 9.986};
        String intNumString = Arrays.toString(intNum);
        System.out.println( intNumString );

        int [] intNumb = {21, 22, 23, 24, 25, 26};
        String intNumbString = Arrays.toString(intNumb);
        System.out.println( intNumbString );

        // Задание 3
        int [] intNumeral = { 1, 2, 3 };
        for (int i = intNumeral.length - 1; i >=0; i--) {
            System.out.print(intNumeral[i] + " ");
        }
        System.out.println(intNumeral);

        double [] intNumer = {1.57, 7.654, 9.986};
        for (int j = intNumer.length - 1; j >=0; j--) {
            System.out.print(intNumer[j] + " ");
        }
        System.out.println(intNumer);

        int [] intNumbbr = {21, 22, 23, 24, 25, 26};
        for (int i = intNumbbr.length - 1; i >=0; i--) {
            System.out.print(intNumbbr[i] + " ");
        }
        System.out.println(intNumbbr);

        // Задание 4
        int [] numm = {21, 22, 23, 24, 25, 26};
        for (int i=0; i< numm.length; i++) {
            if (numm [i] % 2 !=0) numm [i]++;
            System.out.print(numm[i] + " ");
            }
        }
    }
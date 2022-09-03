import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaFirst {

    static void arraySum(){

        int sumFor = 0, sumWhile = 0, sumDoWhile = 0;

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for(int s:array){
            sumFor+=s;
        }
        System.out.println(sumFor + " For");

        int i = 0;
        while(i < array.length)
        {
            sumWhile+=array[i++];
        }
        System.out.println(sumWhile + " While");

        i = 0;
        do {
            sumDoWhile+=array[i++];
        }while (i<array.length);
        System.out.println(sumDoWhile + " DoWhile");

    }

    static void commandLine(String[] args){
        System.out.println("Command line arguments:");
        for (String arg : args) {

            System.out.println(arg);
        }
    }

    static void harmonic(){
        for (int i = 1; i <= 10;i++){
            System.out.print((1.0/i) + " ");
        }
    }

    static void arraySort(){

        int[] firstArr = new int[10];
        int[] secondArr = new int[10];
        Random RandObj = new Random();

        for (int i = 0; i < 10; i++){
            firstArr[i] = (int)(Math.random()*10);
            secondArr[i] = RandObj.nextInt(11);
        }

        System.out.println("With math.random()");
        for (int i = 0; i < 10; i++){
            System.out.print(firstArr[i]+" ");
        }
        System.out.println();
        Arrays.sort(firstArr);

        for (int i = 0; i < 10; i++){
            System.out.print(firstArr[i]+" ");
        }
        System.out.println("\n");

        System.out.println("With Random object");
        for (int i = 0; i < 10; i++){
            System.out.print(secondArr[i]+" ");
        }
        System.out.println();
        Arrays.sort(secondArr);
        for (int i = 0; i < 10; i++){
            System.out.print(secondArr[i]+" ");
        }

    }

    static void fact(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:  ");
        int num = scan.nextInt();
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact*=i;
        }
        System.out.println(fact);
    }



    public static void main(String[] args) {
        System.out.print("Enter number of exercise:  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case (1) -> arraySum();
            case (2) -> commandLine(args);
            case (3) -> harmonic();
            case (4) -> arraySort();
            case (5) -> fact();
        }
    }
}
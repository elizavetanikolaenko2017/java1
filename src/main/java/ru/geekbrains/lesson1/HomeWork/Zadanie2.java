package ru.geekbrains.lesson1.HomeWork;
import java.util.Scanner;
public class Zadanie2 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println("zadanie2(n, scanner)="+ zadanie2(n,scanner));

        }



        private static int zadanie2(int n,Scanner scanner) {
            int count=0;
            int a=0; b=0;
            a= scanner.nextInt();

            while (b<=0){
                b= scanner.nextInt();
                count++;
                a=b;
            }
            scanner.close();
            return count;
        }
    }



/**
 * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
 * @param
 *
 * @return count
 */

}

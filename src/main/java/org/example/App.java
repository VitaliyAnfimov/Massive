package org.example;

import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        while(true){
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            String newAlphabet = "noqaflwepsxtmvbrzuykdgjcih";

            String str = "";
            String newStr = "";

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку для дешифровки:");
            str = sc.nextLine();

            //дешифровкa
            for (int i = 0;i < str.length();i++){
                boolean find = false;
                for (int j = 0;j < newAlphabet.length();j++){
                    if (str.toLowerCase().charAt(i) == newAlphabet.toLowerCase().charAt(j)){
                        newStr += alphabet.charAt(j);
                        find = true;
                        break;
                    }
                }
                if (!find) newStr += str.charAt(i);
            }

            System.out.println("Исходная строка после дешифровки: " + newStr);

            System.out.print("Повторить выполнение программы? (y - да, n - нет): ");
            String answer = sc.nextLine();
            if (!answer.equals("y")) break;
        }


    }
}

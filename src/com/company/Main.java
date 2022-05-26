package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner wejscie = new Scanner (System.in);
        System.out.println("Proszę podać liczbę wierszy");
        int iWiersze = wejscie.nextInt();
        System.out.println("\nProszę podać liczbę kolumn");
        int iKolumny = wejscie.nextInt();
        System.out.println("\n======================================\n");
        for (int j=1; j <= iWiersze; j++)
        {
            for(int i =1; i<= iKolumny; i++)
            {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }

}
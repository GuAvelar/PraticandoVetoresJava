package br.com.alunos.model;

import java.util.Scanner;

public class SomaParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int[10];

        int somaImpar = 0;
        int somaPar = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" Digite o numero " + (i+1) + ": ");
            vetor[i] = sc.nextInt();

            if(vetor[i] % 2 == 0){
                somaPar += vetor[i];
            }else{
                somaImpar += vetor[i];
            }
        }
        System.out.println("Soma dos numeros pares: " + somaPar );
        System.out.println("Soma dos numeros impares: " + somaImpar );

        sc.close();

    }

}

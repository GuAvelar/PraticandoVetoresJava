package br.com.alunos.model;

public class CalculandoMedia {
    public static void main(String[] args) {
        double[] notasAluno = {4.5, 6.7, 4, 4, 4};
        double somaNotas = 0;
        for (int i = 0; i < notasAluno.length; i++) {
            somaNotas += notasAluno[i];
        }

        double mediaNotas = somaNotas / notasAluno.length;

        if(mediaNotas >= 7){
            System.out.println("APROVADO");
        }else {
            System.out.println("REPROVADO");
        }
        System.out.println(mediaNotas);

    }
}


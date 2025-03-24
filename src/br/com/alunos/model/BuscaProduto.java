package br.com.alunos.model;

public class BuscaProduto {

    public static void main(String[] args) {
        String[] produtosEstoque = {"Notebook", "Smartphone", "Tablet", "Fone de ouvido", "Carregador portátil"};

        String produtoProcurado = "Tablet";

        boolean produtoEncontrado = false;
        for (int i = 0; i < produtosEstoque.length && !produtoEncontrado; i++) {
            if(produtosEstoque[i].equals(produtoProcurado)) {
                produtoEncontrado = true;
            }
            i++;
        }

        if(produtoEncontrado) {
            System.out.println(produtoProcurado + " está disponível no estoque.");
        } else {
            System.out.println(produtoProcurado + " não foi encontrado no estoque.");
        }
    }
}

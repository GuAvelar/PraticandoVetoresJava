package br.com.alunos.model;

public class BuscarMenorValor {
    public static void main(String[] args) {
        Object[][] produtos = {
                {"Notebook", 100.00},
                {"Mouse", 80.00},
                {"Monitor", 600.00},
                {"Fone", 120.00}
        };

        String produtoProcurado = "Mouse";
        boolean produtoEncontrado = false;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i][0].equals(produtoProcurado)) {
                System.out.println("Produto encontrado: " + produtos[i][0] + " - Preço: R$" + produtos[i][1]);
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado!");
        }
    }
}

package Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario novo = new Usuario();
        Scanner entrada = new Scanner(System.in);
        System.out.println("BEM-VINDE AO GERENCIADOR DE LISTA DE PRODUTOS!");

        while (true) {
            String produto;
            Double preco;
            System.out.println("SELECIONE UMA OPÇÃO: 1) ADICIONAR PRODUTO / 2) EXCLUIR PRODUTO / 3 - EXIBIR LISTA / 4 - SAIR");
            int selecionaOpcao = entrada.nextInt();

            if (selecionaOpcao == 1) {
                System.out.println("DIGITE O PRODUTO: ");
                produto = entrada.next();
                System.out.println("DIGITE O PREÇO: ");
                preco = entrada.nextDouble();
                novo.adicionarProduto(produto, preco);
            } else if (selecionaOpcao == 2) {
                System.out.println("DIGITE O PRODUTO: ");
                produto = entrada.next();
                novo.excluirProduto(produto);
            } else if (selecionaOpcao == 3) {
                novo.exibirProdutos();
            } else if (selecionaOpcao == 4) {
                System.out.println("ATÉ A PRÓXIMA!");
                break;
            }
        }

    }
}

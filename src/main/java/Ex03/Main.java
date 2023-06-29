package Ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorPratos gerenciador = new GerenciadorPratos();
        Scanner entrada = new Scanner(System.in);

        System.out.println("---------------------------------------------------------");
        System.out.println("OLÁ! VOCÊ ESTÁ NO GERENCIADOR DE CARDÁPIO DO RESTAURANTE.");
        System.out.println("---------------------------------------------------------");

        while(true) {
            System.out.println("DIGITE 1 PARA ADICIONAR NOVO PRATO / 2 PARA EXCLUIR / 3 PARA EXIBIR CARDÁPIO COMPLETO / 4 PARA SAIR");
            int opcao = entrada.nextInt();

            if(opcao == 1) {
                gerenciador.adicionarPrato();
            } else if (opcao == 2){
                gerenciador.excluirPrato();
            } else if (opcao == 3) {
                gerenciador.exibirCardapio();
            } else if (opcao == 4) {
                System.out.println("ATÉ A PRÓXIMA!");
                break;
            }

        }

    }
}

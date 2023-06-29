package Ex02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Usuario candidato = new Usuario();

        System.out.println("SISTEMA DE GERENCIAMENTO DE CANDIDATOS");
        System.out.println("-----------------------------------------");
        System.out.println();
        while (true) {
            System.out.println("DIGITE 1 PARA ADICIONAR CANDIDATO / 2 PARA EXCLUIR CANDIDATO / 3 PARA EXIBIR LISTA / 4 PARA SAIR");
            int opcao = entrada.nextInt();

            if (opcao == 1){
                candidato.adicionarCandidato();
            } else if (opcao == 2){
                candidato.excluirCandidato();
            } else if (opcao == 3) {
                candidato.exibirLista();
            }else if(opcao == 4){
                System.out.println("ATÉ MAIS!");
                break;
            }else {
                System.out.println("COMANDO INVÁLIDO");
            }

        }

    }
}

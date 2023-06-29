package Ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorPratos implements Cardapio {

    //ATRIBUTOS
    private Map<String, String> listaPratos = new HashMap<>();

    // MÉTODOS
    public void adicionarPrato() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O NOME DO PRATO: ");
        String nomePrato = entrada.nextLine();
        System.out.println("DIGITE A LISTA DE INGREDIENTES DO PRATO: ");
        String ingredientes = entrada.nextLine();

        listaPratos.put(nomePrato,ingredientes);
        System.out.println("O PRATO " + nomePrato + " FOI ADICIONADO COM SUCESSO AO CARDÁPIO.");
        System.out.println("----------------------------------------");
    }

    public void excluirPrato() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O NOME DO PRATO QUE QUER EXCLUIR: ");
        String nomeDoPrato = entrada.nextLine();

        for(String prato : listaPratos.keySet()) {
            if(nomeDoPrato.equalsIgnoreCase(prato)) {
                listaPratos.remove(prato);
                System.out.println("O PRATO FOI EXCLUÍDO COM SUCESSO.");
                break;
            }else{
                System.out.println("NOME DO PRATO NÃO FOI ENCONTRADO NO CARDÁPIO.");
            }
        }
    }

    public void exibirCardapio() {
        System.out.println("CARDÁPIO COMPLETO");
        System.out.println("-------------------------------------------");

        for(String prato : listaPratos.keySet()){
            System.out.println("PRATO: " + prato + "\nINGREDIENTES: " + listaPratos.get(prato));
            System.out.println("-------------------------------------------");
        }
    }
}

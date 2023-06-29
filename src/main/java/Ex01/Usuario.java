package Ex01;

import java.util.HashMap;
import java.util.Map;

public class Usuario extends Produtos{

    //DECLARAÇÃO DE VARIÁVEIS
    private Map<String, Double> listaProdutos = new HashMap<>();

    //MÉTODOS
    public  void adicionarProduto(String produto, Double preco) {
        listaProdutos.put(produto,preco);
        System.out.println("O PRODUTO " + produto + " FOI ADICIONADO COM SUCESSO.");
        System.out.println("--------------------------------");
    }

    public void excluirProduto(String produto) {
        listaProdutos.remove(produto);
        System.out.println("O PRODUTO " + produto + " FOI EXCLUIDO COM SUCESSO.");
        System.out.println("--------------------------------");
    }

    public void exibirProdutos() {
        System.out.println("SUA LISTA DE PRODUTOS: ");
        for (String chave : listaProdutos.keySet()) {
            System.out.println("Produto: " + chave + " -> PREÇO = R$" + listaProdutos.get(chave));
        }
        System.out.println("--------------------------------");
        }

    }



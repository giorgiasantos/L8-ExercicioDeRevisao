package Ex02;

import java.util.*;
public class Usuario extends Candidato{
    //ATRIBUTOS
    private List<Candidato> listaCandidatos = new ArrayList<>();

    //CONSTRUCTOR
    public Usuario() {
    }

    //MÉTODOS
    @Override
    public String toString() {
        return ("Candidato: " + this.getNome()) + " | Matrícula: " + this.getMatricula() + " | Nota: " + this.getNota();
    }

    public void adicionarCandidato() {
        Scanner entrada = new Scanner(System.in);
        Candidato candidato = new Candidato();

        System.out.println("DIGITE O NOME DO CANDIDATO: ");
        String nome = entrada.nextLine();
        candidato.setNome(nome);
        System.out.println("DIGITE A MATRÍCULA DO CANDIDATO: ");
        int matricula = entrada.nextInt();
        candidato.setMatricula(matricula);
        System.out.println("DIGITE A NOTA DO CANDIDATO: ");
        double nota = entrada.nextDouble();
        candidato.setNota(nota);
        System.out.println(candidato);
        listaCandidatos.add(candidato);
        System.out.println("O CANDIDATO " + nome + " FOI INCLUÍDO COM SUCESSO.");
    }

    public void excluirCandidato(){
        Scanner entrada = new Scanner(System.in);
        Candidato candidato;
        int i = 0;

        System.out.println("DIGITE O NÚMERO DE MATRÍCULA: ");
        int matricula = entrada.nextInt();

        while (i < listaCandidatos.size()){
            candidato = listaCandidatos.get(i);
            if(candidato.getMatricula() == matricula){
                listaCandidatos.remove(i);
                System.out.println("O CANDIDATO FOI EXCLUÍDO COM SUCESSO.");
                break;
            } else if (candidato.getMatricula() != matricula){
                System.out.println("MATRÍCULA NÃO ENCONTRADA.");
                break;
            }
            i++;
        }
    }
    public void exibirLista() {
        System.out.println("LISTA DE CANDIDATOS: ");
        for (Candidato candidato : listaCandidatos) {
            System.out.println(candidato.toString());
        }
    }

}

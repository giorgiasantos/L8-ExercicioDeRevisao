package Ex02;

public class Candidato {

    //ATRIBUTOS
    private String nome;
    private int matricula;
    private double nota;

    // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return ("Candidato: " + this.getNome()) + " | Matrícula: " + this.getMatricula() + " | Nota: " + this.getNota();
    }
}

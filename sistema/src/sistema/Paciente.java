package sistema;

public class Paciente {
    int numProntuario;
    String nome;
    int idade;
    String especialidade;
    String dataConsulta;

    public Paciente(int numProntuario, String nome, int idade, String especialidade, String dataConsulta){
        this.numProntuario = numProntuario;
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
        this.dataConsulta = dataConsulta;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public int getProtuario(){
        return this.numProntuario;
    }

    public String toString(){
        return "Nome: " + this.nome + "\nIdade: " + this.idade +"\nNúmero do Prontuário: " +this.numProntuario;
    }
}

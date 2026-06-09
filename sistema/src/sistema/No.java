package sistema;

public class No {
    Paciente paciente;
    No esquerda;
    No direita;

    public No(Paciente paciente){
        this.paciente = paciente;
        this.esquerda = null;
        this.direita = null;
    }
}

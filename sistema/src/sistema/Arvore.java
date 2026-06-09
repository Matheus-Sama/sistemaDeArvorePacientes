package sistema;

public class Arvore {
    No raiz = null;
    int tamanho = 0;

    public void inserir(Paciente paciente, No lugar){
        if(lugar == null){
            System.out.println(" "+paciente.toString());
            raiz = new No(paciente);
        }else if(paciente.getProtuario() < lugar.paciente.getProtuario()){
            
        }
    }
}

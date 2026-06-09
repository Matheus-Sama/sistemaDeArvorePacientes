package sistema;

public class Arvore {
    No raiz = null;
    int tamanho = 0;

    public void inserir(Paciente paciente, No lugar){
        if(lugar == null){
            System.out.println(" "+paciente.toString());
            raiz = new No(paciente);
            tamanho++;
        }else if(paciente.getProtuario() < lugar.paciente.getProtuario()){
            if(lugar.esquerda == null){
                System.out.println(" "+paciente.toString());
                lugar.esquerda = new No(paciente);
                tamanho++;
            }else{
                inserir(paciente, lugar.esquerda);
            }
        }else if(paciente.getProtuario() > lugar.paciente.getProtuario()){
            if(lugar.direita == null){
                System.out.println(" "+ paciente.toString());
                lugar.direita = new No(paciente);
                tamanho ++;
            }else{
                inserir(paciente, lugar.direita);
            }
        }
    }

    public void preOrdem(No lugar){
        System.out.println(" " + lugar.paciente.toString());
        if(lugar.esquerda != null){
            preOrdem(lugar.esquerda);
        }
        if(lugar.direita != null){
            preOrdem(lugar.direita);
        }
    }
}

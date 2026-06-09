package sistema;

public class Arvore {
    No raiz = null;
    int tamanho = 0;

    public void inserir(Paciente paciente, No lugar){
        if(lugar == null){
            System.out.println(paciente.toString());
            raiz = new No(paciente);
            tamanho++;
        }else if(paciente.getProtuario() < lugar.paciente.getProtuario()){
            if(lugar.esquerda == null){
                System.out.println(paciente.toString());
                lugar.esquerda = new No(paciente);
                tamanho++;
            }else{
                inserir(paciente, lugar.esquerda);
            }
        }else if(paciente.getProtuario() > lugar.paciente.getProtuario()){
            if(lugar.direita == null){
                System.out.println(paciente.toString());
                lugar.direita = new No(paciente);
                tamanho ++;
            }else{
                inserir(paciente, lugar.direita);
            }
        }
    }

    public void preOrdem(No lugar){
        System.out.println(lugar.paciente.toString());
        if(lugar.esquerda != null){
            preOrdem(lugar.esquerda);
        }
        if(lugar.direita != null){
            preOrdem(lugar.direita);
        }
    }

    public void posOrdem(No lugar){
        
        if(lugar.esquerda != null){
            posOrdem(lugar.esquerda);
        }
        if(lugar.direita != null){
            posOrdem(lugar.direita);
        }
        System.out.println(lugar.paciente.toString());
    }

    public void ordemCres(No lugar){

        if(lugar.esquerda != null){
            ordemCres(lugar.esquerda);
        }
        System.out.println(lugar.paciente.toString());
        if(lugar.direita != null){
            ordemCres(lugar.direita);
        }

    }

    public void buscarProtuario(No lugar, int protuario){
        if(lugar.esquerda != null){
            if(lugar.paciente.getProtuario() == protuario){
                System.out.println(lugar.paciente.toString());
            }
            buscarProtuario(lugar.esquerda, protuario);
        }
        if(lugar.direita != null){
            if(lugar.paciente.getProtuario() == protuario){
                System.out.println(lugar.paciente.toString());
            }
            buscarProtuario(lugar.direita, protuario);
        }
    }
    
    public int altura(No lugar){
        if(lugar != null){
            int alturaEsq, alturaDir;

            alturaEsq = altura(lugar.esquerda);
            alturaDir = altura(lugar.direita);
            
            if(alturaEsq > alturaDir){
                return alturaEsq + 1;
            }else{
                return alturaDir + 1;
            }    
        }
        return 0;
    }

    public Paciente maiorProtuario(No lugar){

        if(lugar.direita != null){
            maiorProtuario(lugar.direita);
        }
        return lugar.paciente;

    }
    
    public Paciente menorProtuario(No lugar){
        if(lugar.esquerda != null){
            menorProtuario(lugar.esquerda);
        }
        return lugar.paciente;
    }

    public int getTamanho(){
        return tamanho;
    }

    public boolean removerPaciente(No lugar, int prontuario){
        No local = this.raiz;
        No localAtual = null;
        
        while(local != null){
            if(local.paciente.getProtuario() == prontuario){
                break;
            }else if(prontuario < local.paciente.getProtuario()){
                localAtual = local;
                local = local.esquerda;
            }else{
                localAtual = local;
                local = local.direita;
            }
            if(local != null){
                
                if(local.direita != null && local.esquerda != null){

                }else if(local.direita != null){

                }else if(local.esquerda != null){

                }else{
                    if(local.paciente.getProtuario() > localAtual.paciente.getProtuario()){
                        localAtual.direita = null;
                    }else{
                        localAtual.esquerda = null;
                    }
                }

                return true;
            }else{
                return false;
            }
        }
        return (local != null);
    }
}

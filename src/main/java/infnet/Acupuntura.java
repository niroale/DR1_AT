
package infnet;

import exceptions.QtdSessoesInvalidoExcepction;

public class Acupuntura extends Servico {

    private String localLesao;
    private int qtdSessoes;    
    
    public Acupuntura(String paciente, String veterinario, boolean emergencia, boolean focinheira) {
        super(paciente, veterinario, emergencia, focinheira);
    }

    @Override    
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(this.getLocalLesao());
        sb.append(";");
        sb.append(this.getQtdSessoes());

        return sb.toString();
    }     
    
    @Override
    public float calcularValor(){
        return this.isEmergencia() ? 200 : 100 + (this.getQtdSessoes() * 90);
    } 
    
    public String getLocalLesao() {
       return localLesao;
    }
       
    public int getQtdSessoes() {
       return qtdSessoes;
    }   

    public void setLocalLesao(String localLesao) {
       this.localLesao = localLesao;
    }    
    
     public void setQtdSessoes(int qtdSessoes) throws QtdSessoesInvalidoExcepction{
         if (qtdSessoes <= 0) {
             throw new QtdSessoesInvalidoExcepction("Quantidade de sessões inválida.");
         }
         this.qtdSessoes = qtdSessoes;
     }
    
}


package infnet;

import exceptions.QtdAnestesiaInvalidoExcepction;

public class Cirurgia extends Servico {
    private String local;
    private boolean alergico;
    private float qtdAnestesia;

    public Cirurgia(String paciente, String veterinario, boolean emergencia, boolean focinheira) {
        super(paciente, veterinario, emergencia, focinheira);
    }
    
    @Override    
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(this.getLocal());
        sb.append(";");
        sb.append(this.isAlergico());   
        sb.append(";");
        sb.append(this.getQtdAnestesia());

        return sb.toString();
    } 

    public String getLocal() {
       return local;
    }
    
    public boolean isAlergico() {
       return alergico;
    }    

    public float getQtdAnestesia() {
       return qtdAnestesia;
    }

    @Override
     public boolean UsarFocinheira(Paciente p){
         boolean usarFocinheira;
         if (p.getEspecie() == "Cachorro" || p.getEspecie() == "Gato") {
             return isFocinheira();
         } else{
             usarFocinheira = false;             
            return usarFocinheira;
         }

     }
     
    public void setLocal(String local){
        this.local = local;
    } 
    
    public void setAlergico(boolean alergico){
        this.alergico = alergico;
    }
     
    public void setQtdAnestesia(float qtdAnestesia) throws QtdAnestesiaInvalidoExcepction{
        if (qtdAnestesia <= 0) {
            throw new QtdAnestesiaInvalidoExcepction("Quantidade de anestesia inválida.");
        }
        this.qtdAnestesia = qtdAnestesia;
     } 
 
}

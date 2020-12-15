
package leitura;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;

import infnet.Acupuntura;
import infnet.Cirurgia;
import infnet.Neuro;

import java.io.IOException;
import exceptions.QtdConvulsaoException;
import exceptions.QtdSessoesInvalidoExcepction;
import exceptions.QtdAnestesiaInvalidoExcepction;

public class Arquivo {
    
    public static void main(String[] args){
        
        String dir = "C:/Users/Nicole/Desktop/Nicole/Infnet/Java/DR1";
        String arq = "pedido_vet.txt";
    
        try {

		FileReader leitura = new FileReader(dir+arq);			
		BufferedReader in = new BufferedReader(leitura);
			
		FileWriter escrita = new FileWriter(dir+"out_"+arq);			
		BufferedWriter out = new BufferedWriter(escrita);

		String linha = in.readLine();
                
                while (linha != null) {
                    
                    String[] campos = linha.split(";");
                    
                    switch (campos[0].toUpperCase()){
                        case "A":

                            	Acupuntura acupuntura = new Acupuntura(campos[1], String.valueOf(campos[2]), Boolean.valueOf(campos[3]), Boolean.valueOf(campos[4]));
				acupuntura.setLocalLesao(campos[5]);     
				acupuntura.setQtdSessoes(Integer.valueOf(campos[6]));
//				out.write(acupuntura.UsarFocinheira());
                                
				break;
   
                        case "C":

                            	Cirurgia cirurgia = new Cirurgia(campos[1], String.valueOf(campos[2]), Boolean.valueOf(campos[3]), Boolean.valueOf(campos[4]));
				cirurgia.setLocal(campos[5]);     
				cirurgia.setAlergico(Boolean.valueOf(campos[6]));
                                cirurgia.setQtdAnestesia(Float.valueOf(campos[7]));
                                
                                break;
                            
                        case "N":

                            	Neuro neuro = new Neuro(campos[1], String.valueOf(campos[2]), Boolean.valueOf(campos[3]), Boolean.valueOf(campos[4]));
				neuro.setVacinado(Boolean.valueOf(campos[5]));     
				neuro.setConvulsao(Boolean.valueOf(campos[6]));
                                neuro.setQtdConvulsaoDia(Integer.valueOf(campos[7]));                            
                                break;
                            
                        default: 
                                break;
                    } 
                    
                    linha = in.readLine();
            }

            in.close();
	    leitura.close();
			
            out.close();
            escrita.close();                
                
            System.out.println(args.length == 1 ? args[0] : "Gravado!");                    
        } catch (IOException | QtdConvulsaoException | QtdAnestesiaInvalidoExcepction | QtdSessoesInvalidoExcepction e) {
            System.out.println(e.getMessage());
        }
    
    }
}

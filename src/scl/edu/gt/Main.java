package scl.edu.gt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		   /*MENSAJE INICIAL DEL PROGRAMA*/
        Img txtMensaje = new Img();
        txtMensaje.Mensaje();
        
        /*ESTADO DEL PROGRAMA*/
        boolean on = true;
        
        /*INICIO DL PROGRAMA*/
        do {
        
        /*SOLICITANDO PROGRAMA*/	
        Scanner inputcommand = new Scanner(System.in);
        System.out.println("");
        System.out.print("~$");
        String output = inputcommand.nextLine();
        
        /*INSTANCIAS DE CLASE*/
        CommandList dateCommand = new CommandList();
        arithmeticFunctions fa = new arithmeticFunctions();
        explicacion exp = new explicacion();
        
        
        if(output.equals(dateCommand.command[0])) {
        	fa.sumar();
            
        }else if(output.equals(dateCommand.command[1])) {
			fa.restar();
      
        }else if(output.equals(dateCommand.command[2])) {
			fa.multiplicar();
			
        }else if(output.equals(dateCommand.command[3])) {
			fa.dividir();
			
		}else if(output.equals(dateCommand.command[4])) {
			fa.residuo();
			
		}else if(output.equals(dateCommand.command[5])) {
			
			help help = new help();
			help.CommandList();
			
		}else if(output.equals(dateCommand.command[6])) {
			exp.software();
		}else if(output.equals(dateCommand.command[7])) {
			exp.hardware();
		}else if(output.equals(dateCommand.command[8])) {
			exp.interpretes();
		}else if(output.equals(dateCommand.command[9])) {
			exp.compiladores();
		}else if(output.equals(dateCommand.command[10])) {
			exp.perifericos();
		}else if(output.equals(dateCommand.command[11])) {
			on = false;
		}
	
		else {
       System.out.println("Comando no encontrado");
       System.out.println("Ingresa help para más información");
        }
      }while(on);  
        
        System.out.println("Programa Finalizado");
	}
		
	
}
        
        
        
        
        
        
        
        
        
		
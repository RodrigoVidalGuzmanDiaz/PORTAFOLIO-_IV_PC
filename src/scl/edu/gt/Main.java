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
        help help = new help();
        
        
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
			help.CommandList();
		}else if(output.equals(dateCommand.command[6])) {
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
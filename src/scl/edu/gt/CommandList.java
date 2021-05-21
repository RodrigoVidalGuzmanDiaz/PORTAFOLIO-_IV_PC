package scl.edu.gt;

public class CommandList {
	
	String command		[] = new String [7];
	String information	[] = new String [7];
	int cantidadDecomandos;
	
	CommandList() {
		
		
		
		command[0]="sumar";
		command[1]= "restar";
		command[2]= "multiplicar";
		command[3]= "dividir";
		command[4]= "residuo";
		command[5]= "help";
		command[6]= "exit";
		
		
		information[0] = "\n		El comando puede realizar la suma\n		de dos numeros ya sean enteros o decimales, \n		el valor a retornar es un double.";
		information[1] = "";
		information[2] = "";
		information[3] = "";
		information[4] = "";	
		information[5] = "";
		information[6] = "";
		

	}
	
	

}
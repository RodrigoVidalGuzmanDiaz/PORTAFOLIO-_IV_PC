package scl.edu.gt;

public class CommandList {
	
	String command		[] = new String [12];
	String information	[] = new String [12];
	int cantidadDecomandos;
	
	CommandList() {
		
		
		
		command[0]="sumar";
		command[1]= "restar	";
		command[2]= "multiplicar";
		command[3]= "dividir";
		command[4]= "residuo";
		command[5]= "help";
		command[6]= "software";
		command[7]= "hardware";
		command[8]= "interpretes";
		command[9]= "periféricos";
		command[10]= "compiladores";
		command[11]= "exit";
		
		
		information[0]  = "\n		El comando puede realizar la suma\n		de dos numeros ya sean enteros o decimales, \n		el valor a retornar es un double.";
		
		information[1]  = "\n		El comando realiza una resta \n		de dos numeros ya sean enteros \n		o decimales, el valor es retornado \n		de un double.";
		
		information[2]  = "\n		El comando recibe datos numericos, \n		como enteros y decimales, el valor \n		los recibe un double.";
		
		information[3]  = "\n		El comando realiza una división con\n		numeros enteros o numeros en decimales, \n		el valor los recibe un double.";
		
		information[4]  = "\n		El comando refleja el sobrante de una división,\n		con numeros enteros, valor los recibe un int.";	
		
		information[5]  = "\n		Muestra los comandos disponibles de \n		la programación.";
		
		information[6]  = "\n		Son conjuntos de programas de cómputo así \n		como datos, procedimiento y que permite realizar \n		diferentes tareas en sistema informático.";
		
		information[7]  = "\n		Es la parte física de un ordenador o sistema \n		informático. Está formado por los componentes \n		tales como circuitos de cables y luz, placas, \n		memorias, discos duros, dispositivos periféricos.";
		
		information[8]  = "\n		Es el software que traduce los diferees \n		lenguajes de programación.";
		
		information[9]  = "\n		Es todo el hardware que permite que la\n		información pueda ingresar a la computadora, \n		o salir al exterior.";
		
		information[10] = "\n		Programas que analizan y ejecutan otros \n		programas";
		
		information[11] = "\n		Detiene la ejecución de las operaciones \n		que están realizando.";

	}
	
	

}
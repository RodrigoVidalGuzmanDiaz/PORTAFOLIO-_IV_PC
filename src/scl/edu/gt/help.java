package scl.edu.gt;

public class help {

	
	public static void CommandList() {
		
		
		CommandList datos = new CommandList();
		
		int cantidadDeComandos = datos.command.length;
		
		
		System.out.println("");
		for(int i = 0;i<cantidadDeComandos;i++) {
			System.out.print("" + datos.command[i]+ "│");
		}
		
	}
		
}

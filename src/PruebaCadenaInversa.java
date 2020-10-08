import java.util.Scanner;

class CadenaInversa{
	
	public void imprimirCadenaInversa(String cad,int i,String out) {
		
		if(i<cad.length()) {
			out = cad.charAt(i)+out;
			i+=1;
			imprimirCadenaInversa(cad,i,out);
		}else {
			System.out.println("cadena inversa : "+out);
		}
		
	}
	
}

public class PruebaCadenaInversa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		CadenaInversa ci = new CadenaInversa();
		
		boolean salir = false;
		byte opc=0;
		String cad="";
		
		do {
			System.out.println(" 1)Imprimir cadena invertida \n 2)Salir");
			opc = (byte) Validacion.validacionNatural();
			switch (opc) {
			case 1:
				System.out.println("Cadena:");
				cad = input.nextLine();
				ci.imprimirCadenaInversa(cad, 0, "");
				break;
			case 2:
				salir=true;
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
			
			
		} while (!salir);
		System.out.println("fin de ejecucion");
		
		
	}

}

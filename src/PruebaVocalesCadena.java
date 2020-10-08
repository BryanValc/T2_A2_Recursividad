import java.util.Scanner;

class VocalesCadena{
	
	public void contarVocales(String cad, int i, int cnt) {
		if(i<cad.length()) {
			char c = cad.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				cnt+=1;
			}
			i+=1;
			contarVocales(cad,i,cnt);
		}else {
			System.out.println("cantidad de vocales : "+cnt);
		}
	}
	
}


public class PruebaVocalesCadena {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VocalesCadena vc = new VocalesCadena();

		boolean salir = false;
		byte opc=0;
		String cad="";
		
		do {
			System.out.println(" 1)Contar vocales de una cadena \n 2)Salir");
			opc = (byte) Validacion.validacionNatural();
			switch (opc) {
			case 1:
				System.out.println("Cadena:");
				cad = input.nextLine();
				vc.contarVocales(cad, 0, 0);
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

import java.util.Scanner;

interface Validacion{
	Scanner input = new Scanner(System.in);
	public static int validacionNatural() {
		int ret = 0;
		boolean err = false;
		do {
			try {
				ret = input.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("entrada no valida, intente de nuevo:");
				input.nextLine();
				err=true;
			}
			if (ret>0) {
				err=false;
			}else {
				System.out.println("solo números naturales");
				err=true;
			}
		}while(err);
		return ret;
	}
}

class Divisores{
	public void obtenerDivisores(int it, int cons) {
		if(it<=cons) {
			if(cons%it==0) {
				System.out.println(it+"	");
			}
			obtenerDivisores((it+1),cons);
		}
	}
}

public class PruebaDivisores {

	public static void main(String[] args) {
		
		Divisores dv = new Divisores();
		
		boolean salir = false;
		byte opc=0;
		int cons=0;
		do {
			System.out.println(" 1)Sacar divisores \n 2)Salir");
			opc = (byte) Validacion.validacionNatural();
			switch (opc) {
			case 1:
				System.out.println("numero:");
				cons = Validacion.validacionNatural();
				dv.obtenerDivisores(1,cons);
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
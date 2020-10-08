class Factorial{
	
	public void obtenerFactorial(int it, int fact, int cons) {
		if(it<cons) {
			fact*=it;
			obtenerFactorial((it+1),fact,cons);
		}else if(it==cons) {
			fact*=it;
			System.out.println("El factorial es: "+fact);
		}
	}
	
}

public class PruebaFactorial {

	public static void main(String[] args) {
		
		Factorial ft = new Factorial();
		
		boolean salir = false;
		byte opc=0;
		int cons=0;
		do {
			System.out.println(" 1)Sacar factorial \n 2)Salir");
			opc = (byte) Validacion.validacionNatural();
			switch (opc) {
			case 1:
				System.out.println("numero:");
				cons = Validacion.validacionNatural();
				ft.obtenerFactorial(1,1,cons);
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

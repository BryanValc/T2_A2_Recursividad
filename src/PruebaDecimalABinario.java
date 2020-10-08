
class DecimalBinario{
	
	public void conversion(int decimal, String out) {
		if(decimal>1) {
			if(decimal%2==1) {
				out="1"+out;
			}else {
				out="0"+out;
			}
			decimal/=2;
			conversion(decimal,out);
		}else {
			System.out.println("1"+out);
		}
		
		
	}
	
}

public class PruebaDecimalABinario {

	public static void main(String[] args) {
		
		DecimalBinario db = new DecimalBinario();
		
		boolean salir = false;
		byte opc=0;
		int a=0;
		
		do {
			System.out.println(" 1)Convertir numero decimal a binario \n 2)Salir");
			opc = (byte) Validacion.validacionNatural();
			switch (opc) {
			case 1:
				System.out.println("Numero:");
				a = Validacion.validacionNatural();
				db.conversion(a, "");
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

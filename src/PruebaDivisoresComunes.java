
class DivisoresComunes{
	
	public void mostrarDivisores(int a, int b, int it, int cnt) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		if(it<min) {
			it+=1;
			mostrarDivisores(a, b, it, cnt);
		}else if(min<=it&&it<=max) {
			if(max%it==0) {
				System.out.println(it);
				cnt+=1;
			}
			it+=1;
			mostrarDivisores(a, b, it, cnt);
		}else {
			System.out.println("cantidad de divisores : "+cnt);
		}
	
	}
	
}


public class PruebaDivisoresComunes {

	public static void main(String[] args) {
		
		DivisoresComunes dc = new DivisoresComunes();
		
		boolean salir = false;
		byte opc=0;
		int a=0;
		int b=0;
		
		do {
			System.out.println(" 1)Sacar divisores \n 2)Salir");
			opc = (byte) Validacion.validacionNatural();
			switch (opc) {
			case 1:
				System.out.println("primer numero:");
				a = Validacion.validacionNatural();
				System.out.println("segundo numero:");
				b = Validacion.validacionNatural();
				dc.mostrarDivisores(a, b, 0, 0);
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

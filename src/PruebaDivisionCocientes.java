
class Division{
	
	public void mostrarCocientes(String dividendo, int divisor, int ln, int residuo) {
		String sDivisor=Integer.toString(divisor);
		if(sDivisor.length()<=dividendo.length()) {
			if(ln<=(dividendo.length()-sDivisor.length())) {
				int div=Integer.parseInt(dividendo.substring(ln,(ln+sDivisor.length())));
				div = (int) (div + (residuo*10));
				System.out.print("cociente "+(ln+1)+": ");
				System.out.println(div/divisor);
				residuo=div%divisor;
				String temp=dividendo.substring(0,ln);
				for (int i = ln; i < ln+sDivisor.length(); i++) {
					temp+='0';
				}
				temp+=dividendo.substring(ln+sDivisor.length());
				dividendo=temp;
				ln+=1;
				mostrarCocientes(dividendo,divisor,ln,residuo);
			}else {
				System.out.println("residuo: "+residuo);
			}
		}else {
			System.out.println("no se puede obtener cocientes enteros");
		}
	}
}

public class PruebaDivisionCocientes {

	public static void main(String[] args) {
		
		Division dv = new Division();
		
		boolean salir = false;
		byte opc=0;
		String dividendo="";
		int divisor=0;
		
		do {
			System.out.println(" 1)Sacar cocientes \n 2)Salir");
			opc = (byte) Validacion.validacionNatural();
			switch (opc) {
			case 1:
				System.out.println("dividendo:");
				dividendo = Integer.toString(Validacion.validacionNatural());
				System.out.println("divisor:");
				divisor = Validacion.validacionNatural();
				dv.mostrarCocientes(dividendo, divisor, 0, 0);
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

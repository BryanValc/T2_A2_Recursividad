
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
		
		CadenaInversa ci = new CadenaInversa();
		
		ci.imprimirCadenaInversa("anita lava la tina", 0, "");
		
	}

}

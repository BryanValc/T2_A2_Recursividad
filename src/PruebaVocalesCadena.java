
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
		
		VocalesCadena vc = new VocalesCadena();
		vc.contarVocales("bisabuelo", 0, 0);

		
	}

}

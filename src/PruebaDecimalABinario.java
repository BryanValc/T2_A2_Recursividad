
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
		
		db.conversion(89, "");
		
		
		

	}

}

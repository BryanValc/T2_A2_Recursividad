
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
		}
		
		
		
	}
	
	
}


public class PruebaDivisoresComunes {

	public static void main(String[] args) {
		
		DivisoresComunes dc = new DivisoresComunes();
		dc.mostrarDivisores(30, 5, 0, 0);
		
	}

}

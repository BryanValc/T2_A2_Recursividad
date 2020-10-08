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
		ft.obtenerFactorial(1,1,6);

	}

}

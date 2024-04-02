
package mamifero;


public class Ornitorrinco extends Mamiferos implements Oviparo{

	@Override
	public String amamantarCrias(){
		return "El ornitorrinco esta amamantando a su cria";
	}
	
	@Override
	public String ponerHuevos() {
		return "El ornitorrinco esta poniendo huevos";
	}
	
}

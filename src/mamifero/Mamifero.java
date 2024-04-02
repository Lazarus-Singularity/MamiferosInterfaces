package mamifero;

public class Mamifero {

	public static void main(String[] args) {

		Ornitorrinco ornitorrinco = new Ornitorrinco();

		System.out.println(ornitorrinco.amamantarCrias());
		System.out.println(ornitorrinco.ponerHuevos());

		Ballena ballena = new Ballena();

		System.out.println(ballena.amamantarCrias());

	}

}

package fr.unilim.iut.fizzbuzz2017;

public class FizzBuzz {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";

	public String jouer(int nombre) {
		
		if (Maths.estMultipleDe3(nombre) && Maths.estMultipleDe5(nombre) ) return "Fizz Buzz";
		if (Maths.estMultipleDe5(nombre)) return BUZZ;
		if (Maths.estMultipleDe3(nombre)) return FIZZ;
		
		return String.valueOf(nombre);
	}

}

package lab6ex3;

/* Open Closed Principle. Codul trebuie organizat in asa fel incat sa fie deschis la extensie
 * (sa putem introduce animale noi cu functionalitati diferite), folosindu-ne de o signura metoda
 * mostenita de la superclasa. (move).
 * Ne folosim de polimorfism si mostenire
 * In fiecare subclasa, move() implementeaza comportamentul diferit fiecaror animale.
 * 
 */

public abstract class Animal {
	public abstract void move();

}

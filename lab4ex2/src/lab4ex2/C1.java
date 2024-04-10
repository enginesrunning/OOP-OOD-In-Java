package lab4ex2;

/* proiectati o clasa c1, citeste doua numere de la tastatura si calculeaza suma prin getSum()
 * C2 primeste ca parametru un string JSON cu doua chei, n1 si n2 si permite accesul la nr coresp
 * cheilor n1 si n2
 * dezvoltarea unui adaptor al clasei c2 la c1, permite calculul sumei celor doua chei
 * 
 *  
 *  
 *  
 *  */

import java.util.Scanner;

public class C1 {
 private int num1;
 private int num2;

 public void readNumbers() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter first number: ");
     num1 = scanner.nextInt();
     System.out.print("Enter second number: ");
     num2 = scanner.nextInt();
 }

 public int getSum() {
     return num1 + num2;
 }
}


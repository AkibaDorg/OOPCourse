package week2;
import java.lang.Math;

public class numcalc {
	
	/**
	 * @author Jett Black
	 * isPrime checks if some given int num is prime
	 * uses the fact that given integers a, b, and x
	 * where a * b = x, a >= sqrt(x) XOR b >= sqrt(x).
	 * The fact all square numbers are nonprime is also used.
	 * <p>
	 * This saves significant time compared to checking
	 * all integers from 2 through num - 1.
	 * 
	 * @param num
	 * @return true only if num is prime
	 */
	public static boolean isPrime(int num) {
		boolean result = true;
		
		// type cases num since sqrt takes in double, then typecase return to int
		double square = (int)Math.sqrt(num);
		
		if (square == Math.floor(square) && !Double.isInfinite(square)) {
			return false;
		}
		
		// type cast double for looping
		int squareint = (int)square;
		
		// simple loop checking from 2 to sqrt(num) if num mod i is 0
		for(int i = 2; i <= squareint; i++) {
			if(num % i == 0) {
				return false;
			}
			
		}
		
		return result;
	}
	public static void main(String[] args) {
		// RNG
		int num = (int)(Math.random()*101);
		
		boolean x = isPrime(num);
		
		System.out.println("is " + num + " prime: " + x);
		
	}
	
}

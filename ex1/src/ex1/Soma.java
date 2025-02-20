package ex1;
import java.util.*;

class Soma {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int x, y;
		
		System.out.print("Digite o primeiro número: ");
		x = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		y = sc.nextInt();
		
		System.out.println("Soma: " + (x+y));
	}

}

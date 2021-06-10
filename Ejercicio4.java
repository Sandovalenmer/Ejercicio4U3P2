import java.util.*;

public class Ejercicio4 {

	public static void main(String args[]) {
		String asignar;
		int cma, cme, n;
		double i;
		Scanner scanner = new Scanner(System.in);
		cma = 0;
		cme = 0;
		for (i=1;i<=20;i++) {
			System.out.println("Ingrese edades");
			n = scanner.nextInt();
			if (n<18) {
				cme = cme+1;
			} else {
				cma = cma+1;
			}
		}
		System.out.println("Personas menores de edad "+cme+", y personas mayores de edad "+cma);
	}


}


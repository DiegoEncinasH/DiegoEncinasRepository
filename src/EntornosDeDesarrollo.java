import java.util.Scanner;

public class EntornosDeDesarrollo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int DaysMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int n, mes, dia, count, x=0;

		n = sc.nextInt(); // Preguntas cuantas fechas quiere introducir

		for (int i = 0; i < n; i++) {
			count = 0; // count son los dias que quedan hasta fin de año
			dia = sc.nextInt();
			mes = sc.nextInt();
			
			for (int j = mes; j <= 11; j++) { // contadpr de dias de los meses

				count += DaysMonth[j];
				

			}
			// Contador de dias del mismo mes introducido Ej: Dia dos de Febrero, SE reta 28
			// dias que tiene el mes a los dias introducidos 28-2
			count += DaysMonth[mes-1] - dia;

			System.out.println(count);

		}

	}
}




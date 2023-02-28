
public class EjercicioUno {

	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFin = 14;
		int contador = numeroInicio;
		boolean mostrarPares = true;

		while (contador >= numeroInicio && contador <= numeroFin) {
			if (mostrarPares) {
				if (contador % 2 == 0) {
					System.out.print(contador + " ");
				}
			}

			if (!mostrarPares) {
				if (contador % 2 == 1) {
					System.out.print(contador + " ");
				}
			}
			contador++;

		}
		System.out.println("");
		conFor();

	}

	public static void conFor() {
		int numeroFin = 14;
		int numeroInicio = 5;

		for (int contador = numeroFin; contador > numeroInicio; contador--) {
			if (contador % 2 == 0) {
				System.out.print(contador + " ");
			}
		}
	}

}

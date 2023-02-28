
public class EjercicioDos {
	private static final double INGRESOS = 489.083;
	private static final int VEHICULOS = 3;
	private static final int INMUEBLES = 3;
	
	/* Poseer una embarcación, una aeronave de lujo o ser titular de activos
	societarios */
	
	public static void main(String[] args) {
		
		double ingresosHogar = 500.000;
		int cantidadVehiculos = 1;
		int cantidadInmuebles = 1;
		boolean poseeEmbarcacion = false;
		boolean poseeAeronave = false;
		boolean poseeActivosSocietarios = false;
		
		
		if (ingresosHogar > INGRESOS || 
				cantidadVehiculos > VEHICULOS || 
				cantidadInmuebles > INMUEBLES ||
				poseeEmbarcacion ||
				poseeAeronave ||
				poseeActivosSocietarios
				) {
			System.out.println("La persona pertenece al segmento de ingresos altos");
		}else {
			System.out.println("La persona NO pertenece al segmendo de ingresos altos");
		}
		
	}

}

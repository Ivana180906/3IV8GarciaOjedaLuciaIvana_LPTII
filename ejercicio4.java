public class ejercicio4{
	private String id_empleado;
	private String nombre;
	private String puesto;
	private double sueldo_quincenal[];

	public void pideDatos(){
		sueldo_quincenal = new float[24];
		System.out.print("ID del empleado: ");
		id_empleado=Leer.dato();
		System.out.print("Nombre: ");
		nombre=Leer.dato();
		System.out.print("Puesto: ");
		puesto=Leer.dato();
		System.out.print("Sueldo Quincenal:");
		sueldo_quincenal[0]=Leer.datoFloat();

		if (!(puesto.equals("empleado") || puesto.equals("supervisor"))) {
			System.out.println("El puesto no existe");
			id_empleado="";
			nombre="";
			puesto="";
			sueldo_quincenal[0]=0f;
			return;
		}
		
		if ((puesto.equals("empleado") && sueldo_quincenal[0] != 5000f) || (puesto.equals("supervisor") && sueldo_quincenal[0] != 8000f)) {
			System.out.println("El sueldo no corresponde al puesto");
			id_empleado="";
			nombre="";
			puesto="";
			sueldo_quincenal[0]=0f;
			return;
		}
		System.out.println("Datos aceptados!");
	}

	public void calculaSueldo(){
		int i=0;
		int quincenas=0;
		float sueldo_orig=0.0f;
		int horas_diurnas=0;
		int horas_noches=0;
		float sueldo_total=0.0f;
		
		sueldo_orig=sueldo_quincenal[0];
		System.out.println("----=======================----");
		System.out.println("Numero de quincenas a calcular: ");
		quincenas = Leer.datoInt();
		
		switch (puesto) {
		case "empleado" :
				for (i=0;i<quincenas;i++) {
					System.out.println("Horas extras diurnas de quincena "+(i+1)+": ");
					horas_diurnas=Leer.datoInt();
					System.out.println("Horas extras nocturnas de quincena "+(i+1)+": ");
					horas_noches=Leer.datoInt();
					sueldo_quincenal[i]=sueldo_orig+horas_diurnas*50f+horas_noches*60f;
				}
				break;
		case "supervisor" :
				for (i=0;i<quincenas;i++) {
					sueldo_quincenal[i]=sueldo_orig-sueldo_orig*0.002f-sueldo_orig*0.001f-sueldo_orig*0.0016f;
				}
				break;
		}

		for (i=0;i<quincenas;i++) {
			sueldo_total=sueldo_total+(float)sueldo_quincenal[i];
		}

		System.out.println("----====| Datos del empleado |====----");		
		System.out.println("ID     : "+id_empleado);
		System.out.println("Nombre : "+nombre);
		System.out.println("Puesto : "+puesto);
		System.out.println("Sueldo : "+sueldo_orig);
		System.out.println("Sueldo Total de "+quincenas+" quincenas: "+sueldo_total);
	}
}
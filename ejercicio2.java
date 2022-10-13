class ejercicio2
{
	public static void main(String [] args){
		int opc = 0;
		int base = 0;
		int altura = 0;
		int radio = 0;
		int lado = 0;
		double area = 0.0;
        double perimetro = 0.0;
		
		System.out.println("---AREAS GEOMETRICAS---");
		System.out.println("");
		System.out.println("A CIRCULO");
		System.out.println("B CUADRADO");
		System.out.println("C RECTANGULO");
		System.out.println("D TRIANGULO");
		System.out.println("");
		System.out.println("TECLEE LA OPCION DESEADA");
		opc = Leer.datoInt();
		
		switch (opc)
		{
			case 'a':
				System.out.println("INGRESA EL RADIO");
				radio = Leer.datoInt();
				area = (radio * radio) * 3.1415f;
				break;
			case 'b':
				System.out.println("INGRESA LA MEDIDA DEL LADO");
				lado = Leer.datoInt();
				area = lado * lado;
				break;
			case 'c':
				System.out.println("INGRESA LA BASE");
				base = Leer.datoInt();
				
				System.out.println("INGRESA LA ALTURA");
				altura = Leer.datoInt();
				area = base * altura;
				break;
			case 'd':
				System.out.println("INGRESA LA BASE");
				base = Leer.datoInt();
				System.out.println("INGRESA LA ALTURA");
				altura = Leer.datoInt();
				area = (base * altura) / 2;
				break;

		}
		
		System.out.println("EL AREA DE LA FIGURA ES: " + area);	
	
	}
}	

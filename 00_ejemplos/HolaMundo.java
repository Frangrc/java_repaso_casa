class HolaMundo{
	public static void main (String argumentos[])
	{
		System.out.println("Hola mundo");
	for (int i=0; i<argumentos.length; i++)
	{
		System.out.println("Arg " + i + " = " + argumentos[i]);
	}
int entero;
entero=1234567890;
float decimal=123456789f;
double doblePrecision=12345678901234D;
long enteroLargo=12345678901234567L;
byte unByte=-127; //Hasta 127
System.out.println("entero = " + entero);
System.out.println("decimal = " + decimal);
System.out.println("doble = " + doblePrecision);
System.out.println("enteroLargo = " + enteroLargo);
System.out.println("unByte = " + unByte);
char caracter='A';
String texto;
texto= "Texto de prueba";
System.out.println("caracter = " + caracter);
System.out.println("texto = " + texto);
}
}


//C:\Users\Admin\Desktop\CURSO_JAVA>
//C:\Users\Admin\Desktop\CURSO_JAVA>javac HolaMundo.java

//C:\Users\Admin\Desktop\CURSO_JAVA>java HolaMundo
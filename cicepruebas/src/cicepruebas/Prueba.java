package cicepruebas;

import java.io.File;

public class Prueba {
	
		int i = 0;
	
		public  int calcula ()
		{
			int i = 5;
			
			System.out.println("I local = " +i);
			System.out.println("I de calcula =" +i);
			return i;
		}
		public static void main (String [] argumentos)
		{

			try {
				Prueba prueba = null;
				prueba.calcula();
				
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("Ha ocurrido una excepción");
				e.printStackTrace();
			}
			
			File file = null;
			
			file = new File("C:/org");
			try {
				FileReader fr = new FileReader(file);
			} catch (Exception e) {
				// TODO: handle exception
				
				System.out.println("ha habido un error");
				e.printStackTrace();
			}
			
			
			
			//Prueba prueba = null;
			
			
			//System.out.println (prueba.calcula());
			//for (int a=0; (a%6)<6; a++)
			//{
				//System.out.println (a);
			//}
			//while 0...N
			//do-while cuando se ejecuta aunque sela una vez 1....N
			//For n de veces fijo
			
			//System.out.println(prueba.hashCode());
			//LOG4J 
			
			
			
		}
	}


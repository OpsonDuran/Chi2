package Chi2;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static String linea;
	   public static void main(String[] arg) throws IOException{
	  double[][] h=new double[20][20];  
	  double chi;
	  String ruta = "C:/Users/Opson/Documents/Analisis y tratamiento de la informacion/Chi2/archivo.txt";
	  File archivo = new File(ruta);
	  BufferedReader reader=new BufferedReader(new FileReader(archivo));
	  int j=0;
	  int n=0;
	  while ((linea = reader.readLine()) != null) {
	  String[] arreglo_datos = linea.split(":");
	  n=arreglo_datos.length;
	  for (int i=0; i<arreglo_datos.length; i++){
	      
	        h[i][j]= Double.parseDouble(arreglo_datos[i]);
	    	
	 }
	  j++;
	 
	  }
	  
	  
	  for(int k=0; k<2;k++){
	       System.out.println("---");
	  for (int i=0; i<n; i++){
	      
	      System.out.println(h[i][k]);
	  }
	}
	  double suma=0;
	   for (int i=0; i<n; i++){
	      
	      suma= suma+ Math.pow((h[i][0]-h[i][1]),2)/h[i][1];
	       
	  }
	   System.out.println("Chi 2=  "+ suma);
	   

	}}

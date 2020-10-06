package TRABAJOS_PROGRAMACION;

import java.io.*;


public class lector_csv_y_promedio_de_notas {
   
    public static final String delimiter = ",";                      //identifica que el archivo esta separado por ","
   
   public static void read(String csvFile) {
	      try {
		         File file = new File(csvFile);                      //abre el archivo
		         FileReader fr = new FileReader(file);               //lee el archivo
		         BufferedReader br = new BufferedReader(fr);        //lee y guarda los datos del archivo
		         String line = "";                                  // son variables queutilizaremos mas tarde
		         String[] tempArr;                               
		         float sumapromestud = 0;
		         int cont = 1;                                      //** 
		         while((line = br.readLine()) != null) {            //lee cada linea del archivo  
		        	 
		        	 float num = 0;                                // variable
		        	 tempArr = line.split(delimiter);              //variable que coge la variable line y lo delimita por el delimitador        
		        	 for(int i = 2; i<=5;i++) {                     // ciclo for
		                num += Float.parseFloat(tempArr[i]);           //operacion que guarda las varibles de la fila del archivo
		            }
		        	 
		          float promedio = num /4;                            // operacion que saca el promedio de los estudiantes
		          System.out.println("Promedio estudiante "+cont+": "+promedio);       // imprime el promedio de los estudiantes
		          sumapromestud += promedio;                           // guarda la variable d elos estudiantes en una para sacar el total del promedio del salon
		          cont ++;                                              //contador      
		         }
		         float promeTotaldelsalon = sumapromestud / 19;          //operacion para sacar el promedio total de los estudiantes 
		         System.out.println("Promedio total del salón es: "+promeTotaldelsalon); // imprime el promedio total de lo s estudiantes
		         
		         } catch(IOException ioe) {
		            ioe.printStackTrace();
		         }

		   }
		   
   
   public static void main(String[] args) {
      String csvFile = "C:\\Users\\Admin\\eclipse-workspace\\HOLAGENTE\\src\\TRABAJOS_PROGRAMACION\\PromedioCSV.csv"; //direccion del archivo csv
      lector_csv_y_promedio_de_notas.read(csvFile);     //funcion    
      
   }
}


package clasearchivos2;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("src//clasearchivos2//datos.txt");
        ArrayList<Liga> ligas = new ArrayList<Liga>();
        int numLigas = 0;
        int numEquipos = 0;
        
        if (f.exists()) {
            try {
                Scanner input = new Scanner( f );

                if (input.hasNextInt()) {
                    numLigas = input.nextInt();
                    System.out.println("Numero de ligas: " + numLigas);
                      
                    for (int i = 0; i < numLigas; i++ ) {
                        Liga liga;
                        if (input.hasNext()){
                            liga = new Liga(input.next());
                            
                            if (input.hasNextInt()){
                                numEquipos = input.nextInt();
                                
                                for (int j = 0; j < numEquipos; j++) {
                                    if (input.hasNext()) liga.addEquipo(input.next());
                                }
                            }
                            ligas.add(liga);
                        }  
                    }
                }
                
            } catch(IOException e) {
                System.out.println("No existe el archivo");
            }
        }
        
        File archivoSalida = new File("src//clasearchivos2//output.txt");
        PrintStream salida = null;
        
        if (!archivoSalida.exists()) {
            try{
                archivoSalida.createNewFile();
                salida = new PrintStream( archivoSalida );
                
                for(Liga liga : ligas) {
                    for (Equipo equipo : liga.getEquipos()){
                        salida.println(equipo.getNombre());
                    }
                }
                
                salida.flush();
                salida.close();
            } catch (IOException fn) {
                System.out.println("No existe un archivo");
            }
  
        }
    }
}

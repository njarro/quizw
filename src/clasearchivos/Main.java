
package clasearchivos;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("src//clasearchivos//x");
        if(f.exists()) {
            System.out.println("Existe");
            
            if(f.isDirectory()) {
                String[] elementos = f.list();
                for (int i = 0; i < elementos.length; i++) {
                    if (elementos[i].endsWith(".txt")) System.out.println(elementos[i]);
                    else{
                        File f2 = new File ("src//clasearchivos//x//" + elementos[i]);
                        String[] subElementos = f2.list();
                        System.out.println(elementos[i]);
                        for (int j = 0; j < subElementos.length; j++) {
                            System.out.println(subElementos[j]);
                        }
                    }
                }
            }
            else if(f.isFile()) System.out.println("Es archivo");
            
        }else System.out.println("No existe");

        f.list(); //Retorna un arreglo de los nombres de los archivos de una carpeta
        
    }
    
}

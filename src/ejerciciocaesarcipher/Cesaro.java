package ejerciciocaesarcipher;


import java.util.TreeMap;

public class Cesaro {
    static int key = 23;
    private final String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private TreeMap<Character, Integer> abc_inv = new TreeMap<>();
    Cesaro(){
        for (int i=0;i<abc.length(); ++i){
            abc_inv.put( abc.charAt(i) , i);
        }
    }
    
    /**
     *
     * @param texto
     * @param n, -1 para usar valor por defecto
     * @return
     */
    public String unencript(String texto , int n ){
        String ans="";
        if (n>-1){
            key=n;
        }
        for (int i=0;i<texto.length();++i){
            ans+= Character.toString(abc.charAt((abc_inv.get(texto.charAt(i))+26+key)%26));
        }
        
        return ans;
    }
}

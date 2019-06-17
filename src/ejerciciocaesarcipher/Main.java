package ejerciciocaesarcipher;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("src//ejerciciocaesarcipher//datos.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 

        String st; 
        Cesaro c = new Cesaro();
        
        Vector <String[]> lectura = new Vector<String[]>();
        
        Company compania = new Company("Compania z");
        
        try {
            while ((st = br.readLine()) != null) {
                String[] s = st.split(",");
                int cnt=0;
                for (String a: s){
                    if (esTexto(a)) s[cnt]= c.unencript(s[cnt], -1);
                    
                    cnt++;
                }
                lectura.add(s);
            }  
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                    
        for (String[] s : lectura){
            if (s[0].equals("STOCK")){
                Stock stock = new Stock(s[1],Double.parseDouble(s[2]),
                    Double.parseDouble(s[3]), Integer.parseInt(s[4]));
                compania.addStock(stock);
            } else if (s[0].equals("DIVSTOCK")){
                DividentStock dividentStock = new DividentStock(s[1], Double.parseDouble(s[2]),
                        Double.parseDouble(s[3]), Integer.parseInt(s[4]), Double.parseDouble(s[5]));
                compania.addDividentStock(dividentStock);
            } else if (s[0].equals("CASH")){
                Cash cash = new Cash(Double.parseDouble(s[1]));
                compania.addCash(cash);
            } else if (s[0].equals("MUTUAL")){
                MutualFund mutualFund = new MutualFund(s[1], Double.parseDouble(s[2]), Double.parseDouble(s[3]),
                Double.parseDouble(s[4]));
                compania.addMutualFund(mutualFund);
            }
        }
        
        System.out.println(compania);
        System.out.println("Valor total en el mercado de Google y Samsung: " 
                           + compania.getStocksAndDividentsValue());
        System.out.println("Valor total en el mercado de todos los tipos de Asset: " 
                           + compania.getAssetsTotalValue());
        System.out.println("Beneficio total de todos los tipos de Asset: " 
                           + compania.getAssetsTotalProfit());
    }
    
    public static  boolean esTexto (String s){
        String num = "1234567890";
        for (int i = 0; i < 10; ++i){
            if (s.charAt(0) == num.charAt(i)) return false;   
        }
        return true;
    }
}

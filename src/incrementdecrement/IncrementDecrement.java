/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementdecrement;

/**
 *
 * @author Fitriany Chairunnisa
 */
public class IncrementDecrement {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        int b=100;
        
        System.out.println("Increment :");
        for(int i=a;i<=b;i++)
            {
                 System.out.println(""+inc(5,i)+",");
            }
        
        System.out.println("Decrement :");
         for(int i=b;i>=a;i--)
            {
                System.out.print(""+inc(5,i)+",");
            }
       
    }
    
    /**
     * Fungsi untuk menghitung digitnya 
     * @param digit digit = berapa digit angka yang diinginkan
     * @param angka angka = angka mulainya
     * @return (stringNol+""+angka) = angka 0 dan angka dibelakangnya
     */
    static String inc(int digit, int angka)
    {
          String  textAngka = Integer.toString(angka);
          int  panjangText = textAngka.length();
          String  stringNol = "";
         int jumlahNol = digit - panjangText;
            for (int x =0; x<jumlahNol; x++)
            {
              stringNol +="0";
            }
    
        return (stringNol+""+angka) ;
    }
            
}


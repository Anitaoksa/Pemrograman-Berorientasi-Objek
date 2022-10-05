/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author acer
 */
public class Lingkaran {
    
    // membuat variabel 
    int jejari;
    
    // membuat method 
  void hitungLuas (){
        double luas = (double) ((double) 3.14 * (this.jejari * this.jejari)); 
        System.out.println("Luasnya = " + luas);
    }
    void hitungKeliling (){
        double keliling = (double) ((double)2 * 3.14 * this.jejari);
        System.out.println("Kelilingnya =" + keliling);
        
    }
    
   
    
}

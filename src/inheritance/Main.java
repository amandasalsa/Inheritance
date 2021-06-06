/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Amanda
 */
public class Main {
    public static void main(String[] args) {
        
        Tampilan display = new Tampilan();
        TokoElektronik toko = new TokoElektronik();
        
        display.tampilan();
        toko.daftar();
  
    }
    
}

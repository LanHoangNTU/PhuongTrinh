/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Lân
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GiaiPTBac2 bac2 = new GiaiPTBac2();
        bac2.setThamSo(new ThamSoBanPhim());
        bac2.setKetQua(new KetQuaBanPhim());
        bac2.xuLy();
    }
    
}

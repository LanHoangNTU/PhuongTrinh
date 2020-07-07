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
public class KetQuaBanPhim implements IKetQua{

    @Override
    public void inKQ(int[] arr, String kq) {
        System.out.println("Pt: " + arr[0] + "x2 + " + arr[1] + "x + " + arr[2] + " = 0");
        System.out.println("Ket qua: \n" + kq);
    }
    
}

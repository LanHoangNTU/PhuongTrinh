/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Lân
 */
public class ThamSoBanPhim implements IThamSo{

    public ThamSoBanPhim() {
    }

    @Override
    public int[] setThamSo() {
        int[] arr = new int[3];
        System.out.print("Nhap tham so: \na = ");
        Scanner scanner = new Scanner(System.in);
        arr[0] = scanner.nextInt();
        System.out.print("\nb = ");
        arr[1] = scanner.nextInt();
        System.out.print("\nc = ");
        arr[2] = scanner.nextInt();
        
        return arr;
    }
    
}

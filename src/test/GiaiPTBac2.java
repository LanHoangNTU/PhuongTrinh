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
public class GiaiPTBac2 {
    IThamSo thamSo;
    IKetQua ketQua;
    int[] arr = new int[3];
    String kq;

    public GiaiPTBac2() {
    }

    public IThamSo getThamSo() {
        return thamSo;
    }

    public void setThamSo(IThamSo thamSo) {
        this.thamSo = thamSo;
    }

    public IKetQua getKetQua() {
        return ketQua;
    }

    public void setKetQua(IKetQua ketQua) {
        this.ketQua = ketQua;
    }
    
    private String getKqStr(){
        double a = (double)arr[0];
        double b = (double)arr[1];
        double c = (double)arr[2];
        
        double delta = (b*b) - (4*a*c);
        String s = String.format("Delta: %f\n", delta);
        if (a == 0) {
            s+= "x = " + -c/b;
        }
        else if (delta < 0) {
            s+= "PT vo nghiem";
        }
        else if (delta == 0) {
            s+= "x1 = x2 = " + -b/(2*a);
        }
        else{
            s+= "x1 = " + (-b + Math.sqrt(delta)/2*a) + "\nx2 = " + (-b - Math.sqrt(delta)/2*a);
        }
        
        return s;
    }
    
    public void xuLy(){
        this.arr = thamSo.setThamSo();
        this.ketQua.inKQ(arr, getKqStr());
    }
}

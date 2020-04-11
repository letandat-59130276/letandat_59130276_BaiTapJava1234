/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Con Meo Cutee
 */
public class Main {
    public static void main(String[] args) 
    {
        SinhVienIT sinhVienIT = new SinhVienIT("Le Tan Dat", 10.0, 10.0, 10.0);
        sinhVienIT.Xuat();

        SinhVienBiz sinhVienBiz = new SinhVienBiz("Tran Thanh Tam", 5.0, 8.0);
        sinhVienBiz.Xuat();
    }
}

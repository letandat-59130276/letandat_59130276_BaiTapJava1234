/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Con Meo Cutee
 */
public class NoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKm;

    public NoiThanh(String maSo, String hoTen, String soXe, int soTuyen, double soKm, long doanhThu) {
        super(maSo, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public void Xuat() {
        System.out.println("Ma so:"+maSo+", Hoten:"+hoTen+", So xe:"+soXe+", So Tuyen"+soTuyen+"So km:"+soKm+", Doanh thu:"+doanhThu);
    }
}

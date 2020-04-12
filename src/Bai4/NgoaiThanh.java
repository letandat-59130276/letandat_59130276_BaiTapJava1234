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
public class NgoaiThanh extends ChuyenXe {
    private final double soNgay;
    private final String noiDen;

    public NgoaiThanh(String maSo, String hoTen, String soXe, String noiDen, double soNgay, double doanhThu) {
        super(maSo, hoTen, soXe, doanhThu);
        this.soNgay = soNgay;
        this.noiDen = noiDen;
    }

    @Override
    public void Xuat() {
        System.out.println("Ma so: " + maSo + " -- Hoten: " + hoTen + " -- So xe: " + soXe + " -- Noi den: "
            + noiDen + " -- So ngay: " + soNgay + " -- Doanh thu: " + doanhThu);
    }
}
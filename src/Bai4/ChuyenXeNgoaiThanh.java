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
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private double soNgay;
    private String noiDen;

    public ChuyenXeNgoaiThanh(String maSo, String hoTen, String soXe, String noiDen, double soNgay, long doanhThu) {
        super(maSo, hoTen, soXe, doanhThu);
        this.soNgay = soNgay;
        this.noiDen = noiDen;
    }
    
    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    
    public double getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(double soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public void Xuat() {
        System.out.println( "Ma so:" + maSo + 
                            ", Hoten:" + hoTen +
                            ", So xe:" + soXe +
                            ", Noi den:" + noiDen +
                            ", So ngay:" + soNgay +
                            ", Doanh thu:" + doanhThu);
    }
}
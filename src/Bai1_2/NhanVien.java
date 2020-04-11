/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_2;

/**
 *
 * @author Con Meo Cutee
 */
public class NhanVien 
{
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongSoGioLam;


    public void setTen(String ten) {
        this.ten = ten;
    }


    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }


    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }


    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }


    public NhanVien() {
    }

    
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    
    public double getThuong() {
        if (tongSoGioLam >= 200) return tienLuong * 0.2;
        else if (tongSoGioLam >= 100) return tienLuong * 0.1;
        else return 0;
    }
    
    
    public String getThongTin() {
        return "Ten: " + ten + " -- Tuoi:" + tuoi + " -- Dia chi:" + diaChi + " -- Tien luong:" + tienLuong + " -- Tong so gio lam:" + tongSoGioLam + " -- Tien thuong: " + getThuong();
    }
}
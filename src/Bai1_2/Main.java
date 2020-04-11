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
public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Le Tan Dat");
        nv1.setTuoi(22);
        nv1.setDiaChi("Nha Trang - Khanh Hoa");
        nv1.setTienLuong(100000);
        nv1.setTongSoGioLam(200);
        System.out.println("Thong tin cua nhan vien:\n" + nv1.getThongTin());

        NhanVien nv2 = new NhanVien("Nguyen Duc Manh", 22, "TP.HCM", 140000, 120);
        System.out.println("Thong tin cua nhan vien:\n" + nv2.getThongTin());

        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        NhanVien nv3 = new NhanVien("Tran Van Tin", 20, "Ha Noi", 150000, 150);
        NhanVien nv4 = new NhanVien("Nguyen Thien Thuat", 25, "Bac Ninh", 170000, 130);
        NhanVien nv5 = new NhanVien("Nguyen Dinh Nguyen", 27, "Khanh Hoa", 110000, 140);

        quanLyNhanVien.them(nv1);
        quanLyNhanVien.them(nv2);
        quanLyNhanVien.them(nv3);
        quanLyNhanVien.them(nv4);
        quanLyNhanVien.them(nv5);

        quanLyNhanVien.inDS();

    }
}

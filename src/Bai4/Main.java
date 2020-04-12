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
public class Main {

    public static void main(String[] args) 
    {
        NoiThanh noiThanh1 = new NoiThanh("1","Tran Thanh Thi","123",20,200,100000);
        NoiThanh noiThanh2 = new NoiThanh("2","Tran Van Thanh","1203",10,150,60000);
        NoiThanh noiThanh3 = new NoiThanh("3","Nguyen Khoa","723",15,1850,85000);

        QuanLyChuyenXe quanLyChuyenXe=new QuanLyChuyenXe();
        
        quanLyChuyenXe.them(noiThanh1);
        quanLyChuyenXe.them(noiThanh2);
        quanLyChuyenXe.them(noiThanh3);
        
        NgoaiThanh ngoaiThanh1 = new NgoaiThanh("4","Tran Thanh Thi","331","HN",20,7000000);
        NgoaiThanh ngoaiThanh2 = new NgoaiThanh("5","Tran Thanh Thi","777","TPHCM",10,3500000);
        NgoaiThanh ngoaiThanh3 = new NgoaiThanh("6","Tran Thanh Thi","227","Nha Trang",15,6000000);

        quanLyChuyenXe.them(ngoaiThanh1);
        quanLyChuyenXe.them(ngoaiThanh2);
        quanLyChuyenXe.them(ngoaiThanh3);
        
        System.out.println("Thong tin tung chuyen xe:\n");
        quanLyChuyenXe.xuat();

        System.out.println("\nTong doanh thu cua xe noi thanh:"+quanLyChuyenXe.tinhDoanhThuNoiThanh());
        System.out.println("Tong doanh thu cua xe ngoai thanh:"+quanLyChuyenXe.tinhDoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu: "+quanLyChuyenXe.tinhTongDoanhThu());
    }
}
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

    public static void main(String[] args) {
	// write your code here
        ChuyenXeNoiThanh noiThanh1 = new ChuyenXeNoiThanh("1","Tran Thanh Thi","123",20,200,100000);
        ChuyenXeNoiThanh noiThanh2 = new ChuyenXeNoiThanh("1","Tran Van Thanh","1203",10,150,60000);
        ChuyenXeNoiThanh noiThanh3 = new ChuyenXeNoiThanh("1","Nguyen Khoa","723",15,1850,85000);

        ChuyenXeNgoaiThanh ngoaiThanh1 = new ChuyenXeNgoaiThanh("1","Tran Thanh Thi","331","HN",20,7000000);
        ChuyenXeNgoaiThanh ngoaiThanh2 = new ChuyenXeNgoaiThanh("1","Tran Thanh Thi","777","TPHCM",10,3500000);
        ChuyenXeNgoaiThanh ngoaiThanh3 = new ChuyenXeNgoaiThanh("1","Tran Thanh Thi","227","Nha Trang",15,6000000);

        QuanLyChuyenXe quanLyChuyenXe=new QuanLyChuyenXe();
        quanLyChuyenXe.them(noiThanh1);
        quanLyChuyenXe.them(noiThanh2);
        quanLyChuyenXe.them(noiThanh3);
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
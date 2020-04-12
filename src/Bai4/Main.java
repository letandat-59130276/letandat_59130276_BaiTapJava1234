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
        NoiThanh noiThanh1 = new NoiThanh("1","Nguyen Thanh Than","79Z-55485",01,220,50000);
        NoiThanh noiThanh2 = new NoiThanh("2","Le Van Nam","79T-45821",02,200,40000);
        NoiThanh noiThanh3 = new NoiThanh("3","Nguyen Dinh Chan","79C-58496",03,380,90000);

        QuanLyChuyenXe quanLyChuyenXe=new QuanLyChuyenXe();
        
        quanLyChuyenXe.them(noiThanh1);
        quanLyChuyenXe.them(noiThanh2);
        quanLyChuyenXe.them(noiThanh3);
        
        NgoaiThanh ngoaiThanh1 = new NgoaiThanh("4","Hoang Quoc Doanh","79C-00010","Xa Nam Cung - Nam Dinh",02,1000000);
        NgoaiThanh ngoaiThanh2 = new NgoaiThanh("5","Nguyen Thi Minh","79C-05485","Xa Cao Lanh - Cao Bàng",04,3500000);
        NgoaiThanh ngoaiThanh3 = new NgoaiThanh("6","Dinh Van Dau","79C-00010","Thap Cham - Ninh Thuan",01,400000);

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
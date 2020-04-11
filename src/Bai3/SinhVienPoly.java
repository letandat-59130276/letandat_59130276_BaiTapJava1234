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
abstract public class SinhVienPoly 
{
    private String hoTen;
    private String nganh;

    
    public SinhVienPoly(String hoTen, String nganh) 
    {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    abstract public double getDiem();

    
    public String getHocLuc(){
        double diem = getDiem();
        String hocLuc;
            if(diem<5) hocLuc = "Yeu";
            else 
                if(diem<6.5) hocLuc = "Trung binh";
                else 
                    if(diem<7.5) hocLuc = "Kha";
                    else 
                        if(diem<9) hocLuc = "Gioi";
                        else hocLuc = "Xuat sac";
        return hocLuc;
    }
    
    
    public void Xuat(){
        System.out.println("\nThong tin sinh vien\n: " + hoTen);
        System.out.println("Nganh: " + nganh + " -- Diem: " + getDiem() + " -- Hoc luc: " + getHocLuc());
    }
}

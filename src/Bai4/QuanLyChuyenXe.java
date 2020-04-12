/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;
import java.util.ArrayList;

/**
 *
 * @author Con Meo Cutee
 */
public class QuanLyChuyenXe 
{
    ArrayList<ChuyenXe>dsChuyenXe = new ArrayList<ChuyenXe>();

    public void them(ChuyenXe x){
        dsChuyenXe.add(x);
    }
    public void xuat(){
        for(int i = 0; i < dsChuyenXe.size(); i++){
            dsChuyenXe.get(i).Xuat();
        }
    }
    
    
    public double tinhDoanhThuNoiThanh(){
        double tongNoiThanh =0;
       for(int i = 0; i < dsChuyenXe.size(); i++){
            NoiThanh nt = dsChuyenXe.get(i) instanceof NoiThanh?((NoiThanh) dsChuyenXe.get(i)):null;
            if(nt != null) 
                tongNoiThanh+= nt.doanhThu;
       }
       return tongNoiThanh;
   }
   
   
    public double tinhDoanhThuNgoaiThanh()
    {
        double tongNgoaiThanh =0;
        for(int i = 0; i < dsChuyenXe.size(); i++){
            NgoaiThanh nt = dsChuyenXe.get(i) instanceof NgoaiThanh?((NgoaiThanh) dsChuyenXe.get(i)):null;
                if(nt != null) 
                    tongNgoaiThanh+= nt.doanhThu;
        }
        return tongNgoaiThanh;
    }
    
    
    public double tinhTongDoanhThu(){
        double tong =0;
        for(int i = 0; i < dsChuyenXe.size(); i++){
           tong+= dsChuyenXe.get(i).doanhThu;
        }
        return tong;
    }
}

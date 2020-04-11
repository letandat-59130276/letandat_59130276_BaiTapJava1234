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
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<ChuyenXe>();

    public ArrayList<ChuyenXe> getDsChuyenXe() {
        return dsChuyenXe;
    }

    public void setDsChuyenXe(ArrayList<ChuyenXe> dsChuyenXe) {
        this.dsChuyenXe = dsChuyenXe;
    }

    public void them(ChuyenXe x){
        dsChuyenXe.add(x);
    }
    public void xuat(){
        for(int i=0;i<dsChuyenXe.size();i++){
            dsChuyenXe.get(i).Xuat();
        }
    }
   public long tinhDoanhThuNoiThanh(){
        long tongNoiThanh =0;
       for(int i=0;i<dsChuyenXe.size();i++){
          ChuyenXeNoiThanh nt = dsChuyenXe.get(i) instanceof ChuyenXeNoiThanh ? ((ChuyenXeNoiThanh) dsChuyenXe.get(i)) : null;
           if(nt !=null) tongNoiThanh+= nt.doanhThu;
       }
       return tongNoiThanh;
   }
    public long tinhDoanhThuNgoaiThanh(){
        long tongNgoaiThanh =0;
        for(int i=0;i<dsChuyenXe.size();i++){
            ChuyenXeNgoaiThanh nt = dsChuyenXe.get(i) instanceof ChuyenXeNgoaiThanh ? ((ChuyenXeNgoaiThanh) dsChuyenXe.get(i)) : null;
            if(nt !=null) tongNgoaiThanh+= nt.doanhThu;
        }
        return tongNgoaiThanh;
    }
    public long tinhTongDoanhThu(){
        long tong =0;
        for(int i=0;i<dsChuyenXe.size();i++){
           tong+= dsChuyenXe.get(i).doanhThu;
        }
        return tong;
    }
}

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
abstract public class ChuyenXe {
    String maSo;
    String hoTen;
    String soXe;
    double doanhThu;

   public ChuyenXe(String maSo, String hoTen, String soXe, double doanhThu) {
       this.maSo = maSo;
       this.hoTen = hoTen;
       this.soXe = soXe;
       this.doanhThu = doanhThu;
   }
   
   abstract public void Xuat();
}

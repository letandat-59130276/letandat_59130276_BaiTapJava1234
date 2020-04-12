/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_2;

import java.util.ArrayList;

/**
 *
 * @author Con Meo Cutee
 */
public class QuanLyNhanVien implements IQuanLy{
  ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
  
  @Override
  public void them(NhanVien nv) {
    dsNhanVien.add(nv);
  };

  @Override
  public void inDS() {
    dsNhanVien.forEach(nv -> System.out.println(nv.getThongTin()));
  };
  
}

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
public class SinhVienIT extends SinhVienPoly 
{
    private final double diemJava;
    private final double diemCSS;
    private final double diemHTML;

    
    public SinhVienIT(String hoTen, double diemJava, double diemCSS, double diemHTML) {
        super(hoTen, "IT");
        this.diemJava = diemJava; this.diemCSS = diemCSS; this.diemHTML = diemHTML;
    }

    
    @Override
    public double getDiem() 
    {
        return (diemJava * 2 + diemCSS + diemHTML) / (double)4;
    }
}
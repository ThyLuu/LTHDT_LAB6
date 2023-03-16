/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime(int gioLamViec, String ten) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    @Override
    public void loaiNhanVien() {
        System.out.println("Part Time");
    }

    @Override
    public void tinhluong() {
        System.out.println("5,000,000");
    }
    
}

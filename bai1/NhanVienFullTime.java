/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class NhanVienFullTime extends NhanVien{
    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFullTime(int loaiChucVu, int ngayLamThem, String ten) {
        super(ten);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }
    @Override
    public void loaiNhanVien() {
        System.out.println("Full Time");
    }
    
    @Override
    public void tinhluong() {
       System.out.println("10,000,000");
    }

    
}

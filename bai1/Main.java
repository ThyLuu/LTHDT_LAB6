/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv = new NhanVien();
        NhanVienPartTime nvpt = new NhanVienPartTime(5, "A");
        nvpt.xuatThongTin();
        nvpt.tinhluong();
        NhanVienFullTime nvft = new NhanVienFullTime(0, 28, "B");
        nvft.xuatThongTin();
        nvft.tinhluong();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        HocSinh student = new HocSinh();
        student.getHoTen();
        student.getLop();
        student.getToan();
        student.getLy();
        student.getHoa();
        student.nhap();
        student.xuat();
        
        HocSinhChuyenToan hsct = new HocSinhChuyenToan();
        hsct.getHoTen();
        hsct.getHoTen();
        hsct.getLop();
        hsct.getToan();
        hsct.getLy();
        hsct.getHoa();
        hsct.nhap();
        hsct.xuat();
    }
}

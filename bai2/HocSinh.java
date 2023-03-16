/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HocSinh {
    private String hoTen;
    private String lop;
    private float toan;
    private float ly;
    private float hoa;

    public HocSinh() {
    }

    public HocSinh(String hoTen, String lop, float toan, float ly, float hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float tinhDTB(){
        float a, b, c;
        float dtb = (this.toan + this.ly + this.hoa)/3;
        return dtb;
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Nhap thong tin hoc sinh");
        System.out.print("Nhap ho ten: ");
        hoTen = nhap.nextLine();
        System.out.print("Nhap lop: ");
        lop = nhap.nextLine();
        System.out.print("Nhap diem toan: ");
        toan = nhap.nextFloat();
        System.out.print("Nhap diem ly: ");
        ly = nhap.nextFloat();
        System.out.print("Nhap diem hoa: ");
        hoa = nhap.nextFloat();
    }
    
    public void xuat(){
        System.out.println("=========================");
        System.out.println("Ho ten: " +hoTen);
        System.out.println("Lop: " +lop);
        System.out.println("Diem toan: " +toan);
        System.out.println("Diem ly: " +ly);
        System.out.println("Diem hoa: " +hoa);
        System.out.println("Diem trung binh: " +tinhDTB());
    }
}

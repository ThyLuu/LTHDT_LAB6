/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVien {
    private String ten;
    private long luong;
    

    public NhanVien() {
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }
    
    public void loaiNhanVien(){
        
    }
    
    public void tinhluong(){
        System.out.println("Luong nhan vien");
    }
    
    public void nhapThongTin(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Ten: ");
        ten = nhap.nextLine();
        
    }
    
    public void xuatThongTin(){
        System.out.println("Ten: "+ ten);
    }
}

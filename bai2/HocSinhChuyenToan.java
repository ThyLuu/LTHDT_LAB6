/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
public class HocSinhChuyenToan extends HocSinh {

    public HocSinhChuyenToan() {
    }

    public HocSinhChuyenToan(String hoTen, String lop, float toan, float ly, float hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }

    @Override
    public float tinhDTB() {
        int a,b,c;
        float dtb2 = ((getToan())*2 + getLy() + getHoa())/4;
        return dtb2;
    }
    
}

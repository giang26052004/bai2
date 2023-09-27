/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide4;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Product {
    String ma;
    String ten;
    Double gia;
    Date ngaynhap;

    public Product() {
    }

    public Product(String ma, String ten, Double gia, Date ngaynhap) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.ngaynhap = ngaynhap;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    
    
    
}

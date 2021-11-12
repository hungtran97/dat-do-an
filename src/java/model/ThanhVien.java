/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hungt
 */
public class ThanhVien {
    private String id;
    private String hoTen;
    private String email;
    private String sdt;
    private String vaiTro;
    private String diaChi;
    private boolean daKichHoat;

    
    public ThanhVien() {}

    public ThanhVien(String hoten, String vaiTro, String email, String sdt, String diaChi, boolean daKichHoat) {
        this.hoTen = hoten;
        this.vaiTro = vaiTro;
        this.email = email;
        this.diaChi = diaChi;
        this.daKichHoat = daKichHoat;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
     public boolean getDaKichHoat(boolean daKichHoat) {
        return daKichHoat;
    }

    public void setDaKichHoat(boolean daKichHoat) {
        this.daKichHoat = daKichHoat;
    }
}

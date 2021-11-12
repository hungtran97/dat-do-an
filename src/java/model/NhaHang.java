/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tungl
 */
public class NhaHang {
    private String id;
    private String tenNhaHang;
    private String diaChi;
    private String gioHoatDong;
    private String tblChuNhaHangid;

    public NhaHang(String tenNhaHang, String diaChi, String gioHoatDong, String tblChuNhaHangid) {
        this.tenNhaHang = tenNhaHang;
        this.diaChi = diaChi;
        this.gioHoatDong = gioHoatDong;
        this.tblChuNhaHangid = tblChuNhaHangid;
    }

    public NhaHang() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNhaHang() {
        return tenNhaHang;
    }

    public void setTenNhaHang(String tenNhaHang) {
        this.tenNhaHang = tenNhaHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioHoatDong() {
        return gioHoatDong;
    }

    public void setGioHoatDong(String gioHoatDong) {
        this.gioHoatDong = gioHoatDong;
    }

    public String getTblChuNhaHangid() {
        return tblChuNhaHangid;
    }

    public void setTblChuNhaHangid(String tblChuNhaHangid) {
        this.tblChuNhaHangid = tblChuNhaHangid;
    }
}

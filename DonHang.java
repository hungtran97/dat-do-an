
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Hung
 */
public class DonHang implements Serializable{
    private int id;
    private float tongtien;
    private NhaHang nhahang;
    private Date thoigiandat;
    private KhachHang khachhang;
    private int trangthaidon;
    private int tinhtrangnhandon;
    private String diachigiaohang;
    private NhanVienGiaoHang nhanviengiaohang;
    private List<MonAnTrongDH> mondat;
    
    public DonHang(){
        super();
    }

    public DonHang(int id, float tongtien, NhaHang nhahang, Date thoigiandat, KhachHang khachhang, int trangthaidon, int tinhtrangnhandon, String diachigiaohang, NhanVienGiaoHang nhanviengiaohang, List<MonAnTrongDH> mondat) {
        super();
        this.id = id;
        this.tongtien = tongtien;
        this.nhahang = nhahang;
        this.thoigiandat = thoigiandat;
        this.khachhang = khachhang;
        this.trangthaidon = trangthaidon;
        this.tinhtrangnhandon = tinhtrangnhandon;
        this.diachigiaohang = diachigiaohang;
        this.nhanviengiaohang = nhanviengiaohang;
        this.mondat = mondat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public NhaHang getNhahang() {
        return nhahang;
    }

    public void setNhahang(NhaHang nhahang) {
        this.nhahang = nhahang;
    }

    public Date getThoigiandat() {
        return thoigiandat;
    }

    public void setThoigiandat(Date thoigiandat) {
        this.thoigiandat = thoigiandat;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public int getTrangthaidon() {
        return trangthaidon;
    }

    public void setTrangthaidon(int trangthaidon) {
        this.trangthaidon = trangthaidon;
    }

    public int getTinhtrangnhandon() {
        return tinhtrangnhandon;
    }

    public void setTinhtrangnhandon(int tinhtrangnhandon) {
        this.tinhtrangnhandon = tinhtrangnhandon;
    }

    public String getDiachigiaohang() {
        return diachigiaohang;
    }

    public void setDiachigiaohang(String diachigiaohang) {
        this.diachigiaohang = diachigiaohang;
    }

    public NhanVienGiaoHang getNhanviengiaohang() {
        return nhanviengiaohang;
    }

    public void setNhanviengiaohang(NhanVienGiaoHang nhanviengiaohang) {
        this.nhanviengiaohang = nhanviengiaohang;
    }

    public List<MonAnTrongDH> getMondat() {
        return mondat;
    }

    public void setMondat(List<MonAnTrongDH> mondat) {
        this.mondat = mondat;
    }
    
    
    
    
}

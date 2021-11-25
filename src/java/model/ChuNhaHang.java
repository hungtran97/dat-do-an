
package model;

import java.io.Serializable;


/**
 *
 * @author Hung
 */
public class ChuNhaHang extends ThanhVien implements Serializable{
    
    public ChuNhaHang(){
        super();
    }

    public ChuNhaHang(int id, String hoten, String email, String vaitro, boolean dakichhoat) {
        super(id, hoten, email, vaitro, dakichhoat);
    }

    
    
    
    
}

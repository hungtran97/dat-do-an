<%-- 
    Document   : gdTKChiTietKhachHang
    Created on : Nov 17, 2021, 1:42:30 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Thống kê chi tiết khách hàng</title>
        </head>
            <%
                Thanhvien cnh = (Thanhvien)session.getAttribute("chunhahang");
                    if(sv==null){
                        response.sendRedirect("dangnhap.jsp?err=timeout");
                    }
                
                //lay du lieu khach hang
                int idkh = (int)session.getAttribute("idkh");
                
                //Lay danh sach hoa don khach hang
                ArrayList<KhachHang> listHDKH = (new HoaDonDAO()).getHoaDonKH(idkh, sd, ed);
                session.setAttribute("listHDKH", listHDKH);
            %>
        <body>
            <h2>Thống kê chi tiết khách hàng</h2>
            <p>Chủ nhà hàng: <%=cnh.getChuNhaHang().getHoten()%></p>
            <p>Khách hàng: <%=KhachHang("idkh").getHoten()%></p>
            
            <table>
                <thead>
                    <tr>
                        <th>TT</th>
                        <th>Mã hóa đơn</th>
                        <th>Tiền thanh toán</th>
                        <th>Thời gian xuất</th>
                    </tr>
                </thead>

                <tbody>
                    <% 
                        if(listHDKH != null)
                        for(int i=0; i<listMHKH.size(); i++){
                    %>
                    <tr>
                        <td><%=(i+1) %></td>
                        <td><%=listHDKH.get(i).getHoaDonKH.getId()%></td>
                        <td><%=listHDKH.get(i).getHoaDonKH.getTienthanhtoan()%></td>
                        <td><%=listHDKH.get(i).getHoaDonKH.getThoigianxuat()%></td>
                    </tr>
                    <%} %>
                </tbody>
            </table>
            <br>
            <button onclick="openPage('gdTKTheoKhachHang.jsp')">Quay lại</button>
        </body>
    </html>
</f:view>

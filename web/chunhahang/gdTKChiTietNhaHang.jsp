<%-- 
    Document   : gdTKChiTietNhaHang
    Created on : Nov 17, 2021, 1:43:23 AM
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
            <title>Thống kê chi tiết nhà hàng</title>
        </head>
            <%
                Thanhvien cnh = (Thanhvien)session.getAttribute("chunhahang");
                    if(sv==null){
                        response.sendRedirect("dangnhap.jsp?err=timeout");
                    }
                
                //lay du lieu nha hang
                int idkh = (int)session.getAttribute("idnh");
                
                //Lay danh sach hoa don nha hang
                ArrayList<NhaHang> listHDNH = (new HoaDonDAO()).getHoaDonNH(idnh, sd, ed);
                session.setAttribute("listHDNH", listHDNH);
            %>
        <body>
            <h2>Thống kê chi tiết nhà hàng</h2>
            <p>Chủ nhà hàng: <%=cnh.getChuNhaHang().getHoten()%></p>
            <p>Nhà hàng: <%=NhaHang("idnh").getTen()%></p>
            
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
                        <td><%=listHDNH.get(i).getHoaDonNH.getId()%></td>
                        <td><%=listHDNH.get(i).getHoaDonNH.getTienthanhtoan()%></td>
                        <td><%=listHDNH.get(i).getHoaDonNH.getThoigianxuat()%></td>
                    </tr>
                    <%} %>
                </tbody>
            </table>
            <br>
            <button onclick="openPage('gdTKTheoNhaHang.jsp')">Quay lại</button>
        </body>
    </html>
</f:view>

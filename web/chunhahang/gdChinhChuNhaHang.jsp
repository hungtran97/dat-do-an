<%-- 
    Document   : gdChinhChuNhaHang
    Created on : Nov 17, 2021, 1:41:29 AM
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
            <title>Trang chủ Chủ nhà hang</title>
        </head>
        <body>
            <%
            Thanhvien cnh = (Thanhvien)session.getAttribute("chunhahang");
                if(sv==null){
                    response.sendRedirect("dangnhap.jsp?err=timeout");
                }
            %>
            <h2>Trang chủ Chủ nhà hàng</h2>
            <p>Chủ nhà hàng: <%=cnh.getChuNhaHang().getHoten()%></p>
            <button onclick="openPage('gdDonHang.jsp')">Đơn hàng</button><br>
            <button onclick="openPage('gdQuanLyMonAn.jsp')">Quản lý thực đơn</button><br>
            <button onclick="openPage('gdChonTK.jsp')">Xem thống kê</button>
        </body>
    </html>
</f:view>

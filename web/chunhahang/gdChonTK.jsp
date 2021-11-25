<%-- 
    Document   : gdChonTK
    Created on : Nov 17, 2021, 1:41:47 AM
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
            <title>Chọn thống kê</title>
        </head>
            <%
                Thanhvien cnh = (Thanhvien)session.getAttribute("chunhahang");
                    if(sv==null){
                        response.sendRedirect("dangnhap.jsp?err=timeout");
                    }
            %>
        <body>
            <h2>Chọn thống kê</h2>
            <p>Chủ nhà hàng: <%=cnh.getChuNhaHang().getHoten()%></p>
            <button onclick="openPage('gdTKTheoMonAn.jsp')">Thống kê món ăn theo doanh thu</button><br>
            <button onclick="openPage('gdTKTheoKhachHang.jsp')">Thống kê khách hàng theo doanh thu</button><br>
            <button onclick="openPage('gdTKTheoNhaHang.jsp')">Thống kê nhà hàng theo doanh thu</button><br>
            <button onclick="openPage('gdChinhChuNhaHang.jsp')">Quay lại</button>
        </body>
    </html>
</f:view>

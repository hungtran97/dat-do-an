<%-- 
    Document   : doNhapMa
    Created on : Nov 15, 2021, 9:21:03 PM
    Author     : tungl
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.ArrayList, dao.*, model.*"
         %>
<%
    String ma = (String) session.getAttribute("ma");
    System.out.println(ma);
    String email = (String) session.getAttribute("email");
    String maKH = (String) request.getParameter("ma");
    System.out.println(maKH);
    ThanhVien tv =  (ThanhVien) session.getAttribute("tv");

    if (!ma.equals(maKH)) {
        response.sendRedirect("gdNhapMa.jsp?err=fail");
    }
    ThanhVienDAO thanhVienDAO = new ThanhVienDAO();
    boolean kq = thanhVienDAO.kichHoatTV(ma, email);
    if (kq && (tv.getVaiTro().equalsIgnoreCase("khachhang"))) {
        session.setAttribute("khachhang", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("../khachhang/gdChinhKhachHang.jsp");
    } else if (kq && (tv.getVaiTro().equalsIgnoreCase("chunhahang"))) {
        session.setAttribute("chunhahang", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("../chunhahang/gdChinhChuNhaHang.jsp");
    } else if (kq && (tv.getVaiTro().equalsIgnoreCase("nhanviengiaohang"))) {
        session.setAttribute("nhanviengiaohang", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("../nhanviengiaohang/gdChinhNhanVienGiaoHang.jsp");
    } else if (kq && (tv.getVaiTro().equalsIgnoreCase("quanly"))) {
        session.setAttribute("quanly", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("../quanly/gdChinhQuanLy.jsp");
    } else {
        response.sendRedirect("gdNhapMa.jsp?err=fail");
    }
%>

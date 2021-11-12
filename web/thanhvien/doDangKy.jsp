<%-- 
    Document   : doDanKy
    Created on : Nov 15, 2021, 9:20:48 PM
    Author     : tungl
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.ArrayList, dao.*, model.*"
         %>
<%
    String hoTen = (String) request.getParameter("hoTen");
    String email = (String) request.getParameter("email");
    String diaChi = (String) request.getParameter("diaChi");
    String sdt = (String) request.getParameter("sdt");
    String vaiTro = (String) request.getParameter("vaiTro");
    String tenNhaHang = (String) request.getParameter("tenNhaHang");

    ThanhVien tv = new ThanhVien();
    tv.setEmail(email);
    tv.setDiaChi(diaChi);
    tv.setHoTen(hoTen);
    tv.setSdt(sdt);
    tv.setVaiTro(vaiTro);

    ThanhVienDAO dao = new ThanhVienDAO();
    String kq = dao.dangKy(tv);
    System.out.println(kq);
    if (!kq.equals("") && (tv.getVaiTro().equalsIgnoreCase("khachhang"))) {
        session.setAttribute("tv", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("gdNhapMa.jsp");
    } else if (!kq.equals("") && (tv.getVaiTro().equalsIgnoreCase("chunhahang"))) {
        if (!tenNhaHang.equals("")) {
            NhaHangDAO nhaHangDAO = new NhaHangDAO();
            NhaHang nh = new NhaHang();
            nh.setTenNhaHang(tenNhaHang);
            nhaHangDAO.themNhaHang(nh, tv.getId());
        }
        session.setAttribute("tv", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("gdNhapMa.jsp");
    } else if (!kq.equals("") && (tv.getVaiTro().equalsIgnoreCase("nhanviengiaohang"))) {
        session.setAttribute("tv", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("gdNhapMa.jsp");
    } else if (!kq.equals("") && (tv.getVaiTro().equalsIgnoreCase("quanly"))) {
        session.setAttribute("tv", tv);
        session.setAttribute("email", tv.getEmail());
        session.setAttribute("ma", kq);
        response.sendRedirect("gdNhapMa.jsp");
    } else {
        response.sendRedirect("gdFormDangKy.jsp?err=fail");
    }
%>
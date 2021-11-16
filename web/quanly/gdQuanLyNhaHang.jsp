<%-- 
    Document   : gdQuanLyNhaHang
    Created on : Nov 11, 2021, 10:07:05 PM
    Author     : hungt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<%@ page import="java.util.*, dao.*, model.* " %>
<%
    NhaHangDAO nhaHangDAO = new NhaHangDAO();
    ArrayList<NhaHang> listNhaHang = nhaHangDAO.getAllNhaHang();
    session.setAttribute("listNhaHang", listNhaHang);
%>
<div class="container p-5 border my-3 bg-light" style="height: 100%">
    <div class="card border-0 px-5 bg-light">
        <div class="card-title">
            <form class="d-flex w-50" action="/quanly/gdTimKiemNhaHang.jsp">
                <input class="form-control me-2" type="search" placeholder="Search" name="tenNhaHang" aria-label="Search">
                <button class="btn btn-outline-success" type="submit" method="post">Search</button>
            </form>
            <button class="btn btn-primary w-15 mt-3">
                <a href="gdThongTinNhaHang.jsp" class="text-white text-decoration-none">Thêm nhà hàng</a>
            </button>
        </div>
        <div>
            <div class="my-4 p-0 card-body">
                <table class="table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Tên nhà hàng</th>
                            <th scope="col">Địa chỉ</th>
                            <th scope="col">Thời gian hoạt động</th>
                            <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="nh" items="${listNhaHang}">
                            <tr>
                                <th scope="row">${nh.id}</th>
                                <td>${nh.tenNhaHang}</td>
                                <td>${nh.diaChi}</td>
                                <td>${nh.gioHoatDong}</td>
                                <td class="d-flex justify-content-center">
                                    <form action="/quanly/gdThongTinNhahang.jsp">
                                        <button class="btn btn-outline-primary me-2" name="id" value="${nh.id}">
                                            Sửa
                                        </button>
                                    </form>
                                    <form action="/quanly/doXoaNhaHang.jsp">
                                        <button class="btn btn-outline-primary" name="id" value="${nh.id}">
                                            Xóa
                                        </button>
                                    </form>

                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>

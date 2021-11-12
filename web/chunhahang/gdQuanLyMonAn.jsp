<%-- 
    Document   : gdQuanLyMonAn
    Created on : Nov 11, 2021, 10:09:08 PM
    Author     : hungt
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"
         import="java.util.*, dao.*, model.*"
         %>
<%
    MonAnDAO dao = new MonAnDAO();
    ArrayList<MonAn> listMonAn = dao.getAllMonAn("");
    session.setAttribute("listMonAn", listMonAn);
%>
<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container p-5 border my-3 bg-light" style="height: 100%">
    <div class="card border-0 px-5 bg-light">
        <div class="card-title">
            <form class="d-flex w-50" action="/chunhahang/gdTimKiemMonAn.jsp">
                <input class="form-control me-2" type="search" placeholder="Search" name="tenMonAn" aria-label="Search">
                <button class="btn btn-outline-success" type="submit" method="post">Search</button>
            </form>
            <button class="btn btn-primary w-15 mt-3">
                <a href="gdThongTinMonAn.jsp" class="text-white text-decoration-none">Thêm món ăn</a>
            </button>
        </div>
        <div>
            <div class="my-4 p-0 card-body">
                <table class="table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Tên món ăn</th>
                            <th scope="col">Số lượng tồn kho</th>
                            <th scope="col">Giá món</th>
                            <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="monAn" items="${listMonAn}">
                            <tr>
                                <th scope="row">${monAn.id}</th>
                                <td>${monAn.tenMon}</td>
                                <td>${monAn.soLuongTonKho}</td>
                                <td>${monAn.giaMon}</td>
                                <td class="d-flex justify-content-center">
                                    <form action="/chunhahang/gdThongTinMonAn.jsp">
                                        <button class="btn btn-outline-primary me-2" name="id" value="${monAn.id}">
                                            Sửa
                                        </button>
                                    </form>
                                    <form action="/chunhahang/doXoaMonAn.jsp">
                                        <button class="btn btn-outline-primary" name="id" value="${monAn.id}">
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


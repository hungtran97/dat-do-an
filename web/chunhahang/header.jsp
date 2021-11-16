<%-- 
    Document   : header
    Created on : Nov 13, 2021, 9:32:21 AM
    Author     : tungl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Trang chủ</title>     
        <style>
            body {
                height: 100vh;
            }
            .nav {
                background-color: #258bd9
            }
            .nav-item {
                color: white
            }
            .nav-link {
                color: white
            }
            .nav-link:hover {
                background-color: white;
            }
        </style>


    </head>
    <body>
        <script>
            let title_el = document.querySelector("title");
            let path = window.location.pathname;
            if (path === "/chunhahang/gdQuanLyMonAn.jsp") {
                title_el.innerHTML = "Quản lý món ăn";
            } else if (path === "/chunhahang/gdChinhChuNhaHang.jsp") {
                title_el.innerHTML = "Trang chủ";
            } else if (path.indexOf("/chunhahang/gdTimKiemMonAn.jsp") >= 0) {
                title_el.innerHTML = "Tìm kiếm món ăn";
            } else if (path.indexOf("/chunhahang/gdThongTinMonAn.jsp") >= 0) {
                title_el.innerHTML = "Thông tin món ăn";
            }
        </script>
        <div>
            <ul class="nav justify-content-center p-2">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="gdChinhChuNhaHang.jsp">Trang chủ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="gdQuanLyMonAn.jsp">Quản lý món ăn</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="#">Link</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="#">Link</a>
                </li>
            </ul>
        </div>


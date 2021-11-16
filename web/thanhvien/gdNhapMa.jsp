<%-- 
    Document   : gdNhapMa
    Created on : Nov 11, 2021, 10:08:38 PM
    Author     : hungt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <style>
            body {
              font-family: Arial, Helvetica, sans-serif;
            }

            * {
              box-sizing: border-box;
            }
        </style>
    </head>
    <body>
        <div class="container mt-3 d-flex justify-content-center">
            <form class="border p-4 bg-light" action="/thanhvien/doNhapMa.jsp">
                <h2 class="text-center">Nhập mã xác nhận</h2>

                <p class="text-center">Vui lòng nhập mã xác nhận: </p>
                
                <div class="mb-3 mt-3">
                    <input type="text" class="form-control" placeholder="Enter mã xác nhận..." name="ma">
                </div>

                <div class="d-flex justify-content-center">
                    <button type="submit" class="btn btn-success">Tiếp tục</button>
                </div>
            </form>
        </div>
    </body>
</html>

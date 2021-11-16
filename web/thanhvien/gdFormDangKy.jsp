<%-- 
    Document   : gdFormDangKy
    Created on : Nov 11, 2021, 10:08:25 PM
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
            <form class="border p-4 bg-light" action="/thanhvien/doDangKy.jsp">
                <h2 class="text-center">Đăng ký</h2>
                <p class="text-center mt-2">Bạn đã có tài khoản? <a href="/thanhvien/gdDangNhap.jsp" class="color-primary">Đăng nhập</a>.</p>

                <p><span class="text-danger">* </span>Vui lòng điền đầy đủ thông tin dưới đây.</p>
                
                <div class="mb-3 mt-3">
                    <label for="username" class="form-label">Username: </label>
                    <input type="text" class="form-control" id="username" placeholder="username..." name="username">
                </div>

                <div class="mb-3 mt-3">
                    <label for="email" class="form-label">Email:</label>
                    <input type="email" class="form-control" id="email" placeholder="email..." name="email">
                </div>
                
                <div class="mb-3" id="sdt">
                    <label for="sdt" class="form-label">Số điện thoại: </label>
                    <input type="text" class="form-control" id="sdt" placeholder="số điện thoại..." name="sdt">
                </div>
                
                <div class="mb-3" id="cua_hang">
                    <label for="ch" class="form-label">Tên nhà hàng: </label>
                    <input type="text" class="form-control" id="ch" placeholder="Enter nha hang" name="tennhahang">
                </div>
                
                <div class="mb-3" >
                    <label for="diachi" class="form-label">Địa chỉ: </label>
                    <input type="text" class="form-control" id="diachi" placeholder="địa chỉ..." name="diaChi">
                </div>
                
                <p>Để tìm hiểu thêm, hãy tham khảo <a href="#">Điều khoản & Quyền riêng tư </a>của chúng tôi.</p>
                
                <div class="d-flex justify-content-center">
                    <button type="submit" class="btn btn-success">Register</button>
                </div>
            </form>
        </div>
        
         <script>
            if (localStorage.getItem('role') !== 'chunhahang') {
                document.getElementById("cua_hang").classList.add('d-none') 
            }
        </script>
    </body>
</html>

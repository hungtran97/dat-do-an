<%-- 
    Document   : gdDangKy
    Created on : Nov 11, 2021, 10:08:08 PM
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
        <div class="container mt-5 d-flex justify-content-center">
            <div class="border px-4 pt-4 pb-5 bg-light">
                <h2 class="text-center">Đăng ký</h2>

                <div class="d-flex justify-content-center mt-3">
                    <button onClick="clickBtn('khachhang')" class="btn btn-success">
                        <a class="text-white text-decoration-none" href="/thanhvien/gdFormDangKy.jsp">Đăng ký với tư cách khách hàng</a>
                    </button>
                </div>
                
                <div class="d-flex justify-content-center mt-3">
                    <button onClick="clickBtn('nhanviengiaohang')" class="btn btn-success">
                        <a class="text-white text-decoration-none" href="/thanhvien/gdFormDangKy.jsp">Đăng ký với tư cách nhân viên giao hàng</a>
                    </button>
                </div>
                
                <div class="d-flex justify-content-center mt-3">
                    <button onClick="clickBtn('chunhahang')" class="btn btn-success">
                        <a class="text-white text-decoration-none" href="/thanhvien/gdFormDangKy.jsp">Đăng ký với tư cách chủ nhà hàng</a>
                    </button>
                </div>
            </form>
        </div>
        <script>
            clickBtn = (role) => {
                localStorage.setItem('role', role);
            };
        </script>
    </body>
</html>

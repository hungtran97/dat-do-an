<%-- 
    Document   : footer
    Created on : Nov 13, 2021, 9:32:46 AM
    Author     : tungl
--%>

<%@ page import="java.util.*" %>
<%
    // initialize the current year that's used in the 
    // copyright notice
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    ServletContext context = this.getServletContext();
%>	

<p class="d-flex justify-content-center p-3 border-top"><small>
        &copy; Copyright <%= currentYear%> 
    </small></p>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<!-- header -->
<jsp:include page="_admin_header.jsp" />
<!-- End header -->
 <center>
  <br /> <br /> <br />
  <h2>Admin | You are now logged in</h2>
  <%-- <h3><a href="${logoutUrl}">Logout</a></h3> --%>
 </center>

</body>
</html>
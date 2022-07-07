<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOC TYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="alien" method="post">
      <label for="name">First name:</label><br>
      <input type="text"  name="name" ><br>
      <label for="ID">ID:</label><br>
      <input type="number"  name="id" ><br><br>
      <label for="Tech">Tech:</label><br>
      <input type="Text" autocomplete="off" name="Tech" ><br><br>
      <input type="submit">
    </form>

  <%-- <form action="/alien">
          <label for="ID">ID:</label><br>
          <input type="number"  name="id" ><br><br>
          <input type="submit">
    </form>   --%>

</body>
</html>
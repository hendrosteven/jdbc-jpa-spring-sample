<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>JSP Sample</title>
    </head>
    <body>
        <h3>Daftar Person</h3>
        <table border="1">
            <tr>
                <td>No</td>
                <td>Nama</td>
                <td>Alamat</td>
                <td>Jenkel</td>
                <td>Hobi</td>
            </tr>
            <c:set var="no" value="1"/>
            <c:forEach items="${persons}" var="person">
                <tr>
                    <td>${no}.</td>
                    <td>${person.nama}</td>
                    <td>${person.alamat}</td>
                    <td>${person.jenkel}</td>
                    <td>
                        <ul>
                            <c:forEach items="${person.hobi}" var="hobi">
                              <li>${hobi}</li>
                            </c:forEach>
                        </ul>
                    </td>
                </tr>
                <c:set var="no" value="${no+1}"/>
            </c:forEach>
        </table>
    </body>
</html>
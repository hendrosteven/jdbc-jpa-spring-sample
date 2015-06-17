<%@page import="java.util.ArrayList"%>
<%@page import="obj.Person"%>
<%@page import="java.util.List"%>
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
            <%
                List<Person> persons = (ArrayList<Person>) 
                        session.getAttribute("persons");
                int no = 1;
                for (Person p : persons) {
            %>
            <tr>
                <td><%= no%></td>
                <td><%= p.getNama()%></td>
                <td><%= p.getAlamat()%></td>
                <td><%= p.getJenkel()%></td>
                <td>
                    <ul>
                        <%
                            for (String hb : p.getHobi()) {
                        %>
                        <li><%= hb%></li>
                            <%}%>
                    </ul>
                </td>
            </tr>  
            <% ++no; } %>
        </table>
    </body>
</html>
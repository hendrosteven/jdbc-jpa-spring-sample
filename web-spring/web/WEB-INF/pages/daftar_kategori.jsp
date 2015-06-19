<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"/>
<div class="row">
    <div class="large-12 columns">
        <a href="/web-spring/kategori/insert" class="button small">Insert New</a>
        <h3>Daftar Kategori</h3>
        <table style="width: 100%">
            <thead>
                <tr>
                    <th>No</th>
                    <th>Kode</th>
                    <th>Nama</th>
                    <th>&nbsp;</th>
                </tr>
            </thead>
            <tbody>
            <c:set value="1" var="no"/>
            <c:forEach items="${kategoris}" var="kategori">
                <tr>
                    <td style="width: 10%">${no}</td>
                    <td>${kategori.kode}</td>
                    <td>${kategori.nama}</td>
                    <td style="width: 10%">
                        <a href="kategori/delete?id=${kategori.id}" class="label alert">Del</a>
                        <a href="#" data-reveal-id="editModal"  
                           class="label success" 
                           onclick="editKategori(${kategori.id}, '${kategori.kode}',
                                           '${kategori.nama}')">Edit</a>
                    </td>
                </tr>
                <c:set var="no" value="${no+1}"/>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<div id="editModal" class="reveal-modal small" data-reveal 
     aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
    <h2>Edit Kategori</h2>
    <form action="/web-spring/kategori/update" method="post">
        <p>Kode : <input type="text" name="txtKode" id="txtKode"/></p>
        <p>Nama : <input type="text" name="txtNama" id="txtNama"/></p>
        <input type="hidden" id="txtId" name="txtId"/>
        <p><input type="submit" value="Simpan" class="button"/></p>
    </form>
    <a class="close-reveal-modal" aria-label="Close">&#215;</a>
</div>
<jsp:include page="footer.jsp"/>
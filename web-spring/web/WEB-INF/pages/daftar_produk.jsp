<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"/>
<div class="row">
    <div class="large-12 columns">
        <a href="/web-spring/produk/insert" class="button small">Insert New</a>
        <h3>Daftar Produk</h3>
        <table style="width: 100%" id="tblProduk">
            <thead>
                <tr>
                    <th>No</th>
                    <th>Kode</th>
                    <th>Nama</th>       
                    <th>Harga</th>
                    <th>Kategori</th>
                </tr>
            </thead>
            <tbody>            
            </tbody>
        </table>
    </div>
</div>
<jsp:include page="footer.jsp"/>
<script>
    $(document).ready(function () {
        $.getJSON("/web-spring/produk", function (data) {
            var no = 1;
            $.each(data, function (i, obj) {
                //cetak ke table
                $("#tblProduk tbody").append("<tr>" +
                        "<td>" + no + ".</td>" +
                        "<td>" + obj.kode + "</td>" +
                        "<td>" + obj.nama + "</td>" +
                        "<td>" + obj.harga + "</td>" +
                        "<td>" + obj.kategori.nama + "</td>" +
                        "</tr>");
                ++no;
            });
        });
    });


</script>
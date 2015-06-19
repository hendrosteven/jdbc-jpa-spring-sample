<jsp:include page="header.jsp"/>
<div class="row">
    <div class="large-8 columns">
        <h3>Input Kategori</h3>
        <form action="save" method="post">
            <p>Kode : <input type="text" name="txtKode"/></p>
            <p>Nama : <input type="text" name="txtNama"/></p>
            <p><input type="submit" value="Simpan" class="button"/></p>
        </form>
    </div>
</div>
<jsp:include page="footer.jsp"/>
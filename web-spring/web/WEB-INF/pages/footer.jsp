<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script src="<c:url value="/assets/js/vendor/jquery.js"/>"></script>
<script src="<c:url value="/assets/js/foundation.min.js"/>"></script>
<script>
    $(document).foundation();
    function editKategori(id, kode, nama) {
        $('#txtId').val(id);
        $('#txtKode').val(kode);
        $('#txtNama').val(nama);
    }
</script>
</body>
</html>
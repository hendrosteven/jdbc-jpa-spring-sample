<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Data Barang</title>
        <link rel="stylesheet" href="assets/css/foundation.css" />
        <script src="assets/js/vendor/modernizr.js"></script>
    </head>
    <body>   

        <nav class="top-bar" data-topbar role="navigation">
            <ul class="title-area">                
                <li class="name">                    
                    <h1><a href="#">Data Produk</a></h1>
                </li>
                <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
            </ul>

            <section class="top-bar-section">
                <!-- Right Nav Section -->
                <ul class="right">
                    <li ><a href="#">Home</a></li>
                    <li class="active"><a href="kategori">Kategori</a></li>
                    <li class="has-dropdown">
                        <a href="#">Produk</a>
                        <ul class="dropdown">
                            <li><a href="#">Daftar Produk</a></li>
                            <li><a href="#">Input Produk</a></li>
                        </ul>
                    </li>
                </ul>
            </section>
        </nav>
        <br/>

        <div class="row">
            <div class="large-12 columns">
                <a href="input_kategori.jsp" class="button small">Insert New</a>
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
                                <td style="width: 10%"><a href="deletekategori?id=${kategori.id}" class="label alert">Del</a></td>
                            </tr>
                            <c:set var="no" value="${no+1}"/>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <script src="assets/js/vendor/jquery.js"></script>
        <script src="assets/js/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
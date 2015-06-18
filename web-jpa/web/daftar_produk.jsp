<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Data Produk</title>
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
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="kategori">Kategori</a></li>
                    <li class="has-dropdown" class="active">
                        <a href="#">Produk</a>
                        <ul class="dropdown">
                            <li class="active"><a href="produk" >Daftar Produk</a></li>
                            <li><a href="inputproduk">Input Produk</a></li>
                        </ul>
                    </li>
                </ul>
            </section>
        </nav>
        <br/>

        <div class="row">
            <div class="large-12 columns">
                <a href="input_produk.jsp" class="button small">Insert New</a>
                <h3>Daftar Produk</h3>
                <table style="width: 100%">
                    <thead>
                        <tr>
                            <th>No</th>
                            <th>Kode</th>
                            <th>Nama</th>
                            <th>Harga</th>
                            <th>Kategori</th>
                            <th>&nbsp;</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:set value="1" var="no"/>
                        <c:forEach items="${produks}" var="produk">
                            <tr>
                                <td style="width: 10%">${no}</td>
                                <td>${produk.kode}</td>
                                <td>${produk.nama}</td>
                                <td class="text-right">
                                    <fmt:formatNumber value="${produk.harga}" type="currency" 
                                                  currencySymbol="Rp."/>
                                </td>
                                <td>${produk.kategori.nama}</td>
                                <td style="width: 10%">
                                    <a href="deleteproduk?id=${produk.id}" 
                                       class="label alert">Del</a>
                                </td>
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
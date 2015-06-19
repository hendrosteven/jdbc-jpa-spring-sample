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
                    <li class="active"><a href="hello">Home</a></li>
                    <li><a href="kategori">Kategori</a></li>
                    <li class="has-dropdown">
                        <a href="#">Produk</a>
                        <ul class="dropdown">
                            <li><a href="produk">Daftar Produk</a></li>
                            <li><a href="inputproduk">Input Produk</a></li>
                        </ul>
                    </li>
                </ul>
            </section>
        </nav>
        <br/>

        <div class="row">
            <div class="large-12 columns">
                <h1>Selamata datang..</h1>                
            </div>
        </div>

        <script src="assets/js/vendor/jquery.js"></script>
        <script src="assets/js/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
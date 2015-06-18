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
                    <li class="active"><a href="index.jsp">Home</a></li>
                    <li><a href="kategori">Kategori</a></li>
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
            <div class="large-8 columns">
                <h3>Input Kategori</h3>
                <form action="simpankategori" method="post">
                    <p>Kode : <input type="text" name="txtKode"/></p>
                    <p>Nama : <input type="text" name="txtNama"/></p>
                    <p><input type="submit" value="Simpan" class="button"/></p>
                </form>
            </div>
        </div>
        <script src="assets/js/vendor/jquery.js"></script>
        <script src="assets/js/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
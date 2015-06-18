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
                <div class="panel radius">
                    <h2>Selamat Datang</h2>
                    <p>
                        Pimpinan sementara Komisi Pemberantasan Korupsi Johan Budi menantang pihak-pihak yang menyebut KPK pernah melakukan penyalahgunaan wewenang saat menjalankan tugas. Ia meminta, agar mereka membuktikan jika KPK pernah melakukan hal itu.
                        Tunjukkan pernah nggak KPK lakukan abuse of power? Pernah nggak kita lakukan abuse of power soal penyadapan," kata Johan di Kompleks Parlemen Senayan
                    </p>
                </div>
            </div>
            <div class="large-4 columns">
                <form>
                    <div class="row">
                        <div class="large-12 columns">
                            <label>Username
                                <input type="text" placeholder="Username" />
                            </label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="large-12 columns">
                            <label>Password
                                <input type="password" />
                            </label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="large-12 columns">
                            <input type="submit" class="button small" value="Login">
                        </div>
                    </div>
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
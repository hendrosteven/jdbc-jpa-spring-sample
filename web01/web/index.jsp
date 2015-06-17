<html>
    <head>
        <title>Sample Form</title>
    </head>
    <body>
        <h2>Sample Form</h2>
        <form action="proses" method="post">
            <table>
                <tr>
                    <td>Nama</td>
                    <td>:</td>
                    <td><input type="text" name="txtNama"/></td>
                </tr>
                <tr>
                    <td>Alamat</td>
                    <td>:</td>
                    <td><textarea cols="30" rows="8" name="txtAlamat">
                        </textarea>
                    </td>
                </tr>
                <tr>
                    <td>Jenis Kelamin</td>
                    <td>:</td>
                    <td>
                        <input type="radio" name="rdJenkel" value="Laki-laki"/>Laki-laki<br/>
                        <input type="radio" name="rdJenkel" value="Perempuan"/>Perempuan
                    </td>
                </tr>
                <tr>
                    <td>Hobi</td>
                    <td>:</td>
                    <td>
                        <input type="checkbox" name="chkHobi" value="Makan"/> Makan <br/>
                        <input type="checkbox" name="chkHobi" value="Nonton"/>Nonton<br/>
                        <input type="checkbox" name="chkHobi" value="Olah Raga"/>Olah Raga                    
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <input type="submit" value="Submit"/> 
                        <input type="reset" value="Reset"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
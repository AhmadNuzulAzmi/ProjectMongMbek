<%-- 
    Document   : KonfirmasiPesanQurban
    Created on : Jan 9, 2020, 1:27:22 AM
    Author     : ACER-NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="../Bingkai/header1.html"></jsp:include>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section id="blog">
            <div class="container">
        <div class="leave-comment">
		<h5>Silahkan Isi Data Dengan Baik dan Benar !</h5>
                <form class="form-horizontal" role="form" action="OlahAddQurban.jsp">
                    
                        <div class="form-group">
                         <label for="inputwebsite" class="col-sm-2 control-label">Rek Atas Nama</label>
			<div class="col-sm-10">
                          <input type="text" class="form-control" id="inputwebsite" placeholder=" Rekening Atas Nama" name="mamarek" required
                                 oninvalid="this.setCustomValidity('Isi Rekening Atas Nama')" oninput="setCustomValidity('')">
			</div>
                    </div>	<!-- End of /.form-group -->
                    
                    <div class="form-group">
                         <label for="inputwebsite" class="col-sm-2 control-label">Nama Bank Asal</label>
			<div class="col-sm-10">
                          <input type="text" class="form-control" id="inputwebsite" placeholder="Nama Bank" name="bank" required
                                 oninvalid="this.setCustomValidity('Isi Nama Bank')" oninput="setCustomValidity('')">
			</div>
                    </div>	<!-- End of /.form-group -->
                    
                    <div class="form-group">
                         <label for="inputwebsite" class="col-sm-2 control-label">No Rekening Bank</label>
			<div class="col-sm-10">
                          <input type="text" class="form-control" id="inputwebsite" placeholder="No Rekening Bank" name="norek" required
                                 oninvalid="this.setCustomValidity('Isi Nomor Rekening')" oninput="setCustomValidity('')">
			</div>
                    </div>	<!-- End of /.form-group -->
                    
                    <div class="form-group">
                         <label for="inputwebsite" class="col-sm-2 control-label">Nominal Transfer
                         <br/>
                         <i>(Input tanpa koma)</i></label>
			<div class="col-sm-10">
                          <input type="text" class="form-control" id="inputwebsite" placeholder="Nominal Transfer" name="nominal" required
                                 oninvalid="this.setCustomValidity('Isi Nominal Transfer')" oninput="setCustomValidity('')">
			</div>
                    </div>	<!-- End of /.form-group -->
                    
                    <div class="form-group">
                         <label for="inputwebsite" class="col-sm-2 control-label">Tanggal Transfer</label>
			<div class="col-sm-10">
                            <input type="date" class="form-control" id="confirm-transfer_date" name="tgl">
			</div>
                    </div>	<!-- End of /.form-group -->
                    
                    <div class="form-group">
                         <label for="inputwebsite" class="col-sm-2 control-label">Bukti Transfer</label>
			<div class="col-sm-10">
                          <input type="file" class="form-control" name="bukti_tf" id="donation_file" equired
                                 oninvalid="this.setCustomValidity('Isi Bukti Transfer')" oninput="setCustomValidity('')">
			</div>
                    </div>	<!-- End of /.form-group -->
                    
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-primary"> Konfirmasi </button>
                                <button type="reset" class="btn btn-primary" style="background-color: red">Batal </button>
                            </div>
                        </div>	<!-- End of /.form-group -->
                                                        
                                                        
						</form>	<!-- End of /.form-horizontal -->
					</div>
            </div>
        </section>
    </body>
    <jsp:include page="../Bingkai/Footer.html"></jsp:include>
</html>

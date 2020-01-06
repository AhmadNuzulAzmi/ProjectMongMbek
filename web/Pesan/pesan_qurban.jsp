<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../Bingkai/header.html"></jsp:include>
        <title></title>
    </head>
    <body>
        <section id="blog">
            <div class="container">
        <div class="leave-comment">
		<h5>Silahkan Isi Data Dengan Baik dan Benar !</h5>
                <form class="form-horizontal" role="form" action="OlahAddQurban.jsp">
                    
                        <div class="form-group">
                         <label for="inputwebsite" class="col-sm-2 control-label">Atas Nama</label>
			<div class="col-sm-10">
                          <input type="text" class="form-control" id="inputwebsite" placeholder="Atas Nama" name="nama" required />
			</div>
                    </div>	<!-- End of /.form-group -->
                    
                    
                        <div class="form-group">
			<label for="inputname" class="col-sm-2 control-label">Pilih Masjid</label>
                        <div class="col-sm-10">
                            <div class="select-box">
                                    <select class="form-control" name="masjid" placeholder="Pilih Masjid">
                                                    <option value="Masjid Dakwah"> Masjid Dakwah </option>
                                                    <option value="Masjid MadinatulIlmi"> Masjid Madinatul Ilmi </option>
                                                    <option value="Masjid Istiqomah"> Masjid Istiqomah </option>
                                                </select>
                                </div>
                            </div>
			</div>	<!-- End of /.form-group -->
                        
                        <div class="form-group">
			<label for="inputname" class="col-sm-2 control-label">Pilih Kelompok</label>
                        <div class="col-sm-10">
                            <div class="select-box">
                                    <select class="form-control" name="kelompok" placeholder="Pilih Masjid">
                                                    <option value="Kelompok 1"> Kelompok 1 </option>
                                                    <option value="Kelompok 2"> Kelompok 2 </option>
                                                    <option value="Kelompok 3"> Kelompok 3</option>
                                                    <option value="Kelompok 4"> Kelompok 4</option>
                                                    <option value="Kelompok 5"> Kelompok 5</option>
                                                    <option value="Kelompok 6"> Kelompok 6</option>
                                                    
                                                </select>
                                </div>
                            </div>
			</div>	<!-- End of /.form-group -->
			
                        
                                                        
						  	<div class="form-group">
						    	<label for="inputwebsite" class="col-sm-2 control-label">Harga</label>
							    <div class="col-sm-10">
                                                                <input type="text" class="form-control" id="inputwebsite" placeholder="Harga" name="harga">
							    </div>
						  	</div>	<!-- End of /.form-group -->
						  	
                                                        
                                                        <div class="form-group">
                                                        <label for="inputname" class="col-sm-2 control-label">Metode Bayar</label>
                                                        <div class="col-sm-10">
                                                            <div class="select-box">
                                                                    <select class="form-control" name="bayar" placeholder="Pilih Metode Pembayaran">
                                                                                    <option value="Transfer"> Transfer </option>
                                                                                    <option value="Cash"> Cash </option>
                                                                                    <option value="Dana"> DANA </option>
                                                                                </select>
                                                                </div>
                                                            </div>
                                                        </div>	<!-- End of /.form-group -->
                                                        
                                                        
                                                        
                                                    <div class="form-group">
						    	<div class="col-sm-offset-2 col-sm-10">
						      		<button type="submit" class="btn btn-primary">Daftar </button>
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
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
                <form class="form-horizontal" role="form" action="../Home/Home1.jsp">
			
                                        
                        <div class="form-group">
			<label for="inputname" class="col-sm-2 control-label">Pilihan Hewan</label>
                        
                        <div class="col-sm-10">
                            <div class="select-box">
                                    <label for="select-box1" class="label select-box1"><span class="label-desc"> Pilih Hewan Aqiqah </span></label>
                                                <select id ="select-box1" class="select">
                                                    
                                                    <option value="kambing"> Kambing </option>
                                                    <option value="domba"> Domba </option>
                                                </select>
                                </div>
                        </div>
			</div>	<!-- End of /.form-group -->
                        
                         <div class="form-group">
			<label for="inputname" class="col-sm-2 control-label">Pilihan Berat</label>
                        <div class="col-sm-10">
                            <div class="select-box">
                                    <label for="select-box1" class="label select-box1"><span class="label-desc"> Pilih Berat Hewan </span></label>
                                                <select id ="select-box1" class="select">
                                                    <option value="sapi"> 40 - 50 kg </option>
                                                    <option value="kerbau"> 25 - 35 kg</option>
                                                    <option value="kerbau"> 20 - 25 kg </option>
                                                </select>
                                </div>
                        </div>
			</div>	<!-- End of /.form-group -->
                                                        
						  	<div class="form-group">
						    	<label for="inputwebsite" class="col-sm-2 control-label">Harga</label>
							    <div class="col-sm-10">
                                                                <input type="text" class="form-control" id="inputwebsite" placeholder="Rp. 3500000" name="nohp" disabled>
							    </div>
						  	</div>	<!-- End of /.form-group -->
						  	
                                                        <div class="form-group">
                                                        <label for="inputwebsite" class="col-sm-2 control-label">Atas Nama</label>
							    <div class="col-sm-10">
                                                                <input type="text" class="form-control" id="inputwebsite" placeholder="Atas Nama" name="usrname">
							    </div>
						  	</div>	<!-- End of /.form-group -->
                                                        
                                                        <div class="form-group">
                                                <label for="inputname" class="col-sm-2 control-label">Metode Bayar</label>
                                                <div class="col-sm-10">
                                                    <div class="select-box">
                                                            <label for="select-box1" class="label select-box1"><span class="label-desc"> Pilih Metode Pembayaran </span></label>
                                                                        <select id ="select-box1" class="select">
                                                                            <option value="sapi"> Transfer Antar Bank</option>
                                                                            <option value="kerbau"> Go Pay </option>
                                                                            <option value="kerbau"> Dana </option>
                                                                        </select>
                                                        </div>
                                                </div>
                                                </div>	<!-- End of /.form-group -->
                                                        
                                                    <div class="form-group">
						    	<div class="col-sm-offset-2 col-sm-10">
						      		<button type="submit" class="btn btn-primary"> Pesan </button>
						    	</div>
                                                        </div>	<!-- End of /.form-group -->
                                                        
                                                        
						</form>	<!-- End of /.form-horizontal -->
					</div>
            </div>
        </section>
    </body>
     <jsp:include page="../Bingkai/Footer.html"></jsp:include>
</html>
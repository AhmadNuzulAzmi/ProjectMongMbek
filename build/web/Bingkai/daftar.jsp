<%-- 
    Document   : daftar
    Created on : Nov 28, 2019, 5:54:10 PM
    Author     : ACER-NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.html"></jsp:include>
        <title></title>
    </head>
    <body>
        <section id="blog">
            <div class="container">
        <div class="leave-comment">
		<h5>ISI DATA DENGAN BENAR</h5>
                <form class="form-horizontal" role="form" action="../Home/Home.jsp">
			<div class="form-group">
			<label for="inputname" class="col-sm-2 control-label">Nama</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputname" placeholder="Name">
				</div>
					</div>	<!-- End of /.form-group -->
					<div class="form-group">
					<label for="inputEmail" class="col-sm-2 control-label">Jenis Kelamin</label>
					<div class="col-sm-10">
						<input type="email" class="form-control" id="inputEmail" placeholder="Email">
							    </div>
						  	</div>	<!-- End of /.form-group -->
						  	<div class="form-group">
						    	<label for="inputwebsite" class="col-sm-2 control-label">No Hp</label>
							    <div class="col-sm-10">
							      	<input type="text" class="form-control" id="inputwebsite" placeholder="Website">
							    </div>
						  	</div>	<!-- End of /.form-group -->
						  	<div class="form-group">
						    	<label for="inputmessage" class="col-sm-2 control-label">Alamat</label>
							    <div class="col-sm-10">
							      	<textarea class="form-control" id="inputmessage"  rows="3"></textarea>
							    </div>
						  	</div>	<!-- End of /.form-group -->
						  		
							<div class="form-group">
						    	<div class="col-sm-offset-2 col-sm-10">
						      		<button type="submit" class="btn btn-primary">Daftar</button>
						    	</div>
						  	</div>	<!-- End of /.form-group -->
						</form>	<!-- End of /.form-horizontal -->
					</div>
            </div>
        </section>
    </body>
     <jsp:include page="Footer.html"></jsp:include>
</html>

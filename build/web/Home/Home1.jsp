<%-- 
    Document   : Home1
    Created on : Nov 28, 2019, 6:44:40 PM
    Author     : ACER-NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mong.PendaftaranFacade" %>
<%@page import="mong.Pendaftaran" %>
<!DOCTYPE html>
<html>
     <jsp:include page="../Bingkai/header1.html"></jsp:include>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br/>
        <h2 align="center">
        <% 
        String name=(String)session.getAttribute("sessname"); 
        out.print("Selamat Datang "+name); 
        %> 
        </h2>

        <!-- SLIDER Start
    ================================================== -->


	<section id="slider-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div id="slider" class="nivoSlider">
				    	<img src="../images/SAPI1.png" alt="" />
				    	<img src="../images/Sapi2.png" alt=""/>
				    	<img src="../images/qo1.png" alt="" />
					</div>	<!-- End of /.nivoslider -->
				</div>	<!-- End of /.col-md-12 -->
			</div>	<!-- End of /.row -->
		</div>	<!-- End of /.container -->
	</section> <!-- End of Section -->


	

	<!-- CATAGORIE Start
    ================================================== -->

	<section id="catagorie">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="block">
						<div class="block-heading">
							<h2> JENIS IBADAH QURBAN</h2>
						</div>	
						<div class="row">
							<center>
						  	<div class="col-sm-6 col-md-4">
							    <div class="thumbnail">
							    	<a class="catagotie-head" href="../Hukum/HukumQurban1.jsp">
										<img src="../images/s2.png"  alt="...">
										<h3> Qurban </h3>
									</a>
							      	<div class="caption">
							        	<p> Mari BerQurban </p>
							        	<p>
							        		<a href="../Pesan/pesan_qurban.jsp" class="btn btn-default btn-transparent" role="button">
							        			<span> Daftar </span>
							        		</a>
							        	</p>
                                                                        <br/>
								        	<a href="../Pesan/KonfirmasiPesanQurban.jsp" class="btn btn-default btn-transparent" role="button">
								        		<span> Konfirmasi Pesanan Qurban </span>
								        	</a>
								      
							      	</div>	<!-- End of /.caption -->
							    </div>	<!-- End of /.thumbnail -->
						  	</div>	<!-- End of /.col-sm-6 col-md-4 -->
						  </center>
						  	<div class="col-sm-6 col-md-4">
							    <div class="thumbnail">
							    	<a class="catagotie-head" href="blog-single.html">
										<!-- <img src="images/category-image-2.jpg" alt="..."> -->
										<!-- <h3>Miscellaneous</h3>	 -->	
									</a>
							      	<div class="caption">
							        	<!-- <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iste, aut, esse, laborum placeat id illo a expedita aperiam...</p>
							        	<p> -->
							        	<!-- 	<a href="blog-single.html" class="btn btn-default btn-transparent" role="button">
							        			<span>Check Items</span>
							        		</a> -->
							        	<!-- </p> -->
							      	</div>	<!-- End of /.caption -->
							    </div>	<!-- End of /.thumbnail -->
						  	</div>	<!-- End of /.col-sm-6 col-md-4 -->
						  	<center>
						  	<div class="col-sm-6 col-md-4">
							    <div class="thumbnail">
							    	<a class="catagotie-head" href="../Hukum/HukumAqiqah1.jsp">
										<img src="../images/k4.png" alt="...">
										<h3> Aqiqah </h3>
									</a>
							      	<div class="caption">
								        <p> Mari BerAqiqah </p>
								        <p>
								        	<a href="../Pesan/pesan_aqiqah.jsp" class="btn btn-default btn-transparent" role="button">
								        		<span> Daftar </span>
								        	</a>
								        </p>
								    </div>	<!-- End of /.caption -->
							    </div>	<!-- End of /.thumbnail -->
						  	</div>	<!-- End of /.col-sm-6 col-md-4 -->
						</div>	<!-- End of /.row -->
					</center>
					</div>	<!-- End of /.block --> 
				</div>	<!-- End of /.col-md-12 -->
			</div>	<!-- End of /.row -->
		</div>	<!-- End of /.container -->
	</section>	<!-- End of Section -->



	
		<!-- PRODUCTS Start
    ================================================== -->



	
	
		<!-- CALL TO ACTION Start
    ================================================== -->

	<section id="call-to-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="block">
						<div class="block-heading">
							<h2> Didukung Oleh </h2>
						</div>
					</div>	<!-- End of /.block -->
					<div id="owl-example" class="owl-carousel">
						<div> </div>
						<div> </div>
						<div> <img src="../images/laz.png" alt=""></div>
<!--						<div> <img src="images/company-4.png" alt=""></div>
						<div> <img src="images/company-5.png" alt=""></div>
						<div> <img src="images/company-6.png" alt=""></div>
						<div> <img src="images/company-8.png" alt=""></div>
						<div> <img src="images/company-9.png" alt=""></div>
					</div>	 End of /.Owl-Slider -->
				</div>	<!-- End of /.col-md-12 -->
			</div> <!-- End Of /.Row -->
		</div> <!-- End Of /.Container -->
	</section>	<!-- End of Section -->
    </body>
    <jsp:include page="../Bingkai/Footer.html"></jsp:include>
</html>


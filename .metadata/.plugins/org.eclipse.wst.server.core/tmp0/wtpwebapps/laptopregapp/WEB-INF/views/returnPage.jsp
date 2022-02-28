<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<script src="/js/jquery-3.6.0.min.js"></script>
<script src="/js/jquery.autocomplete.min.js"></script>
<script src="/js/bootstrap.js"></script>

<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/signin.css" rel="stylesheet">
<link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sign-in/">

<link rel="stylesheet" href="/css/jquery-ui.min.css" />
<link rel="stylesheet" href="/css/ui.jqgrid.css" />


<script src="/js/i18n/grid.locale-kr.js" type="text/javascript"></script>
<script src="/js/jquery.jqGrid.min.js" type="text/javascript"></script>
<script>
	jQuery.browser = {};
	(function() {
		jQuery.browser.msie = false;
		jQuery.browser.version = 0;
		if (navigator.userAgent.match(/MSIE ([0-9]+)\./)) {
			jQuery.browser.msie = true;
			jQuery.browser.version = RegExp.$1;
		}
	})();
</script>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.84.0">
<title>Signin Template · Bootstrap v5.0</title>


<!-- Bootstrap core CSS -->
<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.ui-jqgrid {
	margin-left: auto;
	margin-right: auto;
	text-align: center;
}

.ui-jqgrid.ui-widget.ui-widget-content.ui-corner-all {
	width: 100% !important;
}

.ui-jqgrid-view {
	width: 100% !important;
}

.ui-jqgrid-hdiv {
	width: 100% !important;
}

.ui-jqgrid .ui-jqgrid-hbox {
	width: 100% !important;
	padding: 0 !important;
}

.ui-jqgrid-htable {
	width: 100% !important;
}

.ui-jqgrid-bdiv {
	width: 100% !important;
}

.ui-jqgrid-btable {
	width: 100% !important;
}

.ui-jqgrid-pager {
	width: 100% !important;
}

.div-label {
	float: left;
	display: inline-flex;
	margin: 5px;
}

.form-signin {
	width: 600px;
}

.input-label {
	width: 200px;
}
</style>
<!-- Custom styles for this template -->
</head>



<body class="text-center">
	<main class="form-signin">
	<form>
		<img class="mb-4" src="/image/kd.png" alt="" width="72" height="57">
		<h1 class="h3 mb-3 fw-normal">
			재택근무 노트북 </br> 반납 페이지
		</h1>
		<div>
			<div id="returnModal" tabindex="-1" aria-labelledby="returnModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="returnModalLabel">노트북 대여 이력</h5>
							<button type="button" class="close" data-dismiss="modal" aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body" id="modal-body">
							<div class="frame">
								<div class="center">
									<input style="width:100px;"id="returnSerial" placeholder="typing serial number">
									<button type="button" class="btn btn-primary" id="returnSearchBtn">조회</button>
								</div>
								<div class="center">
									<div id="informDiv"></div>
								</div>

							</div>
						</div>
						<div class="modal-footer">
						</div>
						<div id="informDiv"></div>
					</div>
				</div>
			</div>
		</div>

		<p class="mt-5 mb-3 text-muted">&copy; Since Corona Virus, 2019–2022</p>
	</form>
	</main>

</body>

<script type="text/javascript">

	
	$(document).ready(function() {
		$("#returnSerial").val('${serial}');			
	});
	
	$("#returnSearchBtn").on("click", function(e) { 
			if ($("#returnSerial").val() == "") {
				alert("노트북 자산번호를 입력해주세요.");
			} else {
				var flag = 0;
				$.ajax({
					url : "/searchSerial.do",
					type : "post",
					data : {
						"returnSerial" : $("#returnSerial").val()
					},
					dataType : "json",
					loadtext : "loading...",
					contentType : "application/x-www-form-urlencoded; charset=UTF-8",
					async : false,
					success : function(data) {
						var i = 0;

						$(data).each(
								function() {
									if(!this.UserName){
									 	alert('대여 이력이 없습니다.');
									}else{
										flag = 1;
										var rowdata = "이름 : " + this.UserName + '</br> ';
										rowdata = rowdata + "사번 : " + this.UserID + '</br> ';
										rowdata = rowdata + "부서 : " + this.DeptName + '</br> ';
										rowdata = rowdata + "불출일자 : " + this.ProvideDate + '</br> ';
										
										$("#modal_username").val(this.UserName);
										$("#modal_userid").val(this.UserID);
										$("#modal_deptname").val(this.DeptName);
										
										$("#modal-body").append($("<div class='modal-body'>"+rowdata+"</div>"));
										
										$("#modal-body").append($('<div class="modal-body"><b>위 내역이 맞으십니까?</b> </div> <button type="button" class="btn btn-success" id="yesBtn">맞아요</button> <button type="button" class="btn btn-secondary" id="noBtn">아니에요</button>'));
										
										$("#yesBtn").on("click", function(e) { 
											$("#modal-body").append($('<div class="modal-body"><b>충전기도 가져오셨나요?</b> </div> <button type="button" class="btn btn-success" id="yesBtn_Adaptor">가져왔어요</button> <button type="button" class="btn btn-secondary" id="noBtn_Adaptor">아니요</button>'));
											
											$("#yesBtn_Adaptor").on("click", function(e) { 
												$("#modal-body").append($('<div class="modal-body"><b>마우스도 가져오셨나요?</b> </div> <button type="button" class="btn btn-success" id="yesBtn_Mouse">가져왔어요</button> <button type="button" class="btn btn-secondary" id="noBtn_Mouse">아니요</button>'));
											
												$("#yesBtn_Mouse").on("click",
														function(e) { 
															if (window.confirm("반납 하시겠습니까?")) {
																var listData;
																$.ajax({
																	url : "/returnlaptop.do",
																	type : "post",
																	data : {
																		"UserNM" : $("#modal_username").val(),
																		"UserID" : $("#modal_userid").val(),
																		"DEPTNM" : $("#modal_deptname").val(),
																		"Serial" : $("#returnSerial").val()
																	},
																	dataType : "json",
																	loadtext : "loading...",
																	contentType : "application/x-www-form-urlencoded; charset=UTF-8",
																	async : false,
																	success : function(data) {
																		if (data[0].code == "RETURN") {
																			alert(data[0].result);
																			location.href="https://laptop.kdiwin.com/main.do";
																		} else {
																			alert("error");
																		}
																	},
																	error : function(XMLHttpRequest,textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
																		console.log(XMLHttpRequest);
																	}
																});
															} else {
																return;
															}
														});
			
												
												$("#noBtn_Mouse").on("click", function(e) { 
													alert("마우스가 있어야만 반납이 가능합니다.\n마우스를 지참하세요.");
												});
											});
											
											$("#noBtn_Adaptor").on("click", function(e) { 
												alert("충전기가 있어야만 반납이 가능합니다. \n충전기를 지참하세요.");
											});
											
										});
										
										$("#noBtn").on("click", function(e) { 
											alert("경영정보팀에 문의하세요");
										});
									}

								});
							if(flag == 0){
								alert("대여 이력이 없습니다.");
							}
						},
					error : function(XMLHttpRequest, textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
						console.log(XMLHttpRequest);
						alert(XMLHttpRequest);
					}
				});
			}
		});
	
	setTimeout(function() {
		$("#returnSearchBtn").trigger("click")
	}, 500)
	
	
</script>
<input type="hidden" id="modal_userid" name="modal_userid">
<input type="hidden" id="modal_username" name="modal_username">
<input type="hidden" id="modal_deptname" name="modal_deptname">
<input type="hidden" id="modal_serial" name="modal_serial">
</html>
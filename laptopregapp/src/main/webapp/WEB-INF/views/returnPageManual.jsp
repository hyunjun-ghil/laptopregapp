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
							<h5 class="modal-title" id="returnModalLabel">Search Customer</h5>
							<button type="button" class="close" data-dismiss="modal" aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">
							<div class="frame">
								<div class="center">
									<input style="width:100px;"id="returnSerial" placeholder="typing serial number">
									<button type="button" class="btn btn-primary" id="returnSearchBtn">Search</button>
								</div>
								<div class="center">
									<table id="returnjqGrid"></table>
									<div id="returnjqGridPager"></div>

								</div>

							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary" id="modelReturnBtn">Return</button>
						</div>
					</div>
				</div>
			</div>
		</div>

		<p class="mt-5 mb-3 text-muted">&copy; Since Corona Virus, 2019–2022</p>
	</form>
	</main>

</body>

<script type="text/javascript">
	var jsonData;

	$(document).ready(
			function() {
				$("#returnjqGrid")
						.jqGrid(
								{
									mtype : "GET",
									datatype : "local",
									colNames : [ 'Seq', '사번', '이름', '부서',
											'S/N', '불출일자', '반납일자' ],
									colModel : [ {
										name : 'Seq',
										index : 'Seq',
										key : true,
										width : 20
									}, {
										name : 'UserID',
										index : 'User ID',
										width : 100
									}, {
										name : 'UserNM',
										index : 'UserNM',
										width : 100
									}, {
										name : 'DEPTNM',
										index : 'DEPTNM',
										width : 150
									}, {
										name : 'SerialNumber',
										index : 'SerialNumber',
										width : 100
									}, {
										name : 'ProvideDate',
										index : 'ProvideDate',
										width : 150
									}, {
										name : 'ReturnDate',
										index : 'ReturnDate',
										width : 150
									} ],
									viewrecords : true,
									height : 230,
									rowNum : 10,
									rowList : [ 10, 20, 30 ],
									pager : "#returnjqGridPager",

									onSelectRow : function(rowid, status, e) {
										var selRowData = $("#returnjqGrid")
												.jqGrid("getRowData", rowid);
										$("#modal_userid").val(
												selRowData.UserID);
										$("#modal_username").val(
												selRowData.UserNM);
										$("#modal_deptname").val(
												selRowData.DEPTNM);
										$("#modal_serial").val(
												selRowData.SerialNumber);
									},
								});

				//다시 로드 
				$("#returnjqGrid").trigger('reloadGrid');

			});

	$("#modelReturnBtn").on("click",
					function(e) { //KD/파트너
						if (window.confirm("반납 하시겠습니까?")) {
							var listData;
							$
									.ajax({
										url : "/returnlaptop.do",
										type : "post",
										data : {
											"UserNM" : $("#modal_username")
													.val(),
											"UserID" : $("#modal_userid").val(),
											"DEPTNM" : $("#modal_deptname")
													.val(),
											"Serial" : $("#modal_serial").val()
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
										error : function(XMLHttpRequest,
												textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
											console.log(XMLHttpRequest);
										}
									});
						} else {
							return;
						}
					});

	$("#returnSearchBtn").on("click", function(e) { //KD/파트너
						if ($("#returnSerial").val() == "") {
							alert("노트북 자산번호를 입력해주세요.");
						} else {
							var listData;
							$
									.ajax({
										url : "/searchSerial.do",
										type : "post",
										data : {
											"returnSerial" : $("#returnSerial")
													.val()
										},
										dataType : "json",
										loadtext : "loading...",
										contentType : "application/x-www-form-urlencoded; charset=UTF-8",
										async : false,
										success : function(data) {
											var i = 0;
											$("#returnjqGrid").clearGridData();
											$(data)
													.each(
															function() {
																var rowdata = {
																	UserID : this.UserID,
																	UserNM : this.UserName,
																	DEPTNM : this.DeptName,
																	ProvideDate : this.ProvideDate,
																	ReturnDate : this.ReturnDate,
																	SerialNumber : this.SerialNumber,
																	Seq : this.Seq
																};
																console
																		.log(rowdata);
																jQuery(
																		"#returnjqGrid")
																		.jqGrid(
																				'addRowData',
																				i,
																				rowdata);
															});
											$("#returnjqGrid").jqGrid(
													'setGridParam', {
														data : data.listData
													});
											$("#returnjqGrid").trigger(
													'reloadGrid');
										},
										error : function(XMLHttpRequest,
												textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
											console.log(XMLHttpRequest);
										}
									});
						}
					});


	
</script>
<input type="hidden" id="modal_userid" name="modal_userid">
<input type="hidden" id="modal_username" name="modal_username">
<input type="hidden" id="modal_deptname" name="modal_deptname">
<input type="hidden" id="modal_serial" name="modal_serial">
</html>

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


<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">사용자 검색</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<div class="frame">
					<div class="center">
						<input id="UserNM" placeholder="사용자 이름을 입력하세요">
						<button type="button" class="btn btn-primary" id="searchBtn">조회</button>
					</div>
					<div class="center">
						<table id="jqGrid"></table>
						<div id="jqGridPager"></div>

					</div>

				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
				<button type="button" class="btn btn-primary" id="modalSelectBtn">선택</button>
			</div>
		</div>
	</div>
</div>

<body class="text-center">
	<main class="form-signin">
	<form>
		<img class="mb-4" src="/image/kd.png" alt="" width="72" height="57">
		<h1 class="h3 mb-3 fw-normal">
			재택근무 노트북 </br> 등록 페이지
		</h1>
		<div style="float: left; display: inline-flex; width: 100%; ">
			<button type="button" class="w-100 btn btn-lg btn-secondary" id="searchBtn" name="searchBtn" value="검색" data-toggle="modal" data-target="#myModal">사용자 검색</button>
		</div>
			<div class="div-label">
				<label class="input-label">사용자 사번</label> <input type="userid" class="form-control" id="UserID">
			</div>
			<div class="div-label">
				<label class="input-label">사용자 부서</label> <input type="userdept" class="form-control" id="UserDept">
			</div>
			<div class="div-label">
				<label class="input-label">사용자 이름</label> <input type="usernm" class="form-control" id="UserName">
			</div>
			<div class="div-label">
				<label class="input-label">S/N</label> <input type="serialnumber" class="form-control" id="Serial">
			</div>
		<button class="w-100 btn btn-lg btn-primary" style="width:100px;"type="button" id="registerBtn">등록</button>
		<p class="mt-5 mb-3 text-muted">&copy; Since Corona Virus, 2019–2022</p>
	</form>
	</main>

</body>

<script type="text/javascript">
	$("#searchBtn").on("click", function(e) { //KD/파트너
						if ($("#UserNM").val() == "") {
							alert("이름을 입력해주세요.");
						} else {
							var listData;
							$.ajax({
								url : "/searchUser.do",
								type : "post",
								data : {
									"UserNM" : $("#UserNM").val()
								},
								dataType : "json",
								loadtext : "loading...",
								contentType : "application/x-www-form-urlencoded; charset=UTF-8",
								async : false,
								success : function(data) {
									var i = 0;
									$("#jqGrid").clearGridData();
									$(data).each(function() {
										var rowdata = {
											UserID : this.UserID,
											UserNM : this.UserNM,
											DEPTNM : this.DEPTNM,
											Seq : this.Seq
										};
										console.log(rowdata);
										jQuery("#jqGrid").jqGrid('addRowData', i, rowdata);
									});
									$("#jqGrid").jqGrid('setGridParam',{ data : data.listData });
									$("#jqGrid").trigger('reloadGrid');
								},
								error : function(XMLHttpRequest, textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
									console.log(XMLHttpRequest);
								}
							});
						}
					});

	var jsonData;

	$(document).ready(
			function() {
				$("#Serial").val('${serial}');
				
				$("#jqGrid").jqGrid(
						{
							mtype : "GET",
							datatype : "local",
							colNames : [ 'Seq', '사번', '이름', '부서', ],
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
							} ],
							viewrecords : true,
							height : 230,
							rowNum : 10,
							rowList : [ 10, 20, 30 ],
							pager : "#jqGridPager",
							
							onSelectRow : function(rowid, status, e) {
								var selRowData = $("#jqGrid").jqGrid("getRowData",rowid);
								$("#modal_userid").val(selRowData.UserID);
								$("#modal_username").val(selRowData.UserNM);
								$("#modal_deptname").val(selRowData.DEPTNM);
							},
						});

				//다시 로드 
				$("#jqGrid").trigger('reloadGrid');

			});

	$("#modalSelectBtn").on("click", function(e) {
		$("#UserID").val($("#modal_userid").val());
		$("#UserName").val($("#modal_username").val());
		$("#UserDept").val($("#modal_deptname").val());
		$('#myModal').modal('hide');
	}); 

	$("#registerBtn").on("click", function(e) { //KD/파트너
		if (window.confirm("저장 하시겠습니까?")) {
			if($("#UserID").val() == ""){
				alert("사번을 입력해주세요.");
				return;
			}
			if($("#UserDept").val() == ""){
				alert("부서를 입력해주세요.");
				return;
			}
			if($("#UserName").val() == ""){
				alert("이름을 입력해주세요.");
				return;
			}
			var listData;
			$.ajax({
				url : "/save.do",
				type : "post",
				data : {
					"UserNM" : $("#UserName").val(),
					"UserID" : $("#UserID").val(),
					"DEPTNM" : $("#UserDept").val(),
					"Serial" : $("#Serial").val()
				},
				dataType : "json",
				loadtext : "loading...",
				contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				async : false,
				success : function(data) {
					if(data[0].code == "DONE"){
						alert(data[0].result);
						location.href="https://laptop.kdiwin.com/main.do";
					}else if(data[0].code == "EXISTS"){
						alert("미반납 내역이 있습니다. \n" + data[0].result);
					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
					console.log(XMLHttpRequest);
				}
			});
		}
		else{
			return;
		}
	});
	
</script>
<input type="hidden" id="modal_userid" name="modal_userid">
<input type="hidden" id="modal_username" name="modal_username">
<input type="hidden" id="modal_deptname" name="modal_deptname">
<input type="hidden" id="modal_serial" name="modal_serial">
</html>

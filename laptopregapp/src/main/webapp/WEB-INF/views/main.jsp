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
	<main class="form-signin"> <img class="mb-4" src="/image/kd.png" alt="" width="72" height="57">
	<h1 class="h3 mb-3 fw-normal">
		재택근무 노트북 </br> 등록 페이지
		<div>
			<form method="post" action="/registerCamera.do" name="registerForm" id="registerForm">
				<button class="w-100 btn btn-lg btn-primary" style="width: 100px; height:100px; margin-top: 10px;" type="button" id="registerBtn"><b style="font-size:30px;">등록(수령)</b></button>
			</form>
			<form method="post" action="/returnCamera.do" name="returnForm" id="returnForm">
				<button class="w-100 btn btn-lg btn-success" style="width: 100px; height:100px; margin-top: 10px;" type="button" id="returnBtn"><b style="font-size:30px;">반납</b></button>
			</form>
<!-- 			<form method="post" action="/returnPageManual.do" name="manualreturnForm" id="manualreturnForm">
				<button class="w-100 btn btn-lg btn-secondary" style="width: 100px; margin-top: 10px;" type="button" id="manualreturnBtn">Manual Return</button>
			</form> -->
		</div>
		<p class="mt-5 mb-3 text-muted">&copy; Since Corona Virus, 2019–2022</p>
	</main>

</body>

<script type="text/javascript">
	$("#registerBtn").on("click", function(e) {
		$("#registerForm").submit();
	});
	
	$("#returnBtn").on("click", function(e) {
		$("#returnForm").submit();
	});
	
/* 	$("#manualreturnBtn").on("click", function(e) {
		$("#manualreturnForm").submit();
	}); */
	
</script>
</html>

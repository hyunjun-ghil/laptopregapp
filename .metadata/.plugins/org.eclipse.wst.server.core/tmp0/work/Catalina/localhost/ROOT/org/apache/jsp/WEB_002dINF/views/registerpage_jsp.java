/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2022-02-18 01:08:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/Project/Spring/US_Sales_Web/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/laptopregapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/Project/Spring/US_Sales_Web/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/laptopregapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1615341766491L));
    _jspx_dependants.put("jar:file:/D:/Project/Spring/US_Sales_Web/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/laptopregapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"/js/jquery-3.6.0.min.js\"></script>\n");
      out.write("<script src=\"/js/jquery.autocomplete.min.js\"></script>\n");
      out.write("<script src=\"/js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("<link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"/css/signin.css\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.0/examples/sign-in/\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/jquery-ui.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/ui.jqgrid.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"/js/i18n/grid.locale-kr.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"/js/jquery.jqGrid.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script>\n");
      out.write("\tjQuery.browser = {};\n");
      out.write("\t(function() {\n");
      out.write("\t\tjQuery.browser.msie = false;\n");
      out.write("\t\tjQuery.browser.version = 0;\n");
      out.write("\t\tif (navigator.userAgent.match(/MSIE ([0-9]+)\\./)) {\n");
      out.write("\t\t\tjQuery.browser.msie = true;\n");
      out.write("\t\t\tjQuery.browser.version = RegExp.$1;\n");
      out.write("\t\t}\n");
      out.write("\t})();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.84.0\">\n");
      out.write("<title>Signin Template · Bootstrap v5.0</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<style>\n");
      out.write(".bd-placeholder-img {\n");
      out.write("\tfont-size: 1.125rem;\n");
      out.write("\ttext-anchor: middle;\n");
      out.write("\t-webkit-user-select: none;\n");
      out.write("\t-moz-user-select: none;\n");
      out.write("\tuser-select: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media ( min-width : 768px) {\n");
      out.write("\t.bd-placeholder-img-lg {\n");
      out.write("\t\tfont-size: 3.5rem;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ui-jqgrid {\n");
      out.write("\tmargin-left: auto;\n");
      out.write("\tmargin-right: auto;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ui-jqgrid.ui-widget.ui-widget-content.ui-corner-all {\n");
      out.write("\twidth: 100% !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ui-jqgrid-view {\n");
      out.write("\twidth: 100% !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ui-jqgrid-hdiv {\n");
      out.write("\twidth: 100% !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ui-jqgrid .ui-jqgrid-hbox {\n");
      out.write("\twidth: 100% !important;\n");
      out.write("\tpadding: 0 !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ui-jqgrid-htable {\n");
      out.write("\twidth: 100% !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ui-jqgrid-bdiv {\n");
      out.write("\twidth: 100% !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ui-jqgrid-btable {\n");
      out.write("\twidth: 100% !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ui-jqgrid-pager {\n");
      out.write("\twidth: 100% !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".div-label {\n");
      out.write("\tfloat: left;\n");
      out.write("\tdisplay: inline-flex;\n");
      out.write("\tmargin: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-signin {\n");
      out.write("\twidth: 600px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-label {\n");
      out.write("\twidth: 200px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<!-- Custom styles for this template -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<h5 class=\"modal-title\" id=\"exampleModalLabel\">Search Customer</h5>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t<div class=\"frame\">\n");
      out.write("\t\t\t\t\t<div class=\"center\">\n");
      out.write("\t\t\t\t\t\t<input id=\"UserNM\" placeholder=\"typing customer name\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"searchBtn\">Search</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"center\">\n");
      out.write("\t\t\t\t\t\t<table id=\"jqGrid\"></table>\n");
      out.write("\t\t\t\t\t\t<div id=\"jqGridPager\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"modalSelectBtn\">Select</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"returnModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"returnModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<h5 class=\"modal-title\" id=\"returnModalLabel\">Search Customer</h5>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t<div class=\"frame\">\n");
      out.write("\t\t\t\t\t<div class=\"center\">\n");
      out.write("\t\t\t\t\t\t<input id=\"returnSerial\" placeholder=\"typing serial number\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"returnSearchBtn\">Search</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"center\">\n");
      out.write("\t\t\t\t\t\t<table id=\"returnjqGrid\"></table>\n");
      out.write("\t\t\t\t\t\t<div id=\"returnjqGridPager\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"modelReturnBtn\">Return</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<body class=\"text-center\">\n");
      out.write("\t<main class=\"form-signin\">\n");
      out.write("\t<form>\n");
      out.write("\t\t<img class=\"mb-4\" src=\"/image/kd.png\" alt=\"\" width=\"72\" height=\"57\">\n");
      out.write("\t\t<h1 class=\"h3 mb-3 fw-normal\">\n");
      out.write("\t\t\t재택근무 노트북 </br> 등록 페이지\n");
      out.write("\t\t</h1>\n");
      out.write("\t\t<div style=\"float: left; display: inline-flex; width: 100%; \">\n");
      out.write("\t\t\t<button type=\"button\" class=\"w-100 btn btn-lg btn-secondary\" id=\"searchBtn\" name=\"searchBtn\" value=\"검색\" data-toggle=\"modal\" data-target=\"#myModal\">Search</button>\n");
      out.write("\t\t\t<button type=\"button\" class=\"w-100 btn btn-lg btn-success\" id=\"returnBtn\" name=\"returnBtn\" value=\"반납\" data-toggle=\"modal\" data-target=\"#returnModal\">Return</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t<div class=\"div-label\">\n");
      out.write("\t\t\t\t<label class=\"input-label\">사용자 사번</label> <input type=\"userid\" class=\"form-control\" id=\"UserID\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"div-label\">\n");
      out.write("\t\t\t\t<label class=\"input-label\">사용자 부서</label> <input type=\"userdept\" class=\"form-control\" id=\"UserDept\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"div-label\">\n");
      out.write("\t\t\t\t<label class=\"input-label\">사용자 이름</label> <input type=\"usernm\" class=\"form-control\" id=\"UserName\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"div-label\">\n");
      out.write("\t\t\t\t<label class=\"input-label\">S/N</label> <input type=\"serialnumber\" class=\"form-control\" id=\"Serial\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<button class=\"w-100 btn btn-lg btn-primary\" style=\"width:100px;\"type=\"button\" id=\"registerBtn\">Register</button>\n");
      out.write("\t\t<p class=\"mt-5 mb-3 text-muted\">&copy; Since Corona Virus, 2019–2022</p>\n");
      out.write("\t</form>\n");
      out.write("\t</main>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(\"#searchBtn\").on(\"click\", function(e) { //KD/파트너\n");
      out.write("\t\t\t\t\t\tif ($(\"#UserNM\").val() == \"\") {\n");
      out.write("\t\t\t\t\t\t\talert(\"이름을 입력해주세요.\");\n");
      out.write("\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\tvar listData;\n");
      out.write("\t\t\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\t\t\turl : \"/searchUser.do\",\n");
      out.write("\t\t\t\t\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\t\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\t\t\t\t\"UserNM\" : $(\"#UserNM\").val()\n");
      out.write("\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\tdataType : \"json\",\n");
      out.write("\t\t\t\t\t\t\t\tloadtext : \"loading...\",\n");
      out.write("\t\t\t\t\t\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=UTF-8\",\n");
      out.write("\t\t\t\t\t\t\t\tasync : false,\n");
      out.write("\t\t\t\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\t\t\t\tvar i = 0;\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#jqGrid\").clearGridData();\n");
      out.write("\t\t\t\t\t\t\t\t\t$(data).each(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar rowdata = {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tUserID : this.UserID,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tUserNM : this.UserNM,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tDEPTNM : this.DEPTNM,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tSeq : this.Seq\n");
      out.write("\t\t\t\t\t\t\t\t\t\t};\n");
      out.write("\t\t\t\t\t\t\t\t\t\tconsole.log(rowdata);\n");
      out.write("\t\t\t\t\t\t\t\t\t\tjQuery(\"#jqGrid\").jqGrid('addRowData', i, rowdata);\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#jqGrid\").jqGrid('setGridParam',{ data : data.listData });\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#jqGrid\").trigger('reloadGrid');\n");
      out.write("\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\terror : function(XMLHttpRequest, textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.\n");
      out.write("\t\t\t\t\t\t\t\t\tconsole.log(XMLHttpRequest);\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\tvar jsonData;\n");
      out.write("\n");
      out.write("\t$(document).ready(\n");
      out.write("\t\t\tfunction() {\n");
      out.write("\t\t\t\t$(\"#jqGrid\").jqGrid(\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\tmtype : \"GET\",\n");
      out.write("\t\t\t\t\t\t\tdatatype : \"local\",\n");
      out.write("\t\t\t\t\t\t\tcolNames : [ 'Seq', '사번', '이름', '부서', ],\n");
      out.write("\t\t\t\t\t\t\tcolModel : [ {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'Seq',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'Seq',\n");
      out.write("\t\t\t\t\t\t\t\tkey : true,\n");
      out.write("\t\t\t\t\t\t\t\twidth : 20\n");
      out.write("\t\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'UserID',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'User ID',\n");
      out.write("\t\t\t\t\t\t\t\twidth : 100\n");
      out.write("\t\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'UserNM',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'UserNM',\n");
      out.write("\t\t\t\t\t\t\t\twidth : 100\n");
      out.write("\t\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'DEPTNM',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'DEPTNM',\n");
      out.write("\t\t\t\t\t\t\t\twidth : 150\n");
      out.write("\t\t\t\t\t\t\t} ],\n");
      out.write("\t\t\t\t\t\t\tviewrecords : true,\n");
      out.write("\t\t\t\t\t\t\theight : 230,\n");
      out.write("\t\t\t\t\t\t\trowNum : 10,\n");
      out.write("\t\t\t\t\t\t\trowList : [ 10, 20, 30 ],\n");
      out.write("\t\t\t\t\t\t\tpager : \"#jqGridPager\",\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\tonSelectRow : function(rowid, status, e) {\n");
      out.write("\t\t\t\t\t\t\t\tvar selRowData = $(\"#jqGrid\").jqGrid(\"getRowData\",rowid);\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#modal_userid\").val(selRowData.UserID);\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#modal_username\").val(selRowData.UserNM);\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#modal_deptname\").val(selRowData.DEPTNM);\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t$(\"#returnjqGrid\").jqGrid(\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\tmtype : \"GET\",\n");
      out.write("\t\t\t\t\t\t\tdatatype : \"local\",\n");
      out.write("\t\t\t\t\t\t\tcolNames : [ 'Seq', '사번', '이름', '부서','S/N', '불출일자', '반납일자'],\n");
      out.write("\t\t\t\t\t\t\tcolModel : [ {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'Seq',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'Seq',\n");
      out.write("\t\t\t\t\t\t\t\tkey : true,\n");
      out.write("\t\t\t\t\t\t\t\twidth : 20\n");
      out.write("\t\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'UserID',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'User ID',\n");
      out.write("\t\t\t\t\t\t\t\twidth : 100\n");
      out.write("\t\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'UserNM',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'UserNM',\n");
      out.write("\t\t\t\t\t\t\t\twidth : 100\n");
      out.write("\t\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'DEPTNM',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'DEPTNM',\n");
      out.write("\t\t\t\t\t\t\t\twidth : 150\n");
      out.write("\t\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'SerialNumber',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'SerialNumber',\n");
      out.write("\t\t\t\t\t\t\t\twidth : 100\n");
      out.write("\t\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'ProvideDate',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'ProvideDate',\n");
      out.write("\t\t\t\t\t\t\t\twidth : 150\n");
      out.write("\t\t\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\t\t\tname : 'ReturnDate',\n");
      out.write("\t\t\t\t\t\t\t\tindex : 'ReturnDate',\n");
      out.write("\t\t\t\t\t\t\t\twidth : 150\n");
      out.write("\t\t\t\t\t\t\t}],\n");
      out.write("\t\t\t\t\t\t\tviewrecords : true,\n");
      out.write("\t\t\t\t\t\t\theight : 230,\n");
      out.write("\t\t\t\t\t\t\trowNum : 10,\n");
      out.write("\t\t\t\t\t\t\trowList : [ 10, 20, 30 ],\n");
      out.write("\t\t\t\t\t\t\tpager : \"#returnjqGridPager\",\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\tonSelectRow : function(rowid, status, e) {\n");
      out.write("\t\t\t\t\t\t\t\tvar selRowData = $(\"#returnjqGrid\").jqGrid(\"getRowData\",rowid);\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#modal_userid\").val(selRowData.UserID);\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#modal_username\").val(selRowData.UserNM);\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#modal_deptname\").val(selRowData.DEPTNM);\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#modal_serial\").val(selRowData.SerialNumber);\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t//다시 로드 \n");
      out.write("\t\t\t\t$(\"#jqGrid\").trigger('reloadGrid');\n");
      out.write("\t\t\t\t$(\"#returnjqGrid\").trigger('reloadGrid');\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t$(\"#modalSelectBtn\").on(\"click\", function(e) {\n");
      out.write("\t\t$(\"#UserID\").val($(\"#modal_userid\").val());\n");
      out.write("\t\t$(\"#UserName\").val($(\"#modal_username\").val());\n");
      out.write("\t\t$(\"#UserDept\").val($(\"#modal_deptname\").val());\n");
      out.write("\t\t$('#myModal').modal('hide');\n");
      out.write("\t}); \n");
      out.write("\n");
      out.write("\t$(\"#modelReturnBtn\").on(\"click\", function(e) { //KD/파트너\n");
      out.write("\t\tif (window.confirm(\"반납 하시겠습니까?\")) {\n");
      out.write("\t\t\tvar listData;\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/returnlaptop.do\",\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\"UserNM\" : $(\"#modal_username\").val(),\n");
      out.write("\t\t\t\t\t\"UserID\" : $(\"#modal_userid\").val(),\n");
      out.write("\t\t\t\t\t\"DEPTNM\" : $(\"#modal_deptname\").val(),\n");
      out.write("\t\t\t\t\t\"Serial\" : $(\"#modal_serial\").val()\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tdataType : \"json\",\n");
      out.write("\t\t\t\tloadtext : \"loading...\",\n");
      out.write("\t\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=UTF-8\",\n");
      out.write("\t\t\t\tasync : false,\n");
      out.write("\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\tif(data[0].code == \"RETURN\"){\n");
      out.write("\t\t\t\t\t\talert(data[0].result);\n");
      out.write("\t\t\t\t\t\tlocation.reload();\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\talert(\"error\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(XMLHttpRequest, textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.\n");
      out.write("\t\t\t\t\tconsole.log(XMLHttpRequest);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\telse{\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"#returnSearchBtn\").on(\"click\", function(e) { //KD/파트너\n");
      out.write("\t\tif ($(\"#returnSerial\").val() == \"\") {\n");
      out.write("\t\t\talert(\"노트북 자산번호를 입력해주세요.\");\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tvar listData;\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/searchSerial.do\",\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\"returnSerial\" : $(\"#returnSerial\").val()\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tdataType : \"json\",\n");
      out.write("\t\t\t\tloadtext : \"loading...\",\n");
      out.write("\t\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=UTF-8\",\n");
      out.write("\t\t\t\tasync : false,\n");
      out.write("\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\tvar i = 0;\n");
      out.write("\t\t\t\t\t$(\"#returnjqGrid\").clearGridData();\n");
      out.write("\t\t\t\t\t$(data).each(function() {\n");
      out.write("\t\t\t\t\t\tvar rowdata = {\n");
      out.write("\t\t\t\t\t\t\tUserID : this.UserID,\n");
      out.write("\t\t\t\t\t\t\tUserNM : this.UserName,\n");
      out.write("\t\t\t\t\t\t\tDEPTNM : this.DeptName,\n");
      out.write("\t\t\t\t\t\t\tProvideDate : this.ProvideDate,\n");
      out.write("\t\t\t\t\t\t\tReturnDate : this.ReturnDate,\n");
      out.write("\t\t\t\t\t\t\tSerialNumber : this.SerialNumber,\n");
      out.write("\t\t\t\t\t\t\tSeq : this.Seq\n");
      out.write("\t\t\t\t\t\t};\n");
      out.write("\t\t\t\t\t\tconsole.log(rowdata);\n");
      out.write("\t\t\t\t\t\tjQuery(\"#returnjqGrid\").jqGrid('addRowData', i, rowdata);\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t$(\"#returnjqGrid\").jqGrid('setGridParam',{ data : data.listData });\n");
      out.write("\t\t\t\t\t$(\"#returnjqGrid\").trigger('reloadGrid');\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(XMLHttpRequest, textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.\n");
      out.write("\t\t\t\t\tconsole.log(XMLHttpRequest);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"#registerBtn\").on(\"click\", function(e) { //KD/파트너\n");
      out.write("\t\tif (window.confirm(\"저장 하시겠습니까?\")) {\n");
      out.write("\t\t\tvar listData;\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/save.do\",\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\"UserNM\" : $(\"#UserName\").val(),\n");
      out.write("\t\t\t\t\t\"UserID\" : $(\"#UserID\").val(),\n");
      out.write("\t\t\t\t\t\"DEPTNM\" : $(\"#UserDept\").val(),\n");
      out.write("\t\t\t\t\t\"Serial\" : $(\"#Serial\").val()\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tdataType : \"json\",\n");
      out.write("\t\t\t\tloadtext : \"loading...\",\n");
      out.write("\t\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=UTF-8\",\n");
      out.write("\t\t\t\tasync : false,\n");
      out.write("\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\tif(data[0].code == \"DONE\"){\n");
      out.write("\t\t\t\t\t\talert(data[0].result);\n");
      out.write("\t\t\t\t\t\tlocation.reload();\n");
      out.write("\t\t\t\t\t}else if(data[0].code == \"EXISTS\"){\n");
      out.write("\t\t\t\t\t\talert(\"미반납 내역이 있습니다. \\n\" + data[0].result);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(XMLHttpRequest, textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.\n");
      out.write("\t\t\t\t\tconsole.log(XMLHttpRequest);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\telse{\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("<input type=\"hidden\" id=\"modal_userid\" name=\"modal_userid\">\n");
      out.write("<input type=\"hidden\" id=\"modal_username\" name=\"modal_username\">\n");
      out.write("<input type=\"hidden\" id=\"modal_deptname\" name=\"modal_deptname\">\n");
      out.write("<input type=\"hidden\" id=\"modal_serial\" name=\"modal_serial\">\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

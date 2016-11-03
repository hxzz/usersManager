<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- <jsp:include page="/common/easyui.jsp"></jsp:include> --%>
<title>合新智造</title>
</head>
<script language="javascript" type="text/javascript">

var contextPath = "<%=request.getContextPath()%>";


	function postPathdata() {
		window.open(contextPath + '/model/system/11111111', '', "", false);

	}

	function modelingInNewWindow() {
		window.open(contextPath + '/model/system/22222222', '', "", false);
	}

	function postMonitorData() {
		window.open(contextPath + '/model/system/33333333', '', "", false);

	}
</script>
<body>

	<center>
		<h2>请选择一个模型进行建模</h2>


	<div id="iControlbox">
		<p id="lnglat"></p>
		<ul>
			<li>
				<button onclick="postPathdata();">新建一个齿轮</button>
				<button onclick="postMonitorData();">新建一个花瓶</button>
				<button onclick="modelingInNewWindow();">新建一个花瓶</button>
			</li>

		</ul>
	</div>
	</center>
</body>
</html>
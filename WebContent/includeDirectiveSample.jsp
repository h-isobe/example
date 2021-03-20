<!-- コード12-4 静的インクルードを行うJSPファイル -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common.jsp" %>
<%
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");  //インクルード先でimportしたクラスを使用
String today = sdf.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%= name %>さんの<%= today %>の運勢は・・・  <!-- インクルード先で定義した変数nameを使用 -->
</body>
</html>
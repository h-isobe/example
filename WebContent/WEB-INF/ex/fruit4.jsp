<!-- 練習問題12-2 EL式 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <!-- 常にアプリケーションスコープからインスタンスを取得するために明示的にapplicationScopeを利用 -->
  ${applicationScope.fruit.name}の値段は
  ${applicationScope.fruit.price}円です。
</body>
</html>
<!-- コード12-1 動的インクルードを行うJSPファイル -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>インクルードのサンプル</title>
</head>
<body>
  <h1>どこつぶへようこそ</h1>
  <p>「どこつぶ」は・・・</p>
  <jsp:include page="/footer.jsp" />  <!-- 指定方法はWebContent直下のURL。終了タグ忘れない！！-->
</body>
</html>
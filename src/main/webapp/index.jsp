<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<html>
<body>
<h2>Hello World!</h2>

<p>initMsg: ${initMsg }</p>
<p>result: ${csfResult }</p>
<p>
	<form action="/httpservice/csf" method="post">
	 serviceCode: <input type="text" name="serviceCode">
	 jsonParam: <input type="text" name="jsonParam">
	 <input type="submit" value="csfWeb">
	</form>
</p>
<p>
	<form action="/httpservice/temp" method="post">
	 <input type="submit" value="tempTest">
	</form>
</p>

</body>
</html>

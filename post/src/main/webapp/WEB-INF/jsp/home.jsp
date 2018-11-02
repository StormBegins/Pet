<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>通讯录</title>
</head>
<body>

<form action="/" method="post">
    <input type="text" name="name" placeholder="姓名" />
    <input type="text" name="address" placeholder="地址" />
    <input type="submit" />
</form>

<ul>
<c:forEach items="${contacts}" var="contact">
    <li> ${contact.name}, ${contact.title},${contact.content}<a href="/del/">删除</a></a> </li>
</c:forEach>
</ul>
<h1></h1>
<%--<div>
    <p>总共有 ${pageInfo.pages} 页，总共有 ${pageInfo.total}</p>
    <p>当前是第 ${pageInfo.pageNum} 页</p>
    <c:forEach begin="1" end="${pageInfo.pages}" var="p">
        <a href="/?page=${p}">第 ${p} 页  </a>
    </c:forEach>
</div>--%>

</body>
</html>

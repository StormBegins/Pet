<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title></title>
    <div>
        <h1>
            <spring:message code="global.greeting" arguments="${user}::~~~" argumentSeparator="::" />
        </h1>
        <spring:message code="page.cl" />
        <br>
        <a href="/c/cc/zh">中文</a>
        <a href="/c/cc/en">English.</a>
        <a href="/c/cc/jp">小日本</a>
        <br><br>
    </div>

    <form:form action="/c" method="post" modelAttribute="category">
        <div>
            <form:input path="id" placeholder="id"/>
            <form:errors path="id"/>
        </div>

        <div>
            <form:input path="name" placeholder="name"/>
            <form:errors path="name"/>
        </div>
        <input type="submit"/>
    </form:form>
</head>
<body>

</body>
</html>

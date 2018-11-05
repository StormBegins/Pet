<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
</head>
<style>
    tr,td{
        width: 300px;
        height: 50px;
        border:1px solid black;
        tab-size: inherit;
    }
    #upDiv {
        position: absolute;
        width: 300px;
        height: 500px;
        top: 120px;
        left: 500px;
        background-color: yellowgreen;
        border: 1px solid black;
        padding: 30px;
        display: none;
    }
</style>
<script>

    $(function () {
        $("#upPageBtn").click(function () {
            var u = this.parentElement.parentElement.firstElementChild;
            var id = u.firstChild;
            var username = u.nextElementSibling.firstChild;
            var firstname = u.nextElementSibling.nextElementSibling.firstChild;
            var lastname = u.nextElementSibling.nextElementSibling.nextElementSibling.firstChild;
            var email = u.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.firstChild;
            var password =  u.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.firstChild;
            var phone = u.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.firstChild;
            var userstatus =u.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.firstChild;
            upForm.id.value=id.textContent;
            upForm.username.value=username.textContent;
            upForm.firstname.value=firstname.textContent
            upForm.lastname.value=lastname.textContent;
            upForm.email.value=email.textContent;
            upForm.password.value=password.textContent;
            upForm.phone.value=phone.textContent
            upForm.userstatus.value=userstatus.textContent;
            $("#upDiv").slideDown(1000);
        });
        $("#cancelBtn").click(function () {
            $("#upDiv").fadeOut(1000);
        });
    });
</script>
<body>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<h1>用户列表</h1>
<form action="/u/p">
    <input type="text" name="id"/>
    <input type="submit"/>
</form>
<table class="pet">
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>名字</td>
        <td>姓</td>
        <td>电子邮箱</td>
        <td>密码</td>
        <td>电话</td>
        <td>权限</td>
        <td>修改</td>
    </tr>
    <c:forEach items="${user}" var="use">
        <tr id="da">
            <td>${use.id}</td>
            <td>${use.username}</td>
            <td>${use.firstname}</td>
            <td>${use.lastname}</td>
            <td>${use.email}</td>
            <td>${use.password}</td>
            <td>${use.phone}</td>
            <td>${use.userstatus}</td>
            <td><input type="button" value="修改" id="upPageBtn"/>
                ------------------------
                <a href="/u/del/${use.id}">删除</a>
            </td>

        </tr>
    </c:forEach>
    <br/>
</table>
<h1>添加宠物</h1>
<form  action="/u" method="post">
    <table>
        <tr>
            <td>编号:<input type="text" name="id"/> </td>
            <td>用户名:<input type="text" name="username"/></td>
            <td>名字:<input type="text" name="firstname"/></td>
            <td>姓:<input type="text" name="lastname"/></td>
            <td>电子邮箱:<input type="text" name="email"/></td>
            <td>密码:<input type="text" name="password"/></td>
            <td>电话:<input type="text" name="phone"/></td>
            <td>权限:<input type="text" name="userstatus"/></td>
        </tr>
    </table>
    <input type="submit" />
</form>

<div id="upDiv">
    <h2 align="center">修改用户</h2>

    <form id="upForm" method="get" action="/u/up">
        编号：<input name="id" type="text"/><br/><br/>
        用户名：<input name="username" type="text"/><br/><br/>
        名字：<input name="firstname" type="text"/><br/><br/>
        姓：<input name="lastname" type="text"/><br/><br/>
        电子邮箱：<input name="email" type="text"/><br/><br/>
        密码：<input name="password" type="text"/><br/><br/>
        电话：<input name="phone" type="text"/><br/><br/>
        权限：<input name="userstatus" type="text"/><br/><br/>
        <input id="addBtn" style="width: 100px" type="submit" value="修改"/>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <input id="cancelBtn" style="width: 100px" type="button" value="取消"/>

    </form>
</div>
</body>
</html>

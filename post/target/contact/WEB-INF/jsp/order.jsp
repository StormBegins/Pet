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
            var petid = u.nextElementSibling.firstChild;
            var quantity = u.nextElementSibling.nextElementSibling.firstChild;
            var shipdate = u.nextElementSibling.nextElementSibling.nextElementSibling.firstChild;
            var status = u.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.firstChild;
            upForm.id.value=id.textContent;
            upForm.petid.value=petid.textContent;
            upForm.quantity.value=quantity.textContent
            upForm.shipdate.value=shipdate.textContent;
            upForm.status.value=status.textContent;
            $("#upDiv").slideDown(1000);
        });
        $("#cancelBtn").click(function () {
            $("#upDiv").fadeOut(1000);
        });
    });
</script>
<body>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<h1>订单列表</h1>
<form action="/o/p">
    <input type="text" name="id"/>
    <input type="submit"/>
</form>
<table class="pet">
    <tr>
        <td>编号</td>
        <td>编码</td>
        <td>数量</td>
        <td>发货日期</td>
        <td>状态</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${orders}" var="order">
        <tr id="da">
            <td>${order.id}</td>
            <td>${order.petid}</td>
            <td>${order.quantity}</td>
            <td>${order.shipdate}</td>
            <td>${order.status}</td>
            <td><input type="button" value="修改" id="upPageBtn"/>
                ------------------------
                <a href="/o/del/${order.id}">删除</a>
            </td>

        </tr>
    </c:forEach>
    <br/>
</table>
<h1>添加宠物</h1>
<form  action="/o" method="post">
    <table>
        <tr>
            <td>编号:<input type="text" name="id"/> </td>
            <td>编码:<input type="text" name="petid"/></td>
            <td>数量:<input type="text" name="quantity"/></td>
            <td>发货日期:<input type="text" name="shipdate"/></td>
            <td>状态:<input type="text" name="status"/></td>
        </tr>
    </table>
    <input type="submit" />
</form>

<div id="upDiv">
    <h2 align="center">修改订单</h2>

    <form id="upForm" method="get" action="/o/up">
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

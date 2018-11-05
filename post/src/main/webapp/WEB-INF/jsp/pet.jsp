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
        height: 300px;
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
            var id = this.parentElement.parentElement.firstElementChild.firstChild;
            var name = this.parentElement.parentElement.firstElementChild.nextElementSibling.firstChild;
            var status = this.parentElement.parentElement.firstElementChild.nextElementSibling.nextElementSibling.firstChild;
            var tagid = this.parentElement.parentElement.firstElementChild.nextElementSibling.nextElementSibling.nextElementSibling.firstChild;

            upForm.id.value=id.textContent;
            upForm.name.value=name.textContent;
            upForm.status.value=status.textContent
            upForm.tagid.value=tagid.textContent;
            $("#upDiv").slideDown(1000);
        });
        $("#cancelBtn").click(function () {
            $("#upDiv").fadeOut(1000);
        });

    });


</script>
<body>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<h1>宠物列表</h1>
<form action="/pet/p">
    <input type="text" name="id"/>
    <input type="submit"/>
</form>
    <table class="pet">
        <tr>
        <td>编号</td>
        <td>名字</td>
        <td>状态</td>
        <td>类型</td>
        <td>修改</td>
        </tr>
<c:forEach items="${pet}" var="pet">
        <tr id="da">
        <td>${pet.id}</td>
        <td>${pet.name}</td>
        <td>${pet.status}</td>
        <td>${pet.tagid}</td>
        <td><input type="button" value="修改" id="upPageBtn"/>
            ------------------------
            <a href="/pet/del/${pet.id}">删除</a>
        </td>

        </tr>
</c:forEach>
        <br/>
    </table>
    <h1>添加宠物</h1>
    <form  action="/pet" method="post">
        <table>
            <tr>
                <td>编号:<input type="text" name="id"></td>
                <td>名字：<input type="text" name="name"></td>
                <td>状态：<input type="text" name="status"></td>
                <td>类型编号：<input type="text" name="tagid"></td>
            </tr>
        </table>
        <input type="submit" />
    </form>

    <div id="upDiv">
        <h2 align="center">修改宠物</h2>

        <form id="upForm" method="get" action="/pet/up">
            宠物编号：<input name="id" type="text"/><br/><br/>
            宠物状态：<input name="status" type="text"/><br/><br/>
            宠物名称：<input name="name" type="text"/><br/><br/>
            宠物类型：<input name="tagid" type="text"/><br/><br/>
                <input id="addBtn" style="width: 100px" type="submit" value="修改"/>
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <input id="cancelBtn" style="width: 100px" type="button" value="取消"/>

        </form>
    </div>
</body>
</html>

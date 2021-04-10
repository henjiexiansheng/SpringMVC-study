<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/5
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script>
      function a(){
        $.post({
            url:"${pageContext.request.contextPath}/a1",  //请求
            data:{"name":$("#username").val()},   //id选择器username中获取数据，传入name
            success: function (data){
                alert(data);
            },
            error: function (){

            }
        })
      }
    </script>
  </head>
  <body>
    <%--失去焦点的时候（鼠标经过时），发起一个请求到后台--%>
    用户名：<input type="text" id="username" onblur="a()">
  </body>
</html>

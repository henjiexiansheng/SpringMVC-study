<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script>
        function  ck1(){
            $.post("${pageContext.request.contextPath}/a3",{"name":$('#name').val()},function (data){
                $('#userInfo').text(data);
                $('#userInfo').css("color","red");
            })
        }
        function  ck2(){
            $.post("${pageContext.request.contextPath}/a3",{"pwd":$('#pwd').val()},function (data){
                $('#pwdInfo').text(data);
                $('#pwdInfo').css("color","red");
            })
        }
    </script>
</head>
<body>
    <p>
        <span>用户名</span><input type="text" id="name" onblur="ck1()"><span id="userInfo"></span>
    </p>
    <p>
        <span>密码</span><input type="password" id="pwd" onblur="ck2()"><span id="pwdInfo"></span>
    </p>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script>
        $(function (){
            $("#btn").click(function (){
                //$.post("url,parameter(可以省略),success 回调函数(用来接收后台返回的JSON))
                $.post("${pageContext.request.contextPath}/a2",function (data){
                    //将data的JSON通过JQuery的DOM事件解析到表格
                    var html = "";
                    for(let i = 0;i < data.length;i++){
                        html += "<tr>" +
                            "<td>" + data[i].name + "</td>" +
                            "<td>" + data[i].age + "</td>" +
                            "<td>" + data[i].sex + "</td>" +
                            "</tr>";
                    }
                    $("#content").html(html);
                });
            })
        });
    </script>
</head>
<body>
<input type="button" value="加载" id="btn">
    <table>
        <tr>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
        </tr>
        <tbody id="content">
        <%--数据从后台取--%>
        </tbody>
    </table>
</body>
</html>

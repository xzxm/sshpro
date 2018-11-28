<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/20 0020
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>用户界面</title>
    <script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>
    <table>
        <thead>
        <tr>
            <th width="5%">id</th>
            <th width="8%">昵称</th>
            <th width="10%">用户账号</th>
            <th width="16%">头像</th>
            <th width="8%">认证类型</th>
            <th width="5%">回答个数</th>
            <th width="5%">会员状态</th>
            <th width="6%">认证状态</th>
            <th width="10%">注册时间</th>
            <th width="22%">操作</th>
        </tr>
        </thead>
        <tbody id="tb">

        </tbody>
    </table>
</body>
</html>
<script type="text/javascript">
    $(function () {
           $.ajax({
               url:"<%=path%>/background/getUserList",
               type:"get",
               success:function (data) {
                   var obj=eval(data);
                    console.log(obj);
               },
               error:function () {
                   console.log("请求人员信息失败");
               }
           });

    });
</script>
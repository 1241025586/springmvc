<%--
  Created by IntelliJ IDEA.
  User: 余德帅
  Date: 2020/4/7
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--发起ajax--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-1.8.3.js"></script>

<script type="text/javascript">
    function  f1() {
        $.ajax({
            url:'${pageContext.request.contextPath}/stucllP2/getData2.do',
         type:'POST',
            contextType:'application/text;charset=utf-8',
            success:function (a) {
              //  alert("得到的参数:"+a);


             //   alert("响应成功"+a+a.a.name+a.age)

                $(a).each(function (index,element) {
                    alert("便利的元素:"+element+"---"+element.id+"---"element.name);
                })
            },
            error:function (a) {
                alert("发生异常:"+a);
            }
        })
    }
</script>
</head>
<body>
<p onclick="f1();">不带你</p>
</body>
</html>

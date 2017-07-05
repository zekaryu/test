<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <jsp:include page="/WEB-INF/jsps/head.jsp"/>
    <style>
        .header {
            text-align: center;
        }

        .header h1 {
            font-size: 200%;
            color: #333;
            margin-top: 30px;
        }

        .header p {
            font-size: 14px;
        }
    </style>
</head>
<body>
<a>${basePath}</a>
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a
        href="http://browsehappy.com/" target="_blank">升级浏览器</a>
    以获得更好的体验！</p>
<![endif]-->
<div class="header">
    <div class="am-g">
        <h1>Web ide</h1>
        <p>Integrated Development Environment<br/>代码编辑，代码生成，界面设计，调试，编译</p>
    </div>
    <hr/>
</div>
<div class="am-g">
    <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
        <h3>登录</h3>
        <hr>
        <div class="am-btn-group">
            <a href="#" class="am-btn am-btn-secondary am-btn-sm"><i
                    class="am-icon-github am-icon-sm"></i> Github</a>
            <a href="#" class="am-btn am-btn-success am-btn-sm"><i
                    class="am-icon-google-plus-square am-icon-sm"></i> Google+</a>
            <a href="#" class="am-btn am-btn-primary am-btn-sm"><i
                    class="am-icon-stack-overflow am-icon-sm"></i> stackOverflow</a>
        </div>
        <br>
        <br>

        <form method="post" class="am-form">
            <label for="username">用户名:</label>
            <input type="username" name="" id="username" value="">
            <br>
            <label for="password">密码:</label>
            <input type="password" name="" id="password" value="">
            <br>
            <label for="remember-me">
                <input id="remember-me" type="checkbox">
                记住密码
            </label>
            <br/>
            <div class="am-cf">
                <input type="submit" name="" id="login" value="登 录"
                       class="am-btn am-btn-primary am-btn-sm am-fl">
                <input type="submit" name="" value="忘记密码 ^_^? "
                       class="am-btn am-btn-default am-btn-sm am-fr">
            </div>
        </form>
        <hr>
        <p>© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
    </div>


</div>

<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu"
   data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

<footer>
    <hr>
    <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
</footer>
<jsp:include page="/WEB-INF/jsps/script.jsp"/>
<script>
    $(function() {
        $('#id').click(function () {
            var username = $('#username');
            var password = $('#password');
            $.ajax({
                dataType:"json",
                type : "post",
                url : ${basePath} + '/login',
                data :{
                    username: username,
                    password : password
                },
                success: function (data) {

                },
                error:function (data) {

                }
                   });
        });
    })
</script>
</body>
</html>

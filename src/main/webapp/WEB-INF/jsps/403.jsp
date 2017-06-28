<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <jsp:include page="/WEB-INF/jsps/head.jsp"/>
</head>
<body>
<a>${basePath}</a>
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
    以获得更好的体验！</p>
<![endif]-->

<div class="am-cf admin-main">
    <!-- content start -->
    <div class="admin-content">
        <div class="admin-content-body">
            <div class="am-cf am-padding am-padding-bottom-0">
                <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">403</strong> / <small>That’s an error</small></div>
            </div>

            <hr>

            <div class="am-g">
                <div class="am-u-sm-12">
                    <h2 class="am-text-center am-text-xxxl am-margin-top-lg">403. Forbidden</h2>
                    <p class="am-text-center">没有权限访问此页面</p>
                    <a href="${basePath}/index.html" class="am-btn am-btn-primary">主页</a>
                    <a href="${basePath}/index.html" class="am-btn am-btn-lg get-btn">主页</a>
                    <pre class="page-403">

          .----.
       _.'__    `.
   .--($)($$)---/#\
 .' @          /###\
 :         ,   #####
  `-..__.-' _.-\###/
        `;_:    `"'
      .'"""""`.
     /,  ya ,\\
    //  404!  \\
    `-._______.-'
    ___`. | .'___
   (______|______)
        </pre>
                </div>
            </div>
        </div>

        <footer class="admin-content-footer">
            <hr>
            <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
        </footer>
    </div>
    <!-- content end -->

</div>

<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

<footer>
    <hr>
    <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
</footer>
<!--[if (gte IE 9)|!(IE)]><!-->
<script src="${basePath}/assets/js/jquery.min.js"></script>
<!--<![endif]-->
<script src="${basePath}/assets/js/amazeui.min.js"></script>
<script src="${basePath}/assets/js/app.js"></script>
</body>
</html>

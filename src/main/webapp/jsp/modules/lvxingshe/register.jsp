<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <%@ include file="../../static/head.jsp" %>
    <link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css"
          rel="stylesheet">
    <script type="text/javascript" charset="utf-8">
        window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
    </script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<style>
    .error {
        color: red;
    }
</style>
<body>
<!-- Pre Loader -->
<div class="loading">
    <div class="spinner">
        <div class="double-bounce1"></div>
        <div class="double-bounce2"></div>
    </div>
</div>
<!--/Pre Loader -->
<div class="wrapper">
    <!-- Page Content -->
    <div id="content">
        <!-- Top Navigation -->
        <%@ include file="../../static/topNav.jsp" %>
        <!-- Menu -->
        <div class="container menu-nav">
            <nav class="navbar navbar-expand-lg lochana-bg text-white">
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="ti-menu text-white"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul id="navUl" class="navbar-nav mr-auto">

                    </ul>
                </div>
            </nav>
        </div>
        <!-- /Menu --><!-- /Breadcrumb -->
        <!-- Main Content -->
        <div class="container" style="width: 600px">

            <div class="row" center>
                <!-- Widget Item -->
                <div class="col-md-12">
                    <div class="widget-area-2 lochana-box-shadow">
                        <h3 class="widget-title" style="margin-left: 195px">注册</h3>
                        <form id="register">
                            <div class="form-row">
                                    <input id="updateId" name="id" type="hidden">
                                <div class="form-group col-md-12">
                                    <label>账户</label>
                                    <input id="username" name="username" class="form-control"
                                           placeholder="账户">
                                </div>
                                <div class="form-group col-md-12">
                                    <label>密码</label>
                                    <input type="password" id="password" name="password" class="form-control"
                                           placeholder="密码">
                                </div>
                                <div class="form-group col-md-12">
                                    <label>重复密码</label>
                                    <input type="password" id="password1" name="password1" class="form-control"
                                           placeholder="重复密码">
                                </div>
                                <div class="form-group col-md-12">
                                    <label>旅行社名称</label>
                                    <input id="lvxingsheName" name="lvxingsheName" class="form-control"
                                           placeholder="旅行社名称">
                                </div>
                                   <div class="form-group col-md-12">
                                       <label>照片</label>
                                       <img id="lvxingshePhotoImg" src="" width="100" height="100">
                                       <input name="file" type="file" id="lvxingshePhotoupload"
                                              class="form-control-file">
                                       <input name="lvxingshePhoto" id="lvxingshePhoto-input" type="hidden">
                                   </div>
                                 <div class="form-group col-md-12">
                                     <label>余额</label>
                                     <input id="newMoney" name="newMoney" class="form-control"
                                            onchange="newMoneyChickValue(this)" placeholder="余额">
                                 </div>
                                <div class="form-group col-md-12">
                                    <button id="submitBtn" type="button" class="btn btn-primary btn-lg">注册</button>
                                    <button id="exitBtn" type="button" class="btn btn-primary btn-lg">返回</button>
                                </div>
                            </div>
                        </form>

                    </div>
                    <!-- /Widget Item -->
                </div>
            </div>
            <!-- /Main Content -->
        </div>
        <!-- /Page Content -->
    </div>
    <!-- Back to Top -->
    <a id="back-to-top" href="#" class="back-to-top">
        <span class="ti-angle-up"></span>
    </a>
    <!-- /Back to Top -->
    <%@ include file="../../static/foot.jsp" %>
    <script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
    <script>
        <%@ include file="../../utils/menu.jsp"%>
        <%@ include file="../../static/setMenu.js"%>
        <%@ include file="../../utils/baseUrl.jsp"%>

        var tableName = "lvxingshe";
        var pageType = "register";
        var updateId = "";
        var crossTableId = -1;
        var crossTableName = '';
        var ruleForm = {};
        var crossRuleForm = {};

        // 下拉框数组
        <!-- 当前表的下拉框数组 -->

        var ruleForm = {};


        // 文件上传
        function upload() {
        <!-- 当前表的文件上传 -->

        $('#lvxingshePhotoupload').fileupload({
            url: baseUrl + 'file/upload',
            headers: {token: window.sessionStorage.getItem("token")},
            dataType: 'json',
            done: function (e, data) {
                var photoUrl= baseUrl + 'file/download?fileName=' + data.result.file;
                document.getElementById('lvxingshePhotoImg').setAttribute('src',photoUrl);
                document.getElementById('lvxingshePhoto-input').setAttribute('value',photoUrl);
            }
        });

        }

        // 表单提交
        function submit() {

            if (validform() == true && compare() == true) {
                let data = {};
                getContent();
                if( $("#password").val() == null || $("#password").val() == "" ){
                    alert("密码不能为空");
                    return false;
                }else if( $("#password").val() != $("#password1").val() ){
                    alert("两次密码不一致");
                    return false;
                }
                let value = $('#register').serializeArray();
                $.each(value, function (index, item) {
                    data[item.name] = item.value;
                });
                let json = JSON.stringify(data);
                var urlParam;
                var successMes = '';
                httpJson("lvxingshe/register", "POST", data, (res) => {
                    if(res.code == 0){
                        window.sessionStorage.removeItem('id');
                        alert("注册成功")
                        if (window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true") {
                            window.sessionStorage.removeItem('onlyme');
                            window.location.href="../../login.jsp";
                        } else {
                            window.location.href ="../../login.jsp";
                        }
                    }
                });
            } else {
                alert("表单未填完整或有错误");
            }
        }

        <!-- 查询当前表的所有列表 -->

        //初始化下拉框
        <!-- 初始化当前表的下拉框 -->




        // 获取富文本框内容
        function getContent() {

        <!-- 获取当前表的富文本框内容 -->
        }

        //数字检查
        <!-- 当前表的数字检查 -->
        function newMoneyChickValue(e){
            var this_val = e.value || 0;
            /*if(this_val == 0){
                e.value = "";
                alert("0不允许输入");
              */  return false;
        }
            var reg=/^[1-9][0-9]{0,5}(\.[0-9]{1,2})?$/;
            if(!reg.test(this_val)){
                e.value = "";
                alert("只允许输入整数6位,小数2位的数字");
                return false;
            }
        }

        function exit() {
            window.sessionStorage.removeItem("id");
            window.location.href = "../../login.jsp";
        }
        // 表单校验
        function validform() {
            return $("#register").validate({
                rules: {
                        username: "required",
                        password: "required",
                        lvxingsheName: "required",
                        lvxingshePhoto: "required",
                        newMoney: "required",
                },
                messages: {
                        username: "账户不能为空",
                        password: "密码不能为空",
                        lvxingsheName: "旅行社名称不能为空",
                        lvxingshePhoto: "照片不能为空",
                        newMoney: "余额不能为空",
                }
            }).form();
        }

        $(document).ready(function () {
            //设置右上角用户名
            // $('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
            // //设置项目名
            // $('.sidebar-header h3 a').html(projectName)
            // //设置导航栏菜单
            // setMenu();
            $('#exitBtn').on('click', function (e) {
                e.preventDefault();
                exit();
            });
            //查询所有下拉框
        <!--  当前表的下拉框  -->

            // 初始化下拉框
        <!--  初始化当前表的下拉框  -->


            //注册表单验证
            $(validform());

            //初始化上传按钮
            upload();
        <%@ include file="../../static/myInfo.js"%>
                    $('#submitBtn').on('click', function (e) {
                        e.preventDefault();
                        //console.log("点击了...提交按钮");
                        submit();
                    });
        });



        //比较大小
        function compare() {
            var largerVal = null;
            var smallerVal = null;
            if (largerVal != null && smallerVal != null) {
                if (largerVal <= smallerVal) {
                    alert(smallerName + '不能大于等于' + largerName);
                    return false;
                }
            }
            return true;
        }


        // 用户登出
        <%@ include file="../../static/logout.jsp"%>
    </script>
</body>

</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>图书管理系统</title>
    <link href="${ctx!}/bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <link href="${ctx!}/bootstrap/css/font-awesome.min.css" rel="stylesheet" >
    <link href="${ctx!}/css/common.css" rel="stylesheet"/>
    <link href="${ctx!}/css/login.css" rel="stylesheet"/>
    <script src="${ctx!}/js/jquery-2.1.1.js"></script>
    <script src="${ctx!}/bootstrap/js/bootstrap.js"></script>
    <script src="${ctx!}/js/login.js"></script>
</head>
<body style="background: url('${ctx!}/image/index.jpg') no-repeat 100%">
<div class="body-div body-div-login">
    <div class="icon-book icon-4x icon-my-top-8" style="margin-top: 50px;"></div>
    <div class="div-title-font40">图书管理系统</div>
    <div class="div-title-font15">为你的知识找个归宿</div>
    <div class="form-top-5">
        <form>
            <div>
                <div class="icon-user-md label-login">用户名</div>
                <div class="form-div-inline">
                    <input class="form-login-input" type="text" name="userName" value=""/>
                </div>
            </div>
            <div style="margin-top: 5px">
                <div class="icon-eye-close label-login" style="cursor: auto">密码</div>
                <div class="form-div-inline">
                    <input class="" type="password" name="password" value=""/>
                </div>
            </div>
            <div style="margin-top: 15px;">
                <button type="button" class="btn btn-info btn-sm" style="width: 300px">登陆</button>
                <div style="margin-top: 5px;width: 300px;margin-left: 200px;">
                    <span style="float: left;display: inline-block;">还没有账号?<a>注册新账号</a></span>
                    <a style="display: inline-block;float: right;color: red;">忘记密码?</a>
                </div>
            </div>

        </form>
    </div>
</div>
</body>
</html>
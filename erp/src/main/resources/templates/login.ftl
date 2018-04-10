<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>后台管理系统</title>
    <link href="${ctx!}/bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <link href="${ctx!}/bootstrap/css/font-awesome.min.css" rel="stylesheet" >
    <link href="${ctx!}/bootstrap/css/formValidation.min.css" rel="stylesheet" >
    <link href="${ctx!}/css/common.css" rel="stylesheet"/>
    <link href="${ctx!}/css/login.css" rel="stylesheet"/>
    <script src="${ctx!}/js/jquery-2.1.1.js"></script>
    <script src="${ctx!}/bootstrap/js/bootstrap.js"></script>
    <script src="${ctx!}/bootstrap/js/formValidation.min.js"></script>
    <script src="${ctx!}/js/login.js"></script>
    <script src="${ctx!}/js/jquery.validate.min.js"></script>
    <script src="${ctx!}/js/jquery.validate.extend.js"></script>
</head>
<body style="background: url('${ctx!}/image/index.jpg') no-repeat 100%">
<div class="body-div body-div-login">
    <div class="icon-group icon-4x icon-my-top-8" style="margin-top: 50px;"></div>
    <div class="div-title-font40"><#--后台管理系统-->******</div>
    <div class="form-top-5">
        <form class="form-validate">
            <div>
                <label class="icon-user-md label-login">用户名</label>
                <div class="form-div-inline">
                    <input class="form-login-input" type="text" name="userName" value=""/>
                </div>
            </div>
            <div style="margin-top: 5px">
                <label class="icon-eye-close label-login">密码</label>
            <div class="form-div-inline">
                <input class="form-login-input" type="password" name="password" value=""/>
            </div>
            </div>
            <div style="margin-top: 15px;">
                <input type="submit" class="btn btn-info btn-sm" style="width: 300px" value="登陆"/>
            </div>

        </form>
    </div>
</div>
</body>
</html>
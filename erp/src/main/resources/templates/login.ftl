<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>后台管理系统</title>
    <#include "common.ftl">
    <link href="${ctx!}/css/login.css" rel="stylesheet"/>
    <script src="${ctx!}/js/login.js"></script>
</head>
<body style="background: url('${ctx!}/image/index.jpg') no-repeat 100%">
<div class="body-div body-div-login">
    <div class="icon-group icon-4x icon-my-top-8" style="margin-top: 50px;"></div>
    <div class="div-title-font40"><#--后台管理系统-->******</div>
    <div class="form-top-5">
        <form class="form-validate" action="${ctx!}/login">
            <div>
                <label class="icon-user-md label-login">用户名:</label>
                <div class="form-div-inline">
                    <input class="form-login-input" type="text" name="mobile" value=""
                             maxlength="11"/>
                </div>
            </div>
            <div style="margin-top: 5px">
                <label class="icon-eye-close label-login">密码</label>
            <div class="form-div-inline">
                <input class="form-login-input" type="password" name="password" value=""
                        />
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
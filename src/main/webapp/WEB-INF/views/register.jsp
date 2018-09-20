<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/19/019
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form class="form-register ">
    <div class="caption">
        <span class="block left">注册</span>
        <a class="register block right" href="javascript:void(0)">已有账号登录</a>
    </div>
    <h6 class="error"></h6>
    <div class="login-warning">
        <span class="prompt-info"></span>
    </div>
    <div class="input-login">
        <input id="username" placeholder="User ID" type="text"/>
    </div>
    <div class="input-login">
        <input id="password" placeholder="密码" type="password"/>
    </div>
    <div class="input-login">
        <input id="rePassword" placeholder="确认密码" type="password"/>
    </div>
    <div class="input-login">
        <input id="realName" placeholder="真实姓名" type="password"/>
    </div>
    <div class="input-login">
        <input id="phone" placeholder="联系电话" type="password"/>
    </div>
    <div class="input-login">
        <input id="birth" placeholder="出生日期" type="password"/>
    </div>
    <div class="btn-login ">
        <a class="left" href="javascript:void(0)"></a>
        <button class="btn btn-warning right" disabled type="button">创建</button>
    </div>
</form>

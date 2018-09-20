<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/19/019
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form class="form-login">
    <div class="caption">
        <span class="block left">登录</span>
        <a id="register" class="register block right" href="javascript:void(0)">新用户注册</a>
    </div>
    <h6 id="msg" class="msg"></h6>
    <div class="login-warning">
        <span class="prompt-info"></span>
    </div>
    <div class="input-login">
        <input id="username" placeholder="User ID" type="text"/>
    </div>
    <div class="input-login">
        <input id="password" placeholder="密码" type="password"/>
    </div>
    <div class="btn-login ">
        <a id="forget" class="left" href="javascript:void(0)">忘记自己的User ID 或密码</a>
        <button id="login" class="btn btn-success right" disabled type="button">登录</button>
    </div>
</form>
<script>
    $(".form-login input").keyup(function () {
        if($("#username").val()!=null & $("#username").val()!="" & $("#password").val()!=null & $("#password").val()!=""){
            $("#msg").text("");
            $("#login").attr("disabled",false);
        }else{
            $("#login").attr("disabled",true);
        }
    });
    $("#username").blur(function () {
        if($("#username").val()==null || $("#username").val()==""){
            $("#msg").text("账号不能为空");
            return false;
        }
    });
    $("#password").blur(function () {
        if($("#password").val()==null || $("#password").val()==""){
            $("#msg").text("密码不能为空");
            return false;
        }
    });
    $("#login").click(function () {
        login();
    });

    function login(userId,password){
        var username=$("#username").val();
        var password=$("#password").val();
        var data={
            "username":username,
            "password":password
        };
        $.ajax({
            //http://localhost:8080/userController/login
            url:"blog/newBlog",
            type:"POST",
            data:data,
            success:handleResponse,
            error:failed
        })

    }
    function handleResponse(data) {



    }
    function failed() {

    }


</script>
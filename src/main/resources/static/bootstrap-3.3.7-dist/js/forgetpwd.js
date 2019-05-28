$(function () {
    /**
     * 重置密码的第一个判断（学号）
     */
    $("#forgetpwd-first-buootm").click(function () {
        var studentno = $("#exampleInputText").val();
        if(studentno == "" || studentno == null){
            $(".index-login-error-hint").html("您还没有输入学号");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
            window.location.href="/index2";
        }
    })

    /**
     * 重置密码的第二个判断（手机号，验证码）
     */
    $("#forgetpwd-second-buttom").click(function () {
        var student_tellphone = $("#exampleInputTel").val();
        var hiddenTel = $("#hiddenTel").val();
        if(student_tellphone == "" || student_tellphone == null){
            $(".index-login-error-hint").html("您还没有输入电话号码");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }

        if(student_tellphone != hiddenTel){
            $(".index-login-error-hint").html("您输入电话号码不正确");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }

        window.location.href="/index6";
    })

    /**
     * 重置密码的第三个判断（新密码）
     */
    $("#forgetpw-third-buttom").click(function () {
        var pwd = $("#exampleInputPwd").val();
        var confirmPwd = $("#exampleInputConfirmPwd").val();
        if(pwd == "" || pwd == null){
            $(".index-login-error-hint").html("您还没有输入新密码");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }
        if(confirmPwd == "" || confirmPwd == null){
            $(".index-login-error-hint").html("您还没有再次确认密码");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }

        if(pwd != confirmPwd){
            $(".index-login-error-hint").html("您两次输入的密码不一致");
            $("#exampleInputConfirmPwd").val("");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }

        //进行修改操作且跳转到成功页面
        window.location.href="/index4";
    })

    $("#getValiData").click(function () {
        $.ajax({
            url: "/getValiData",
            type: "POST",
            success: function (msg) {
                $("#hiddenValiData").val(msg);
            }
        })
    })

    $("#forgetpwd-fifth-buttom").click(function () {
        var hiddenValiData = $("#hiddenValiData").val();
        var exampleValiData = $("#exampleValiData").val();

        if(hiddenValiData == "" || hiddenValiData == null){
            $(".index-login-error-hint").html("您还没有获取验证码");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }

        if(exampleValiData == "" || exampleValiData == null){
            $(".index-login-error-hint").html("您还没有输入验证码");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }


        if(exampleValiData != hiddenValiData){
            $(".index-login-error-hint").html("您输入的验证码不正确");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }

        window.location.href="/index3";
    })

})
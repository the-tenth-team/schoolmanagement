$(function () {

    var slidingCheck = false;

    var slider = new SliderUnlock("#slider", {
        successLabelTip: "验证成功"
    }, function () {
        slidingCheck = true;
    });
    slider.init();

    /**
     * 表单提交的验证判断
     */
    $("#index-login-buttom").click(function () {
        var username = $("#index-username").val();
        var password = $("#index-password").val();
        var labelTip = $("#labelTip").html();
        if(username == "" || username == null){
            $(".index-login-error-hint").html("您还没有输入账号");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }

        if(password == "" || password == null ){
            $(".index-login-error-hint").html("您还没有输入密码");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }

        if(slidingCheck==false){
            $(".index-login-error-hint").html("您还没有验证");
            $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
            return false;
        }else{
            $(".index-login-error-hint").html("");
            $(".index-login-error-hint").removeClass("glyphicon glyphicon-info-sign");
        }
        /**
         * 提交表单
         * 成功：进入学生管理的首页
         * 失败：返回首页且提示用户
         */
        $.ajax({
            type: "POST",
            url: "/login",
            data: $("form").serialize(),
            success: function(msg){
                if(true){

                    var slider = new SliderUnlock("#slider", {
                        successLabelTip: "验证成功"
                    }, function () {

                    });
                    slider.init();
                    $("#index-password").val("");
                    $(".index-login-error-hint").html("您输入的用户名或密码不正确");
                    $(".index-login-error-hint").addClass("glyphicon glyphicon-info-sign");
                }else {
                    window.location.href="/studentIndex";
                }

            }
        })
    })

})

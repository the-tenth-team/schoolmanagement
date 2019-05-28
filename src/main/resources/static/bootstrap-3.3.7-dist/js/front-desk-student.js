$(function () {

    //改变左边的点击颜色
    for (var i = 0; i < $("#student-list li a").length; i++) {

        $("#student-list li a").eq(i).click(function () {
            $("#student-list li a").not($(this)).css("background", "none");
            $("#student-list li a").not($(this)).css("color", "#757d88");
            $(this).css("background", "linear-gradient(to right,#a945bb,#8f1183)");
            $(this).css("color", "#fcf9fd");
        })
    }
    //表单的基本判断
    $("#student-update-button").click(function () {
        var oldpwd = $("#exampleInputOldPwd").val();
        var newpwd = $("#exampleInputNewPwd").val();
        var ensureNewPwd = $("#exampleInputEnsureNewPwd").val();

        if (oldpwd == "" || oldpwd == null) {
            $("#student-update-error").html("您还没有输入旧密码");
            $("#student-update-error").addClass("glyphicon glyphicon-info-sign");
            return false;
        } else {
            $("#student-update-error").html("");
            $("#student-update-error").removeClass("glyphicon glyphicon-info-sign");
        }

        if (newpwd == "" || newpwd == null) {
            $("#student-update-error").html("您还没有输入新密码");
            $("#student-update-error").addClass("glyphicon glyphicon-info-sign");
            return false;
        } else {
            $("#student-update-error").html("");
            $("#student-update-error").removeClass("glyphicon glyphicon-info-sign");
        }

        if (ensureNewPwd == "" || ensureNewPwd == null) {
            $("#student-update-error").html("您还没有确认密码");
            $("#student-update-error").addClass("glyphicon glyphicon-info-sign");
            return false;
        } else {
            $("#student-update-error").html("");
            $("#student-update-error").removeClass("glyphicon glyphicon-info-sign");
        }

        if (newpwd != ensureNewPwd) {
            $("#exampleInputEnsureNewPwd").val("");
            $("#student-update-error").html("您输入的两次密码不正确");
            $("#student-update-error").addClass("glyphicon glyphicon-info-sign");
            return false;
        } else {
            $("#student-update-error").html("");
            $("#student-update-error").removeClass("glyphicon glyphicon-info-sign");
        }

        //执行密码更新操作
        $.ajax({
            type: "POST",
            url: "update",
            success: function (msg) {
                if (true) {
                    window.parent.location.href = "/";
                } else {
                    $("#exampleInputOldPwd").val("");
                    $("#exampleInputNewPwd").val("");
                    $("#exampleInputEnsureNewPwd").val("");
                    $("#student-update-error").html("您输入的旧密码不正确");
                    $("#student-update-error").addClass("glyphicon glyphicon-info-sign");
                }
            }
        })
    })

    $("#exampleInputScore").change(function () {
        var score = $("#exampleInputScore").val();
        $("#abc").html(score);
    })

})
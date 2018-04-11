$.validator.setDefaults({
                            onkeyup:false,
                            focusCleanup:true,
                            success:"valid",
                            submitHandler: function (form) {
                                if ($(form).valid()){
                                    var obj = serializeForm($(form))
                                    $.ajax({
                                               contentType: "application/json",
                                               url: $(form).attr("action"),
                                               data: JSON.stringify(obj),
                                               method: "post",
                                               dataType:"json",
                                               success: function (data) {
                                                   debugger
                                                    if (data.code == 200){
                                                        window.location.href = ${ctx!} + data.dataMap.url;
                                                    }
                                               },
                                               error: function () {
                                                   alert("系统繁忙,请稍后再试!");
                                               }
                                           });
                                }
                                
                            }
                        });
$(function () {
    $(".form-validate").validate({
                                     errorPlacement: function (error, element) {
                                         error.appendTo(element.parent());
                                     },
                                     rules: {
                                         mobile: {
                                             "required": true,
                                             "mobile": true
                                         },
                                         password: "required"
                                     },
                                     messages: {
                                         mobile: {
                                             required: "请填写账号",
                                             mobile: "请填写正确的账号"
                                         },
                                         password: {
                                             required: "请填写密码"
                                         }
                                     }
                                 })

})

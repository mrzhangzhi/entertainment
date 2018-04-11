$.validator.setDefaults({
                            onkeyup:false,
                            focusCleanup:true,
                            success:"valid",
                            debug:true,
                            submitHandler: function (form) {
                                if ($(form).valid()){
                                    var obj = serializeForm($(form))
                                    $.ajax({
                                               contentType: "application/json",
                                               url: $(form).attr("action"),
                                               data: JSON.stringify(obj),
                                               method: "post",
                                               success: function (data) {
                                               },
                                               error: function (msg) {
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
                                         userName: {
                                             "required": true,
                                             "mobile": true
                                         },
                                         password: "required"
                                     },
                                     messages: {
                                         userName: {
                                             required: "请填写账号",
                                             mobile: "请填写正确的账号"
                                         },
                                         password: {
                                             required: "请填写密码"
                                         }
                                     }
                                 })

})

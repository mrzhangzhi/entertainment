$(function () {
    $(".form-validate").validate({
                              rules: {
                                  userName: { required: true },
                                  password: { required: true }
                              },
                              messages: {
                                  username: {
                                      required: "用户名不能为空"
                                  },
                                  password: {
                                      required: "密码不能为空"
                                  }
                              }
                          });
})
//登陆
function login() {

}

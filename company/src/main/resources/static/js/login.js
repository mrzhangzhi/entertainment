$(function () {
    //图片禁止点击事件
    $('img').bind("contextmenu", function (e) {
        return false;
    });
})

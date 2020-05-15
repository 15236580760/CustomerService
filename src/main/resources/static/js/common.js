// var __apiRoot = 'http://' + '39.100.147.44:30005';


var __apiRoot = 'http://' + 'localhost:30000';

var preUrl = 'http://39.100.147.44:30005';

// 调用消息通用工具方法
var s = s || {};
s.layer = {
    msg: function (msg) {
        if (layui) {
            layui.use('layer', function () {
                var layer = layui.layer;
                layer.msg(msg);
            });
        }
    }
};

//  校验只要是数字（包含正负整数，0以及正负浮点数）就返回true
function isNumber(val){

    var regPos = /^\d+(\.\d+)?$/; //非负浮点数
    var regNeg = /^(-(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*)))$/; //负浮点数
    if(regPos.test(val) || regNeg.test(val)){
        return true;
    }else{
        return false;
    }

}

// ajax请求函数
function ajaxRequest($, type, url, res, successCallBack, errCallBack) {
    $.ajax({
        type: type,
        url: preUrl + url,
        data: res,
        dataType: 'json',
        contentType: 'application/json',
        xhrFields: {
            withCredentials: true
        },
        success: function(data) {
            successCallBack(data);
        },
        error: function(e) {
            errCallBack(e);
        }
    });
}
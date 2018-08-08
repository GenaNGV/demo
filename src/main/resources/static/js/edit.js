/* */

var EditorController = {

    execute: function() {
        var _this = this;

        var query = window.location.search.substring(1);
        var params = query.split("&");

        var id = params[0].split("=")[1];

        $.getJSON('/detail?id=' + id , function (data) {
        });
    }
};


jQuery(document).ready(function ($) {
    EditorController.execute(3);
});
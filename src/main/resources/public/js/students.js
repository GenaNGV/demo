/* */

var StudentController = {
    offset: 0,
    limit: 5,

    draw: function(data) {
        var container = $('div.content').empty().append('<table><thead><tr><th>Имя</th><th>Фамилия</th></tr></thead><tbody></tbody></table>');
        var table = container.find('table tbody');

        var template = "<tr><td>{{firstName}}</td><td>{{lastName}}</td></tr>";

        $.each(data, function(index, student) {
            table.append(Mustache.to_html(template, student));
        });
    },

    execute: function() {
        var _this = this;
        $.getJSON('/list?limit=' + _this.limit + '&offset=' + _this.offset , function (data) {

            _this.draw(data.students);
        });
    }
};


jQuery(document).ready(function ($) {
    StudentController.execute();
});
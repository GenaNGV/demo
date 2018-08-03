/* */


jQuery(document).ready(function ($) {
    console.log('make request');
    $.getJSON('/list', function (data) {
        console.log(data);

        var container = $('div.content').empty().append('<table><thead><tr><th>Имя</th><th>Фамилия</th></tr></thead><tbody></tbody></table>');
        var table = container.find('table tbody');

        var template = "<tr><td>{{firstName}}</td><td>{{lastName}}</td></tr>";

        $.each(data, function(index, student) {
            table.append(Mustache.to_html(template, student));
        });
    });
});
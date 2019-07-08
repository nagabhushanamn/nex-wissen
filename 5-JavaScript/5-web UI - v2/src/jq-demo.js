
import $ from 'jquery';

//----------------------------------------------
var box = $('.alert-info');
$('.btn-danger').click(e => {
    box.hide()
})
$('.btn-primary').click(e => {
    box.show()
})
$('.btn-success').click(e => {
    box.text("Im Jquery")
})

//----------------------------------------------
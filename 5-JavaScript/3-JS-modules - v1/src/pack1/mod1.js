

//--------------------------------------------------------
// var o={
//     doWork:function(){
//         console.log("im mod1");  
//     }
// }

//--------------------------------------------------------

var oneGlobal = oneGlobal || {};

(function () {
    sapient.mod2.doWork();
    var i = 0;
    var o = {
        doWork: function () {
            console.log("im mod1");
        }
    }
    oneGlobal.mod1 = o
})();
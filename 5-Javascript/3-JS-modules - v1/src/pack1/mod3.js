

//--------------------------------------------------------
// var o={
//     doWork:function(){
//         console.log("im mod1");  
//     }
// }

//--------------------------------------------------------

var oneGlobal = oneGlobal || {};

(function () {
    var o = {
        doWork: function () {
            console.log("im mod2");
        }
    }
    oneGlobal.mod3 = o;
})();
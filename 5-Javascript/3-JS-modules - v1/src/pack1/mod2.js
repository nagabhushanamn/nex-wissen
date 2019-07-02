

//--------------------------------------------------------

// var o={
//     doWork:function(){
//         console.log("im mod2");  
//     }
// }

//--------------------------------------------------------

var oneGlobal = oneGlobal || {};
(function () {
    oneGlobal.mod3.doWork();
    var o = {
        doWork: function () {
            console.log("im mod2");
        }
    }
    oneGlobal.mod2 = o;
})();
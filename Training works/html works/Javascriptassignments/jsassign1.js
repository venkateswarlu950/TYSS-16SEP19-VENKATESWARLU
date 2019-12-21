 var d1= new Date();
console.log("my date::"+d1.getDate());
console.log("my day::"+d1.getDay());
console.log("my year::"+d1.getFullYear());
console.log("my month::"+d1.getMonth());
console.log("my time ::"+d1.getTime());
var mydate= new Date(2);
var mydate1= new Date('oct 19');
console.log(mydate);
console.log(mydate1);
var mydate2= new Date(2017,19);
console.log(mydate2);
var mydate3= new Date('jan 17 2017');
console.log(mydate3);

Math.round(10.2);

function add(a,b){
var sum= a+b;
console.log(sum);


}
add(525,20);

var e =(function(m,n)
{
console.log(m-n);

});
var v= e(20,10)
console.log(v);


function add(a,b,c){
    console.log(a+b+c);
}
add(12,14,15);


var div= ((h,j)=>{
    console.log(h/j);
});
div(10,5);
var f= (d,s)=> d+s;
var val = f(10,50);
console.log(val);



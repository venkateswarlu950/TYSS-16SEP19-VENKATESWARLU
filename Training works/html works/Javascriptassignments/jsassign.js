function factorial(n) {
    var f = (n != 1) ? n * factorial(n - 1) : 1;
    console.log(f);
}
 
factorial(5);

var h = (function(n){
    var f = (n != 1) ? n * factorial(n - 1) : 1;
    
});
var v = h(4);
console.log(v);

var j= (n)=> {
    var f = (n != 1) ? n * factorial(n - 1) : 1;
    console.log(f);

}
var k = j(3);
console.log(k);

var fib = function(n) {
    var a = 0, b = 1, f = 1;
    for(var i = 2; i <= n; i++) {
        f = a + b;
        a = b;
        b = f;
    }
    console.log(f);
    return f;
};
var t = fib(3);
console.log(t);
    
  function fib(n){
    var a = 0, b = 1, f = 1;
      for(var i=2; i<=n; i++){
          f = a+b;
          a = b;
          b = f;
      }
console.log(f);
return f;

  }
  fib(3);

var fib = (n) =>{
    var a = 0, b = 1, f = 1;
    for(var i=2; i<=n; i++){
        f = a+b;
        a = b;
        b = f;
    }
    console.log(f);
    return f;
}
var l = fib(5);
console.log(l);

var circleRadius = (function(n){
var circumferenceOfCircle = 2 * Math.PI * n;
 return circumferenceOfCircle;
});

var c = circleRadius(12);
console.log("Circumference of circle is: " +c);

function circum(n){
    var circumferenceOfCircle = 2 * Math.PI * n;
    console.log(circumferenceOfCircle);
    return circumferenceOfCircle;
    

}
circum(20);


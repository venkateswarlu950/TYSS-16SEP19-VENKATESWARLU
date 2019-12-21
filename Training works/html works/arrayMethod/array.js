const hobbies = ['sleeping','cricket','movies','eating']
console.log(typeof hobbies);

const arryornot = Array.isArray(hobbies);
console.log(arryornot);
const hob = hobbies.includes('eating', 2);
console.log(hob);
const add = hobbies.push('roaming','chat');
console.log(add);
console.log(hobbies);
const rem = hobbies.pop();
console.log(rem);
console.log(hobbies);
const unshift = hobbies.unshift('collection','stamps');
console.log(unshift);
var shift = hobbies.shift();
console.log(shift);

console.log(hobbies.splice(2,2,'ram','raheem'));
console.log(hobbies.slice(1,3));
console.log(hobbies.indexOf('movies',1));

const num = [1,2,3,4,5,6]

var values = num.map(val =>val+50);

console.log('my values::'+values);

var filter = num.filter(val =>{
    console.log(val);
    if(val > 3){
        return true;
    }
    else{
        return false;
    }
    
});
console.log('filter values::',filter);

const items = [
    {
        name : 'ring',
        id : 1,
        price : 2000
    },
    {
        name : 'chain',
        id : 2,
        price : 5000

    },
    {
        name : 'cream',
        id : 3,
        price : 1000
    },
    {
        name : 'watch',
        id : 4,
        price : 100
    }

]
console.log('=============')
console.log('step-1',items);     
const newitems = items.map(function(val){
val.price = val.price+300;
return val;

});
console.log("updated::"+newitems);
console.log("my updated new items::",JSON.stringify(newitems));



const itemFilter = items.filter(val =>{
    console.log(val);
    if(val.price >1000){
        return true;
    }
    else{
        return false;
    }
    
});
console.log(itemFilter);


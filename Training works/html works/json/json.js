const person = {
    name : 'venkat',
    age : 24,
    color : 'brown',
    address : {
        city : 'nellore',
        state : 'a.p',
        pincode : 5240004
    },
        hobbies : ['coding', 'eating','sleeping']
    
}
console.log('javascript object person::',person);

let jsonObj = JSON.stringify(person);
console.log('after convert to json::',jsonObj);

const jsonobj2 = JSON.parse(jsonObj);
console.log('after::',jsonobj2);

localStorage.setItem('email','venakt.g@gmai.com');
const emailid = localStorage.getItem('email');
console.log(emailid);
localStorage.clear();


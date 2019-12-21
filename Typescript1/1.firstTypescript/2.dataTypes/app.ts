let myName : string = "venkat";
console.log(myName, typeof myName)
let age = 25;
console.log(age, typeof age)
let mobile : number;
console.log(mobile, typeof mobile);
let address;
console.log(address, typeof address);

let ageCal = function(): void{
    console.log('age is 26');
}
ageCal();

class Person{
    constructor(public name : string, public age :number){

        
    }
   
}
let person1 = new Person("balaji",23);
console.log(person1);

class Student extends Person{
    constructor(name : string, age : number, public rollNo : number){
        super(name,age);

    }
}
let student1 = new Student("badra",25,122);
console.log(student1);

IS-A relationship

//parent
Person{
	name
	age
}

//child class
Employee extends Persons {
	emplieeId
	sala
	depa
	Address // HAS-A relationship
			// dependency
			//composistion
}

//child class - multilevel inheritance
Engineer extends Employee {
	speciality; // can fix gas appliances
}

//***** multiple inheritance not possible
Engineer extends Employee, Person {
	speciality; // can fix gas appliances
}

Address {

}

Employee is a Person
Employee has a address

someMethod(person);
someMethod(emplyee);
someMethod(enge);

void someMethod(Person p) {
}
someMethodForEng(eng);
someMethodForEng(person); // NOT PERMITTED
someMethodForEng(employee); // NOT PERMITTED

void someMethodForEng(Engineer p) {

}




interface MyInterface1{
	void method1() ;
	void method1(param1, param2) ;
}


interface MyInterface2{
	void method12() ;
	void method12(param1, param2) ;
}

interface MyInterface3  implements // NOT permited{

}
interface MyInterface3 extends MyInterface1,MyInterface2 { // possible
	void method13() ;
	void method13(param1, param2) ;
}

class Myclass1 implements MyInterface1 {
	void method1() {// provide implementation}
	void method1(param1, param2) {// provide implementation}
}

class Myclass2 implements MyInterface1, MyInterface2 {
	void method1() {// provide implementation}
	void method1(param1, param2) {// provide implementation}

	void method12() {// provide implementation}
	void method12(param1, param2) {// provide implementation}
}

class Myclass3 implements MyInterface3 {
	void method1() {// provide implementation}
	void method1(param1, param2) {// provide implementation}

	void method12() {// provide implementation}
	void method12(param1, param2) {// provide implementation}

	void method13() {// provide implementation}
	void method13(param1, param2) {// provide implementation}
}

// Marker interface - no methods in it
// Functional interface - has only one method
// Anonymous class - just-in-time implementation class for an interface, no class or separate java files

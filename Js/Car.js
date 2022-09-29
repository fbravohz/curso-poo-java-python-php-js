// ANTES DE ECMASCRIPT 6 SE DECLARABA ASI UNA CLASE (NO EXISTIA LA CLASE COMO TAL)
// function Car(license, driver){
//     this.id;
//     this.license = license;
//     this.driver = driver;
//     this.passenger;
// }

// Car.prototype.printDataCar = function (){
//     console.log(this.license)
//     console.log(this.driver.name)
//     console.log(this.driver.document)
// }

//DESPUES DE ECMASCRIPT 6 YA EXISTE LA PALABRA RESERVADA CLASS Y CONSTRUCTOR
class Car{
    constructor(license,driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }

    printDataCar(){
        console.log(this.license);
        console.table(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document)
    }
}
// ANTES DE ECMASCRIPT 6 SE DECLARABA ASI UNA CLASE (NO EXISTIA LA CLASE COMO TAL)
// function Account(name, document){
//     this.id;
//     this.name = name;
//     this.document = document;
//     this.email;
//     this.password;
// }

//DESPUES DE ECMASCRIPT 6 YA EXISTE LA PALABRA RESERVADA CLASS Y CONSTRUCTOR
class Account{
    constructor(name,document){
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }
}
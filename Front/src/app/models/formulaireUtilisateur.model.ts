import { PhoneNumber } from "google-libphonenumber";

export default interface FormulaireUtilisateur{
    nom:string;
    prenom:string;
    genre:string;
    adresse:string;
    rue:string;
    ville:string;
    pays:string;
    email:string;
    numTel:PhoneNumber;
    
    lieu:string;
    date:Date;
}
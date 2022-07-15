import Session from "./session.model";

export default interface Utilisateur {

    id: number;
    nom: string;
    prenom: string;
    adresse: string;
    email: string;
    telephone: string;
    isTest: boolean;
    noteMoyenne: number;
    isTechnique: boolean;
    isPedagogique: boolean;
    isPrerequis: boolean;
    genre: string;
    session: Session;

}
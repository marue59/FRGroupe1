import Formation from "./formation.model";

export default interface Session{

id: number;
date: Date;
isIntra: boolean;
lieu: string;
formation: Formation;

}

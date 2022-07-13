import Items from './items.model';

export default interface Formation extends Items {
  // description: string;

  description: string;
  prix: number;
  isPersonnalise: boolean;
  heures: number;
  jours: number;
  objectifs: string;
  programme: string;
}

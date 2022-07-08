import Items from './items.model';

export default interface Formation extends Items {
  // description: string;

  contenu: string;
  prix: number;
  isPersonnalise: boolean
}

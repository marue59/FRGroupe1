import Formation from './formation.model';
import Items from './items.model';

export default interface SousTheme extends Items {
  description: string;
  formations: Formation[];
}

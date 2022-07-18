import { Pipe, PipeTransform } from "@angular/core";


@Pipe({name: 'addDays'})
export class AddDays implements PipeTransform{
  transform(date: Date, jours: number) {
    let Newdate : Date = new Date(date);
    Newdate.setDate(Newdate.getDate() + jours);
    return Newdate;
  }
}

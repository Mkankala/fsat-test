import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class WeatherApiServiceService {

  private _locationSub = new Subject<string | null>(); // City location.
  $currentCity: Observable<string> = this._locationSub.asObservable();

  constructor(private http: HttpClient) { }

  newCityToSearch(newCity: string) {
    this._locationSub.next(newCity);
  }

  getCurrentWeather(city: string): Observable<any>{
    return this.http.get(`${environment.weatherApi.url}?q=${city}&appid=${environment.weatherApi.key}`);
  }

}

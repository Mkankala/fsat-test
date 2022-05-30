import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subject } from 'rxjs';
import { takeUntil } from 'rxjs/operators';
import { WeatherApiServiceService } from 'src/app/services/weather-api-service.service';

@Component({
  selector: 'app-current-weather',
  templateUrl: './current-weather.component.html',
  styleUrls: ['./current-weather.component.scss']
})
export class CurrentWeatherComponent implements OnInit, OnDestroy {

  currentCityWeather: any;
  private ngUnsubscribe: Subject<boolean> = new Subject<boolean>();

  constructor(private wtrApiService: WeatherApiServiceService) { }

  ngOnInit(): void {
    this.wtrApiService.$currentCity
      .pipe(takeUntil(this.ngUnsubscribe))
      .subscribe((newCitySearch) => {
        this.searchWeather(newCitySearch);
      });
  }

  searchWeather(city: string) {
    this.wtrApiService.getCurrentWeather(city)
      .pipe(takeUntil(this.ngUnsubscribe))
      .subscribe((result => this.currentCityWeather = result));
  }

  ngOnDestroy() {
    this.ngUnsubscribe.next(null);
    this.ngUnsubscribe.complete();
  }

}

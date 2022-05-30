import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { WeatherApiServiceService } from 'src/app/services/weather-api-service.service';

@Component({
  selector: 'app-weather-search',
  templateUrl: './weather-search.component.html',
  styleUrls: ['./weather-search.component.scss']
})
export class WeatherSearchComponent implements OnInit {

  model: any = {city: null};

  constructor(private wtrApiService: WeatherApiServiceService) { }

  ngOnInit(): void {
  }

  search(searchForm: NgForm) {
    if (searchForm.invalid) {
      return;
    }
    this.wtrApiService.newCityToSearch(this.model.city);
  }
}

import { Component, OnInit } from '@angular/core';
import { MobileService } from '../service/mobile.service';

@Component({
  selector: 'app-forfaitmobile',
  templateUrl: './forfaitmobile.component.html',
  styleUrls: ['./forfaitmobile.component.css']
})
export class ForfaitmobileComponent implements OnInit {

  constructor(private mobileService: MobileService) { }

  ngOnInit() {
  }

}

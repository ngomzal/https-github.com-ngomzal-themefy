import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.scss']
})
export class NavigationComponent implements OnInit {
  //appTitle: string = 'myapp';
  // OR (either will work)
  appTitle = 'Themefy';
  paramsUrl = '../images/parametres.jpg';
  constructor() { }

  ngOnInit() {
  }

}

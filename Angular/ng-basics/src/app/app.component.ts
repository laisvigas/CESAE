import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {first} from 'rxjs';
import {CardComponent} from './card/card.component';
import {CardsComponent} from './cards/cards.component';
import {HeaderComponent} from './master-page/header/header.component';
import {FooterComponent} from './master-page/footer/footer.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, CardComponent, CardsComponent, HeaderComponent, FooterComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})

// Create variable firstName & lastName and display on the html
export class AppComponent {
  title : string = 'ng-basics';
  firstName : string = 'Laís';
  lastName: string = 'Vigas';
  protected readonly first = first;
}


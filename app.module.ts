import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UiModule } from './ui/ui.module';
import { SujetsComponent } from './sujets/sujets.component';
import { CreationComponent } from './creation/creation.component';
import { RechercheComponent } from './recherche/recherche.component';
import { UtilisateurComponent } from './utilisateur/utilisateur.component';
import { ParametresComponent } from './parametres/parametres.component';
import { NavigationComponent } from './navigation/navigation.component';
import { BodyComponent } from './body/body.component';

@NgModule({
  declarations: [
    AppComponent,
    SujetsComponent,
    CreationComponent,
    RechercheComponent,
    UtilisateurComponent,
    ParametresComponent,
    NavigationComponent,
    BodyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    UiModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

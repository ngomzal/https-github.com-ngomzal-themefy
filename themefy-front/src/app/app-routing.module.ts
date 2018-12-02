import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SujetsComponent } from './sujets/sujets.component';
import { CreationComponent } from './creation/creation.component';
import { RechercheComponent } from './recherche/recherche.component';
import { UtilisateurComponent } from './utilisateur/utilisateur.component';
import { ParametresComponent } from './parametres/parametres.component';

const routes: Routes = [
  { path: 'sujets', component: SujetsComponent },
  { path: 'creation', component: CreationComponent },
  { path: 'recherche', component: RechercheComponent },
  { path: 'utilisateur', component: UtilisateurComponent },
  { path: 'recherche', component: RechercheComponent },
  { path: 'parametres', component: ParametresComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

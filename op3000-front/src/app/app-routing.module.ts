import { NgModule } from '@angular/core';
import { RouterModule, Routes }  from '@angular/router';
import { OffreboxComponent } from './offrebox/offrebox.component';
import { ForfaitmobileComponent } from './forfaitmobile/forfaitmobile.component';
import { BouquettvComponent } from './bouquettv/bouquettv.component';
import { ConnexionComponent } from './connexion/connexion.component';
import { InscriptionComponent } from './connexion/inscription/inscription.component';

const appRoutes: Routes = [
  { path: 'offrebox', component: OffreboxComponent },
  { path: 'forfaitmobile', component: ForfaitmobileComponent },
  { path: 'bouquettv', component: BouquettvComponent },
  { path: 'connexion', component: ConnexionComponent },
  { path: 'inscription', component: InscriptionComponent },
  { path: '',  redirectTo: '/',  pathMatch: 'full'},
  { path: '**', redirectTo: '/connexion' }
 ];
 @NgModule({
  imports: [
    RouterModule.forRoot(
      appRoutes, // <-- debugging purposes only
    )
  ],
  exports: [
    RouterModule
  ]
 })
 export class AppRoutingModule {}
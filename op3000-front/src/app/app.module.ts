import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { OffreboxComponent } from './offrebox/offrebox.component';
import { ForfaitmobileComponent } from './forfaitmobile/forfaitmobile.component';
import { BouquettvComponent } from './bouquettv/bouquettv.component';


import { NavbarModule } from './navbar/navbar.module'
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';

import { ConnexionComponent } from './connexion/connexion.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UserComponent } from './user/user.component';
import { InscriptionComponent } from './connexion/inscription/inscription.component';

@NgModule({
  declarations: [
    AppComponent,
    ForfaitmobileComponent,
    OffreboxComponent,
    ForfaitmobileComponent,
    BouquettvComponent,
    ConnexionComponent,
    NavbarComponent,
    UserComponent,
    InscriptionComponent,
  ],
  imports: [
    BrowserModule,
    NavbarModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule, 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

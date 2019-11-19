import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { CdippgatewaySharedModule } from 'app/shared/shared.module';
import { CdippgatewayCoreModule } from 'app/core/core.module';
import { CdippgatewayAppRoutingModule } from './app-routing.module';
import { CdippgatewayHomeModule } from './home/home.module';
import { CdippgatewayEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { JhiMainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    CdippgatewaySharedModule,
    CdippgatewayCoreModule,
    CdippgatewayHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    CdippgatewayEntityModule,
    CdippgatewayAppRoutingModule
  ],
  declarations: [JhiMainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [JhiMainComponent]
})
export class CdippgatewayAppModule {}

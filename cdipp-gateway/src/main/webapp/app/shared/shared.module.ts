import { NgModule } from '@angular/core';
import { CdippgatewaySharedLibsModule } from './shared-libs.module';
import { JhiAlertComponent } from './alert/alert.component';
import { JhiAlertErrorComponent } from './alert/alert-error.component';
import { HasAnyAuthorityDirective } from './auth/has-any-authority.directive';

@NgModule({
  imports: [CdippgatewaySharedLibsModule],
  declarations: [JhiAlertComponent, JhiAlertErrorComponent, HasAnyAuthorityDirective],
  exports: [CdippgatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent, HasAnyAuthorityDirective]
})
export class CdippgatewaySharedModule {}

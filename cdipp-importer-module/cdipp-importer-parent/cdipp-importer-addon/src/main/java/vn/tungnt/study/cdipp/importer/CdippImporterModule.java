package vn.tungnt.study.cdipp.importer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AliasFor;
import vn.tungnt.study.cdipp.importer.addon.CdippImporterAddon;

import java.lang.annotation.*;

/**
 * @author nttung 1/15/20
 * @project cdipp-importer-addon
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ComponentScan
public @interface CdippImporterModule {

    @AliasFor(
            annotation = ComponentScan.class,
            attribute = "basePackageClasses"
    )
    Class<?>[] scanBasePackageClasses() default CdippImporterAddon.class;
}

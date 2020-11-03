package vn.tungnt.study.cdipp.importer.controller.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

/**
 * @author nttung 1/15/20
 * @project cdipp-importer-addon
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RestController
@RequestMapping(value = "/api/sps/customer")
public @interface CdippRestController {
    @AliasFor(
            annotation = Controller.class
    )
    String value() default "/api/sps/customer";
}

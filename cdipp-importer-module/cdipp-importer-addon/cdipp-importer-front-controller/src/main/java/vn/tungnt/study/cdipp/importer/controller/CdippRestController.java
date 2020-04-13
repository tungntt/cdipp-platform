package vn.tungnt.study.cdipp.importer.controller;

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
@RequestMapping("/api/cdipp/customer")
public @interface CdippRestController {
}

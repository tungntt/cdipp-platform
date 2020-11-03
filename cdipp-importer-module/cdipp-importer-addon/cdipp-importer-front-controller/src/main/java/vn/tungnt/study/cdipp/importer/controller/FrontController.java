package vn.tungnt.study.cdipp.importer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import vn.tungnt.study.cdipp.importer.controller.annotation.CdippRestController;

/**
 * @author nttung 1/4/20
 * @project cdipp-importer-parent
 */
@CdippRestController
public interface FrontController<INPUT, OUTPUT> {

    @PostMapping("/process")
    OUTPUT processCustomerData(INPUT requestData);
}

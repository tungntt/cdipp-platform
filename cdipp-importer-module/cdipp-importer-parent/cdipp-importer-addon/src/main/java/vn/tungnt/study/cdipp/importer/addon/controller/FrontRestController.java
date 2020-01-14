package vn.tungnt.study.cdipp.importer.addon.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author nttung 1/4/20
 * @project cdipp-importer-parent
 */
@RestController("/api/cdipp/customer")
public interface FrontRestController<T, R> {

    @PostMapping("/receive")
    T receivedCustomerData(R requestData);
}

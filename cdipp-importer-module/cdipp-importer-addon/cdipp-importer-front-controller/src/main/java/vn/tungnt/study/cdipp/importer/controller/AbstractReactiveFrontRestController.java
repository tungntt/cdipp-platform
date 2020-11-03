package vn.tungnt.study.cdipp.importer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.publisher.Mono;

/**
 * @author nttung 1/4/20
 * @project cdipp-importer-parent
 */
public abstract class AbstractReactiveFrontRestController<T, R, P> extends AbstractFrontController<T, R, P> {

//    @PostMapping("/receive")
//    @Override
//    public Mono<T> receivedCustomerData(R requestData) {
//        return Mono.just(this.processCustomerData(requestData));
//    }
}


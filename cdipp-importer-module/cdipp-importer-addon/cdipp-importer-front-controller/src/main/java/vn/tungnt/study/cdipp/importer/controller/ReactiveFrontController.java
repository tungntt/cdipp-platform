package vn.tungnt.study.cdipp.importer.controller;

import reactor.core.publisher.Mono;

/**
 * @author nttung 1/4/20
 * @project cdipp-importer-parent
 */
public interface ReactiveFrontController<T , R> {

    Mono<T> receivedCustomerData(R requestData);
}

package vn.tungnt.study.cdipp.importer.repository;

import vn.tungnt.study.cdipp.importer.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}

package com.zero.spring.sce_java.interceptors;

import org.springframework.data.repository.CrudRepository;

import com.zero.spring.sce_java.entities.PersonEntity;

//public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

}

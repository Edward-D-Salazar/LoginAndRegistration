package com.example.demo.store;

import org.springframework.data.repository.CrudRepository;

public interface UserEntityCrudRepository extends CrudRepository<LoginEntity, Long> {
}

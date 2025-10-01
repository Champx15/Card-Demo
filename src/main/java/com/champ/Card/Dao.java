package com.champ.Card;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends CrudRepository<User, Integer> {
}

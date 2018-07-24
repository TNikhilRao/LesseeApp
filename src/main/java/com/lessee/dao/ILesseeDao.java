package com.lessee.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lessee.entity.Lessee;

/**
 * @author Nikhil.Tirmanwar
 *
 */
@Repository
public interface ILesseeDao extends MongoRepository<Lessee, String>, CrudRepository<Lessee, String> {
	public Lessee findByLesseeId(String lesseeId);
}

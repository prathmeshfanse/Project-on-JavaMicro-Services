package com.pension.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.pension.entity.Pensioner;

@EnableMongoRepositories
public interface IPensionerRepository extends MongoRepository<Pensioner, Long> {
	/*public Pensioner saveall(Pensioner pensioner);

	public Optional<Pensioner> getByAadharNo(long no);
	
	
*/
}

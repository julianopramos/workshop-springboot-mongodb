package br.com.fasttrack.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.fasttrack.course.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}

package sk.pro.dekanat.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sk.pro.dekanat.model.Faculty;

@Repository
public interface FacultyRepository extends MongoRepository<Faculty,Integer>
{}

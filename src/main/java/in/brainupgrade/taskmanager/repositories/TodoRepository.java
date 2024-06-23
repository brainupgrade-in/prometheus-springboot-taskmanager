package in.brainupgrade.taskmanager.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.brainupgrade.taskmanager.models.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

    long countByCompleted(boolean completed);

}

package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Assignment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface AssisgnmentRepository extends CrudRepository<Assignment, Integer>, Repository<Assignment, Integer>
{

}

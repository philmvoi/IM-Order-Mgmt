package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.AssignmentStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface AssignmentStatusRepository extends CrudRepository<AssignmentStatus, Integer>, Repository<AssignmentStatus, Integer>
{

}

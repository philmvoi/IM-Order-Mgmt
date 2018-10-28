package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.AssignmentLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface AssignmentLineRepository extends CrudRepository<AssignmentLine, Integer>, Repository<AssignmentLine,Integer>
{

}

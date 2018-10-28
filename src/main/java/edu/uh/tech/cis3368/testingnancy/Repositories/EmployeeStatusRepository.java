package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.EmployeeStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface EmployeeStatusRepository extends CrudRepository<EmployeeStatus,Integer>, Repository<EmployeeStatus, Integer>
{

}

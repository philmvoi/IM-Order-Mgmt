package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>, Repository<Employee, Integer>
{

}

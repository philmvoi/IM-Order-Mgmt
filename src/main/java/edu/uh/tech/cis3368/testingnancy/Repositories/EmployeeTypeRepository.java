package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.EmployeeType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface EmployeeTypeRepository extends CrudRepository<EmployeeType, Integer>, Repository<EmployeeType,Integer>
{

}

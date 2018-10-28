package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.SizeStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface SizeStatusRepository extends CrudRepository<SizeStatus, Integer>, Repository<SizeStatus,Integer>
{

}

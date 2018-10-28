package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.FillingStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface FillingStatusRepository extends CrudRepository<FillingStatus, Integer>, Repository<FillingStatus, Integer>
{

}

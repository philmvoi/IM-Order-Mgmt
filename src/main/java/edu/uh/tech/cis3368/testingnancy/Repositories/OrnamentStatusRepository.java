package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.OrnamentStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrnamentStatusRepository extends CrudRepository<OrnamentStatus, Integer>, Repository<OrnamentStatus, Integer>
{

}

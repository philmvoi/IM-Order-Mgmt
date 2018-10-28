package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.FrostingStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface FrostingStatusRepository extends CrudRepository<FrostingStatus, Integer>, Repository<FrostingStatus,Integer>
{

}

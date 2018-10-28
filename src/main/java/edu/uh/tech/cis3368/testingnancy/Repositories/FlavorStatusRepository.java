package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.FlavorStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface FlavorStatusRepository extends CrudRepository<FlavorStatus, Integer>, Repository<FlavorStatus, Integer>
{

}

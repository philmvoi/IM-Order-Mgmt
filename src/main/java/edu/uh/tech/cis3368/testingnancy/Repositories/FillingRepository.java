package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Filling;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface FillingRepository extends CrudRepository<Filling, Integer>, Repository<Filling, Integer>
{

}

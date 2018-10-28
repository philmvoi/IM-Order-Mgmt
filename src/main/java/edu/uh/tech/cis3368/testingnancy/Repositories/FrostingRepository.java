package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Frosting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface FrostingRepository extends CrudRepository<Frosting, Integer>, Repository<Frosting, Integer>
{

}

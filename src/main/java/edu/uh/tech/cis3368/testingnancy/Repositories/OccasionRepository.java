package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Occasion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OccasionRepository extends CrudRepository<Occasion, Integer>, Repository<Occasion, Integer>
{

}

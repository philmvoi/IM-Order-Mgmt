package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Ornament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrnamentRepository extends CrudRepository<Ornament, Integer>, Repository<Ornament, Integer>
{

}

package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.OrnamentSize;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrnamentSizeRepository extends CrudRepository<OrnamentSize, Integer>, Repository<OrnamentSize, Integer>
{

}

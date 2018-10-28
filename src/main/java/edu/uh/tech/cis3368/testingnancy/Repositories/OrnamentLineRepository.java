package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.OrnamentLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrnamentLineRepository extends CrudRepository<OrnamentLine, Integer>, Repository<OrnamentLine, Integer>
{

}

package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.OrnamentColor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrnamentColorRepository extends CrudRepository<OrnamentColor, Integer>, Repository<OrnamentColor, Integer>
{

}

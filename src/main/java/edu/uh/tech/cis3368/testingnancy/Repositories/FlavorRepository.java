package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Flavor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface FlavorRepository extends CrudRepository<Flavor,Integer>, Repository<Flavor, Integer>
{

}

package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.OrderPlacementMethod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrderPlacementMethodRepository extends CrudRepository<OrderPlacementMethod, Integer>, Repository<OrderPlacementMethod,Integer>
{

}

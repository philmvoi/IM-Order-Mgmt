package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.OrderFulfillmentMethod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrderFulfillmentMethodRepository extends CrudRepository<OrderFulfillmentMethod, Integer>, Repository<OrderFulfillmentMethod, Integer>
{

}

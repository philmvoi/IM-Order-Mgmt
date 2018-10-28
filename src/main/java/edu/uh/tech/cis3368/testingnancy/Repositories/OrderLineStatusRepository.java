package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.OrderLineStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrderLineStatusRepository extends CrudRepository<OrderLineStatus, Integer>, Repository<OrderLineStatus, Integer>
{

}

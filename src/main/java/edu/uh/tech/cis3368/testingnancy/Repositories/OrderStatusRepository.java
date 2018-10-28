package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.OrderStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrderStatusRepository extends CrudRepository<OrderStatus,Integer>, Repository<OrderStatus,Integer>
{

}

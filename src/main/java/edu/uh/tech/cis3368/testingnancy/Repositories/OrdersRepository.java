package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrdersRepository extends CrudRepository<Orders,Integer>, Repository<Orders,Integer>
{

}

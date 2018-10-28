package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.CustomerStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CustomerStatusRepository extends CrudRepository<CustomerStatus, Integer>, Repository<CustomerStatus, Integer>
{
    @Query("select c from CustomerStatus c  where c.customerStatusId = ?1")
    CustomerStatus findByIdentity(int num);

}

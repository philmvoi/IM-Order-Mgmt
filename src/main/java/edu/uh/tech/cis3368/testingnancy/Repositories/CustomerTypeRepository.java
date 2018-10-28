package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.CustomerType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface CustomerTypeRepository extends CrudRepository<CustomerType, Integer>, Repository<CustomerType, Integer>
{
    @Query("select c from CustomerType c where c.customerTypeId = ?1")
    CustomerType findByIdentity(int num);

}

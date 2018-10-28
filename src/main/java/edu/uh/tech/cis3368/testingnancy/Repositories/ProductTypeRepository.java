package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ProductTypeRepository extends CrudRepository<ProductType, Integer>, Repository<ProductType, Integer>
{

}

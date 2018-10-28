package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.ProductLayer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ProductLayerRepository extends CrudRepository<ProductLayer, Integer>, Repository<ProductLayer, Integer>
{

}

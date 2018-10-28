package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.ShapeStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ShapeStatusRepository extends CrudRepository<ShapeStatus, Integer>, Repository<ShapeStatus, Integer>
{

}

package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Shape;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ShapeRepository extends CrudRepository<Shape, Integer>, Repository<Shape, Integer>
{

}

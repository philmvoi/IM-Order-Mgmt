package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Size;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface SizeRepository extends CrudRepository<Size, Integer>, Repository<Size, Integer>
{

}

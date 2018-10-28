package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface CountryRepository extends CrudRepository<Country, Integer>, Repository<Country, Integer>
{
    @Query("select c from Country c where c.countryId = ?1")
    Country findByIdentity(int num);

}

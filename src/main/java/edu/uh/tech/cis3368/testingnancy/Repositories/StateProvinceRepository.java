package edu.uh.tech.cis3368.testingnancy.Repositories;

import edu.uh.tech.cis3368.testingnancy.Entities.StateProvince;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface StateProvinceRepository extends CrudRepository<StateProvince, Integer>, Repository<StateProvince, Integer>
{


    @Query("select s from StateProvince s where s.stateProvinceId = ?1")
    StateProvince findByIdentity(int num);

}



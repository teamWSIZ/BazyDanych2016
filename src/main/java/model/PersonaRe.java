package model;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRe extends CrudRepository<Persona, Integer> {
//    @Query("select h from Host h, HostHostGroup hhg " +
//            "where h.hostid =  hhg.hostId and " +
//            "hhg.hostGroupId = ?1")
//    List<Host> findHostsOfGroup(Integer hostGroupId);

    List<Persona> findByMoneyGreaterThanEqual(Integer ile);
    List<Persona> findByNameStartsWith(String prefixxx);
}

package Domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface HostGroupRe extends CrudRepository<HostGroup, Integer>{
    @Query("select h from Host h, HostHostGroup hhg " +
            "where h.hostid =  hhg.hostId and " +
            "hhg.hostGroupId = ?1")
    List<Host> findHostsOfGroup(Integer hostGroupId);
}

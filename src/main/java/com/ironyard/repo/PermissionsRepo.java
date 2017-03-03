package com.ironyard.repo;

import com.ironyard.data.AgentPermissions;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rohanayub on 3/3/17.
 */
public interface PermissionsRepo extends CrudRepository<AgentPermissions,Long> {
}

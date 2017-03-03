package com.ironyard.controller;

import com.ironyard.data.AgentList;
import com.ironyard.data.AgentPermissions;
import com.ironyard.repo.AgentListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rohanayub on 3/3/17.
 */
@RestController
public class RestAgentController {
    @Autowired
    private AgentListRepo agentRepo;

    @RequestMapping(path="/agents/getAllAgents", method = RequestMethod.GET)
    public Iterable<AgentList> retrievePosts(){
        return agentRepo.findAll();
    }

    @RequestMapping(path="/agents/getRealName/{yourID}/{agentID}", method = RequestMethod.GET)
    public String getAgentName(@PathVariable Long yourID, @PathVariable Long agentID)
    {
        Integer accessLevel = null;
        String realAgentName = null;
        AgentList agentRequestingInfo = agentRepo.findOne(yourID);
        AgentList agentInformation = agentRepo.findOne(agentID);
        Integer agentRequestAccess = agentRequestingInfo.getAccessLevel();
        Integer agentInformationAccess = agentInformation.getAccessLevel();



        if(agentRequestAccess >= agentInformationAccess){


//            agentRequestingInfo.getAccessPermission().stream().anyMatch(p -> (p.getKey().equals(AgentPermissions.KEY_PERM_ACCESS_FIVE))&
//              (agentInformation.getAccessPermission().stream().anyMatch(x->(x.getKey().equals(AgentPermissions.KEY_PERM_ACCESS_FIVE)))))
//                (p.getKey().equals(AgentPermissions.KEY_PERM_ACCESS_FIVE))&&(p.getKey().equals(AgentPermissions.KEY_PERM_ACCESS_SIX))&&
//                (p.getKey().equals(AgentPermissions.KEY_PERM_ACCESS_EIGHT))&&(p.getKey().equals(AgentPermissions.KEY_PERM_ACCESS_NINE))&&
//                (p.getKey().equals(AgentPermissions.KEY_PERM_ACCESS_TEN)))){
            accessLevel = agentRequestingInfo.getAccessLevel();
            realAgentName = agentInformation.getRealName();
            return "Access Level: "+accessLevel+" cleared. \nAgent Real Name is: "+realAgentName+".";
    }
            accessLevel = agentRequestingInfo.getAccessLevel();
        Integer accessLevelNeeded = agentInformation.getAccessLevel();
        realAgentName = agentInformation.getCoverName();
        return "Access Denied for clearance level "+accessLevel+". Insuffiecent clearance for Agent: "
                +realAgentName+" with clearance: "+accessLevelNeeded+".";
    }


}

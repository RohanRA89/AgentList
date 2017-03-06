package com.ironyard.controller;

import com.ironyard.data.AgentList;
import com.ironyard.data.AgentPermissions;
import com.ironyard.repo.AgentListRepo;
import com.ironyard.repo.PermissionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by rohanayub on 3/3/17.
 */
@RestController
public class RestAgentController {
    @Autowired
    private AgentListRepo agentRepo;
    @Autowired
    PermissionsRepo agentPermissions;

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

    @RequestMapping(path = "/agents/create/{yourID}", method = RequestMethod.POST)
    public String createAgent(@PathVariable Long yourID, @RequestParam String coverName, @RequestParam Integer accessLevel,
                              @RequestParam String realName) throws Exception{
        AgentList foundAgent = agentRepo.findOne(yourID);
        Integer agentAccessLevel = foundAgent.getAccessLevel();
        String existingAgentName = foundAgent.getCoverName();
        //Iterable<AgentPermissions> addPermissions = foundAgent.getAccessPermission();
        //System.out.println(addPermissions.toString());

        String creation = null;
        List<AgentPermissions> newAgentPermissions = null;

        if(agentAccessLevel>=accessLevel){
        AgentList newAgent = new AgentList();
        newAgent.setCoverName(coverName);
        newAgent.setRealName(realName);
        newAgent.setAccessLevel(accessLevel);
        //List<AgentPermissions> newAgentPermissions = new ArrayList<>();
        //newAgentPermissions=tryToBulkAddPermissions.iterator(addPermissions);
        //agentPermissions.save(newAgent.setAccessPermission((List<AgentPermissions>) addPermissions));
        agentRepo.save(newAgent);

        creation = "Agent "+coverName+" created with Access Level: "+accessLevel+".";
        return creation;}

        creation = "Agent creation unauthorized. The access level is higher than your current access level.\n Agent: "+existingAgentName+
                "\n Agent Access Level: "+agentAccessLevel;
        return creation;

    }


}

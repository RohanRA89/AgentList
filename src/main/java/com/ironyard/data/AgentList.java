package com.ironyard.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

/**
 * Created by rohanayub on 3/3/17.
 */
@Entity
public class AgentList {
    @Id
    @GeneratedValue
    private long id;
    private String coverName;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String realName;
    private Integer accessLevel;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<AgentPermissions> accessPermission;

    public AgentList() {
    }

    public List<AgentPermissions> getAccessPermission() {
        return accessPermission;
    }

    public void setAccessPermission(List<AgentPermissions> accessPermission) {
        this.accessPermission = accessPermission;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoverName() {
        return coverName;
    }

    public void setCoverName(String coverName) {
        this.coverName = coverName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }
}

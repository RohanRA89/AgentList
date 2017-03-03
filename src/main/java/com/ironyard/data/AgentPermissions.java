package com.ironyard.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by rohanayub on 3/3/17.
 */
@Entity
public class AgentPermissions {
    public static final String KEY_PERM_ACCESS_FOUR = "PERM_ACCESS_FOUR";
    public static final String KEY_PERM_ACCESS_FIVE = "PERM_ACCESS_FIVE";
    public static final String KEY_PERM_ACCESS_SIX = "PERM_ACCESS_SIX";
    public static final String KEY_PERM_ACCESS_EIGHT = "PERM_ACCESS_EIGHT";
    public static final String KEY_PERM_ACCESS_NINE = "PERM_ACCESS_NINE";
    public static final String KEY_PERM_ACCESS_TEN = "PERM_ACCESS_TEN";


    @Id @GeneratedValue
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private long id;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

    private String key;
    private String permissionName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}

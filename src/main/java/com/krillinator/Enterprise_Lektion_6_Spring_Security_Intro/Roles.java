package com.krillinator.Enterprise_Lektion_6_Spring_Security_Intro;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Roles {

    GUEST("GET"),
    USER("GET_POST"),
    ADMIN("GET_POST_PUT_DELETE");

    private final String permissions;

    Roles(String permissions) {
        this.permissions = permissions;
    }

    public String getPermissions() {
        return permissions;
    }

    // TODO - Generates GrantedSimpleAuthorities as an Array(list)
    public List<GrantedAuthority> splitPermissions() {
        String [] permissionsArray = permissions.split("_");

        return Arrays.stream(permissionsArray)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}

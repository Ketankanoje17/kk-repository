package auth;


import com.mahindraFinance.common.autofin.model.user.Permission;
import com.mahindraFinance.common.autofin.model.user.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LMSUserDetails implements UserDetails, Serializable {
    private final com.mahindraFinance.common.autofin.model.user.UserDetails userDetails;

    public LMSUserDetails(com.mahindraFinance.common.autofin.model.user.UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        Set<Role> roles = userDetails.getRoles();
        Set<Permission> permissions = userDetails.getPermissions();
        if (roles != null) {
            authorities = roles.stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName())).collect(Collectors.toList());
        }

        if (permissions != null) {
            permissions.stream().map(permission -> new SimpleGrantedAuthority(permission.getName())).forEach(authorities::add);
        }

        return authorities;
    }

    @Override
    public String getPassword() {
        return userDetails.getUser().getEmpCode();
    }

    @Override
    public String getUsername() {
        return userDetails.getUser().getEmpCode();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String toString() {
        return "UserId: %s".formatted(userDetails.getUser().getEmpCode());
    }

    public boolean hasBranchAccess(String branchCode) {
        return userDetails.getAllowedBranches().contains(branchCode);
    }

    public boolean hasRole(String role) {
        List<String> roles = userDetails.getRoles().stream().map(Role::getName).toList();
        return roles.contains(role);
    }

    public boolean hasPermission(String permission) {
        List<String> permissions = userDetails.getPermissions().stream().map(Permission::getName).toList();
        return permissions.contains(permission);
    }
}

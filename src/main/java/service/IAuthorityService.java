package service;

import entity.Authority;

public interface IAuthorityService {
    Authority getAuthority(Authority authority);

    Authority addAuthority(Authority authority);

    Authority getByRole(String role);

    Authority getAllRoles();

}

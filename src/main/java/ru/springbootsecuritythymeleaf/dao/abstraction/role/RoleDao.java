package ru.springbootsecuritythymeleaf.dao.abstraction.role;


import ru.springbootsecuritythymeleaf.dao.GenericDao;
import ru.springbootsecuritythymeleaf.model.Role;

/**
 * Created by Skrezhet on 09.04.2017.
 */
public interface RoleDao extends GenericDao<Long, Role> {
    Role getRoleByRoleName(String roleName);
}

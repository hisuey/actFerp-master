package cn.hups.common.flowable;

import org.flowable.idm.api.User;
import org.flowable.idm.engine.impl.persistence.entity.UserEntityImpl;
import org.flowable.ui.common.model.UserRepresentation;
import org.flowable.ui.common.security.SecurityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * modeler设计器权限
 */
@RestController
@RequestMapping("/hupresourceapp")
public class HupRemoteAccountResource {

    /**
     * GET /rest/account -> get the current user.
     */
    @RequestMapping(value = "/rest/account", method = RequestMethod.GET, produces = "application/json")
    public UserRepresentation getAccount() {
        // 因为禁用了Security框架,这里需要手动初始一个User信息
        User user = new UserEntityImpl();
        user.setId("superadmin");
        SecurityUtils.assumeUser(user);

        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setId("superadmin");
        userRepresentation.setFirstName("superadmin");
        List<String> privileges = new ArrayList<>();
        privileges.add("flowable-idm");
        privileges.add("flowable-admin");
        privileges.add("flowable-modeler");
        privileges.add("flowable-task");
        privileges.add("flowable-rest");
        userRepresentation.setPrivileges(privileges);
        return userRepresentation;
    }

}

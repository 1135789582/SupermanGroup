package com.szxs.action;


import com.opensymphony.xwork2.ActionSupport;
import com.szxs.entity.SmbmsUser;
import com.szxs.service.SmbmsUserService;
import com.szxs.service.impl.SmbmsUserServiceImpl;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class SmbmsUserAction extends ActionSupport {

    private SmbmsUser smbmsUser;
    private List<SmbmsUser> userList;

    public List<SmbmsUser> getUserList() {
        return userList;
    }

    public void setUserList(List<SmbmsUser> userList) {
        this.userList = userList;
    }

    SmbmsUserService smbmsUserService = new SmbmsUserServiceImpl();


    public SmbmsUser getSmbmsUser() {
        return smbmsUser;
    }

    public void setSmbmsUser(SmbmsUser smbmsUser) {
        this.smbmsUser = smbmsUser;
    }

    public String login(){
        System.out.println(smbmsUser.getUserName()+smbmsUser.getUserPassword());

        SmbmsUser user = smbmsUserService.login(smbmsUser.getUserCode(), smbmsUser.getUserPassword());
        if(user != null){
            ServletActionContext.getRequest().getSession().setAttribute("user",user);
            userList = smbmsUserService.queryUser();
            return SUCCESS;
        }else{
            System.out.println("啊实打实的");
            return null;
        }

     }

}

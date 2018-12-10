/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Beans;


public class User {
    private String DoUser;
    private String TdoUser;
    private String NoUser;
    private String ApUser;
    private String EsUser;
    private String EmUser;
    private String RolUser;
    private String EspUser;

    public User(String doUser, String tdoUser, String noUser, String apUser, String esUser, String emUser, String rolUser, String espUser) {
        this.DoUser = doUser;
        this.TdoUser = tdoUser;
        this.NoUser = noUser;
        this.ApUser = apUser;
        this.EsUser = esUser;
        this.EmUser = emUser;
        this.RolUser = rolUser;
        this.EspUser = espUser;
    }

    public String getDoUser() {
        return DoUser;
    }

    public void setDoUser(String DoUser) {
        this.DoUser = DoUser;
    }

    public String getTdoUser() {
        return TdoUser;
    }

    public void setTdoUser(String TdoUser) {
        this.TdoUser = TdoUser;
    }

    public String getNoUser() {
        return NoUser;
    }

    public void setNoUser(String NoUser) {
        this.NoUser = NoUser;
    }

    public String getApUser() {
        return ApUser;
    }

    public void setApUser(String ApUser) {
        this.ApUser = ApUser;
    }

    public String getEsUser() {
        return EsUser;
    }

    public void setEsUser(String EsUser) {
        this.EsUser = EsUser;
    }

    public String getEmUser() {
        return EmUser;
    }

    public void setEmUser(String EmUser) {
        this.EmUser = EmUser;
    }

    public String getRolUser() {
        return RolUser;
    }

    public void setRolUser(String RolUser) {
        this.RolUser = RolUser;
    }

    public String getEspUser() {
        return EspUser;
    }

    public void setEspUser(String EspUser) {
        this.EspUser = EspUser;
    }

    
    
}

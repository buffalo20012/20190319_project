package kr.hs.dgsw.web_project;

public class User {

    public User(){
    }

    public User(String pid,String name,String email){
        this.pid = pid;
        this.name = name;
        this.email = email;
    }

    private String pid;
    private String name;
    private String email;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

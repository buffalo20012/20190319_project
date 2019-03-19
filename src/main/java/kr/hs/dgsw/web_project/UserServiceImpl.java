package kr.hs.dgsw.web_project;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    List<User> userList;

    public UserServiceImpl(){
        userList = new ArrayList<>();
        //  User user = new User("user1","user111@dgsw");
        //  user.setName("user1");
        //  user.setEmail("user111@dgsw");
        userList.add(new User("1","user1","user111@dgsw"));
        userList.add(new User("2","user2","user222@dgsw"));
        userList.add(new User("3","user3","user333@dgsw"));
    }

    @Override
    public List<User> list() {
        return this.userList;
    }

    @Override
    public User view(String pid) {
        User found = null;
        for(int i=0;i<this.userList.size();i++){
            found = this.userList.get(i);
            if(found.getPid().equals(pid))
                break;
            found = null;
        }
        return found;
    }

    @Override
    public boolean add(User user) {
        if(this.view(user.getPid()) == null){
            return this.userList.add(user);
        }else{
            return false;
        }
    }

    @Override
    public User update(User user) {
        User found = this.view(user.getPid());
        if(found != null){
            found.setEmail(user.getEmail());
        }
        return found;
    }

    @Override
    public boolean delete(String pid) {
        User found = this.view(pid);
        return this.userList.remove(found);
    }
}

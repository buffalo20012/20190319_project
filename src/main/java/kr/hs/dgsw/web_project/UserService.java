package kr.hs.dgsw.web_project;

import java.util.List;

public interface UserService {
    List<User> list();
    User view(String pid);
    boolean add(User user);
    User update(User user);
    boolean delete(String pid);
}

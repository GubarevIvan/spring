package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findOne (long id);
    public void save(User user);
    public void update(Long id, User updateUser);
    public void delete(Long id);
}

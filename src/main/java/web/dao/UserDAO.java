package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserDAO {
    private static int USER_COUNT;
    private List<User> users = new ArrayList<>();

    {
        users.add(new User(++USER_COUNT, "Tom", "Vaculich", 45));
        users.add(new User(++USER_COUNT, "Bob", "Brama", 32));
        users.add(new User(++USER_COUNT, "Mike", "Gorelov", 23));
        users.add(new User(++USER_COUNT, "Katy", "Abramova", 43));
        users.add(new User(++USER_COUNT, "Max", "Andreiv", 24));
    }

    public List<User> index() {
        return users;
    }
    public Optional<User> show (int id) {
        return users.stream().filter(user -> user.getId() == id).findAny();
    }
    public void save(User user) {
        user.setId(++USER_COUNT);
        users.add(user);
    }
}

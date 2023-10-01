package hiber.service;

import hiber.model.*;
import java.util.List;

public interface UserService {
    void add(User user);
    void addUserCar(User user, Car car);
    List<User> listUsers();

    User getCarToUser(String model, int series);
}
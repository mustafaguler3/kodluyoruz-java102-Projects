package services;

import entities.User;

public interface UserService {
    void add(User user);
    void delete(int id);
}

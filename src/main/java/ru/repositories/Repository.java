package ru.repositories;
import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    void save(T var);
    void update(T var, Integer id);
    T findById(Integer id);
    Integer getSize();
}

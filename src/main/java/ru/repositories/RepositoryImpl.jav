package ru.repositories;
import java.util.List;
public class RepositoryImpl<T> implements Repository<
    private List<T> repository;
    public RepositoryImpl(List<T> 
        this.
    }
    @Override
    public List<T> 
        return repository;
    }
    @Override
    public void save(T 
        repository.add(
    }
    @Override
    public void update(T var, Integer id) {
        repository.set(id, var);
    }
    @Override
    public T findById(Integer id) {
        return repository.get(id);
    }
    @Override
    public Integer getSize() {
        return repository.size();
    }
}

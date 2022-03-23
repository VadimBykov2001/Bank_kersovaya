package ru.repositories;
import ru.models.Consumer;
import java.util.ArrayList;
import java.util.List;

public class ConsumerRepository extends RepositoryImpl<Consumer> {
    private static ConsumerRepository instance;
    public static ConsumerRepository getInstance() {
        if (instance == null) {
            instance = new ConsumerRepository();
        }
        return instance;
    }
    public ConsumerRepository() {
        super(new ArrayList<>());
        save(new Consumer(getSize(), "Анастасия", 10000.0));
        save(new Consumer(getSize(), "Григорий", 100.0));
    }
    public Consumer findByName(String name) throws Exception {
        List<Consumer> allConsumer = findAll();
        for (Consumer consumer : allConsumer) {
            if (consumer.getName().equals(name))
                return consumer;
        }
        throw new Exception("Покупателя с таким именем не найдено.");
    }
}

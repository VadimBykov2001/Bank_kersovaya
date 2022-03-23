package ru.repositories;
import ru.models.Order;
import java.util.ArrayList;

public class OrderRepository extends RepositoryImpl<Order> {
    private static OrderRepository instance;
    public static OrderRepository getInstance(){
        if(instance == null){
            instance = new OrderRepository();
        }
        return instance;
    }
    public OrderRepository() {
        super(new ArrayList<>());
    }
}

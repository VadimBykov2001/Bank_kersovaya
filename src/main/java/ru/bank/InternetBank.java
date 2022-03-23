package ru.bank;
import ru.models.Order;
import ru.models.Product;
import java.util.List;
public interface InternetBank {
    Order createOrder(Integer productId, String customer) throws Exception;
    Order payment(Integer orderId) throws Exception;
    Order returnProduct(Integer orderId) throws Exception;
    Order modifOrder(Integer orderId, Integer productId) throws Exception;
    List<Product> catalog();
}

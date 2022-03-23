package ru.bank;
import ru.enums.OrderDescriptionEnum;
import ru.models.Consumer;
import ru.models.Order;
import ru.models.Product;
import ru.repositories.ConsumerRepository;
import ru.repositories.OrderRepository;
import ru.repositories.ProductRepository;
import java.time.LocalDate;
import java.util.List;

public class MyBank implements InternetBank {
    OrderRepository orderRepository = OrderRepository.getInstance();
    ProductRepository productRepository = ProductRepository.getInstance();
    ConsumerRepository consumerRepository = ConsumerRepository.getInstance();
    @Override
    public Order createOrder(Integer productId, String ConsumerName) throws Exception {
        Consumer consumer = consumerRepository.findByName(consumerName);
        try {
            Product product = productRepository.findById(productId);
            Order order =
                    new Order(orderRepository.getSize(), consumer, product, OrderDescriptionEnum.CREATE.getValue());
            orderRepository.save(order);
            return order;
        } catch (Exception e) {
            throw new Exception("Банковские продукты по данному ip не числятся");
        }
    }
    @Override
    public Order payment(Integer orderId) throws Exception {
        try {
            Order order = orderRepository.findById(orderId);
            order.setDescription(OrderDescriptionEnum.BUY.getValue());
            Consumer consumer = consumerRepository.findById(order.getConsumer().getId());
            Product product = productRepository.findById(order.getProduct().getId());
            if (product.getCount() > 0) {
                product.setCount(product.getCount() - 1);
            } else {
                throw new Exception("На данный момент невозможно воспользоваться данной услугой");
            }
            if (order.getProduct().getPrice() > consumer.getMoney()) {
                throw new Exception("На вашем счете недосаточного денег");
            }
            productRepository.update(product, product.getId());
            order.setPayment(order.getProduct().getPrice());
            consumer.setMoney(consumer.getMoney() - order.getProduct().getPrice());
            consumerRepository.update(consumer, consumer.getId());
            return order;
        } catch (IndexOutOfBoundsException e) {
            throw new Exception("Заказ с таким id не найден");
        }
    }
    @Override
    public Order returnProduct(Integer orderId) throws Exception {
        try {
            Order order = orderRepository.findById(orderId);
            order.setDescription(OrderDescriptionEnum.RETURN.getValue());
            orderRepository.update(order, orderId);
            return order;
        } catch (Exception e) {
            throw new Exception("Заказа с таким id не найдено");
        }
    }
    @Override
    public Order modifOrder(Integer orderId, Integer newProductId) throws Exception {
        try {
            Product newProduct = productRepository.findById(newProductId);
            Order order = orderRepository.findById(orderId);
            order.setModified(LocalDate.now());
            order.setProduct(newProduct);
            order.setDescription(OrderDescriptionEnum.MODIF.getValue());
            return order;
        } catch (Exception e) {
            throw new Exception("По данному id заказа или банковский продукта не найдено");
        }
    }
    @Override
    public List<Product> catalog() {
        return productRepository.findAll();
    }
}

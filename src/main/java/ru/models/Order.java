package ru.models;
import java.time.LocalDate;
public class Order extends Model {
    private Consumer consumer;
    private LocalDate created;
    private LocalDate modified;
    private Product product;
    private String description;
    private double payment;
    public double getPayment() {
        return payment;
    }
    public void setPayment(double payment) {
        this.payment = payment;
    }
    public Order(Integer id, Consumer consumer, Product product, String description) {
        super(id);
        this.consumer = consumer;
        this.created = LocalDate.now();
        this.modified = LocalDate.now();
        this.product = product;
        this.description = description;
    }
    public Consumer getConsumer() {
        return consumer;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }
    public LocalDate getModified() {
        return modified;
    }
    public void setModified(LocalDate modified) {
        this.modified = modified;
    }
    public LocalDate getCreated() {
        return created;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return super.toString() + "; consumer: " + consumer.name + "; created: " + created + "; product: {" + product +
               "}; description: " + description + "\n";
    }
}

package ru.enums;

public enum OrderDescriptionEnum {
    CREATE("Выбор продукта"), RETURN("Отказ от продукта"), MODIF("Изменение заказа"), BUY("Приобретение продукта");
    private final String value;
    OrderDescriptionEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

package ru.enums;

public enum ProductEnum{
    Credit("Кредит"), CreditCard("Кредитная карта"), Investment("Инвестиции"), Insurance("Страхование"), Mortgage("Ипотека");
    private final String value;
    ProductEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

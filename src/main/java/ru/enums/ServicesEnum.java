package ru.enums;
public enum ServicesEnum{
    Credit("Кредит"), CreditCard("Кредитная карта"), Investment("Инвестиции"), Insurance("Страхование"), Mortgage("Ипотека");
    private final String value;
    ServicesEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

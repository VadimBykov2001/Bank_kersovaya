package ru.enums;

public enum BankProductsEnum{
    Credit("Кредит"), CreditCard("Кредитная карта"), Investment("Инвестиции"), Insurance("Страхование"), Mortgage("Ипотека");
    private final String value;
    BankProductsEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

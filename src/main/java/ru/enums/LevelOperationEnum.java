package ru.enums;
public enum LevelOperationEnum{
    Medium("Операция, представленая для граждан с низкими доходами"), Standart("Стандартная операция для доходоспособных граждан"), Gold("Операция, при которой проходит огромный денежный оборот");
    private final String value;
    LevelOperationEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

package ru.models;

public class BankProduct extends Product {
    private String Services;
    private String LevelOperation;

    public BankProduct (Integer id, String Services, String LevelOperation, double price, int count) {
        super(id, price, count);
        this.Services = Services;
        this.LevelOperation = LevelOperation;
    }
    public String getServices() {
        return Services;
    }
    public void setServices(String Services) {
        this.Services = Services;
    }
    public String getLevelOperation() {
        return LevelOperation;
    }
    public void setLevelOperation(String LevelOperation) {
        this.LevelOperation = LevelOperation;
    }

    @Override
    public String toString() {
        return super.toString() + "; Services : " + Services + "; LevelOperation: " + LevelOperation + "\n";
    }
}

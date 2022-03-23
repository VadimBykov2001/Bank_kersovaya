package ru.models;

public class Bank extends Product {
    private String BankProducts;
    private String LevelOperation;

    public Smartphone(Integer id, String BankProducts, String LevelOperation, double price, int count) {
        super(id, price, count);
        this.BankProducts = BankProducts;
        this.LevelOperation = LevelOperation;
    }
    public String getBankProducts() {
        return BankProducts;
    }
    public void setBankProducts(String BankProducts) {
        this.BankProducts = BankProducts;
    }
    public String getLevelOperation() {
        return LevelOperation;
    }
    public void setLevelOperation(String LevelOperation) {
        this.LevelOperation = LevelOperation;
    }

    @Override
    public String toString() {
        return super.toString() + "; BankProducts : " + BankProducts + "; LevelOperation: " + LevelOperation + "\n";
    }
}

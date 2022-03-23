package ru.repositories;
import ru.enums.Services;
import ru.enums.LevelOperation;
import ru.models.BankProduct;
import ru.models.Product;
import java.util.ArrayList;

public class ProductRepository extends RepositoryImpl<Product> {
    private static ProductRepository instance;
    public static ProductRepository getInstance(){
        if(instance == null){
            instance = new ProductRepository();
        }
        return instance;
    }
    private ProductRepository() {
        super(new ArrayList<>());
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.Credit.getValue(),
                        LevelOperationEnum.Medium.getValue(),
                        40000,
                        1));
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.Credit.getValue(),
                        LevelOperationEnum.Standart.getValue(),
                        300000,
                        2));
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.Credit.getValue(),
                        LevelOperationEnum.Gold.getValue(),
                        2000000,
                        3));
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.CreditCard.getValue(),
                        LevelOperationEnum.Standart.getValue(),
                        2000,
                        6));
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.CreditCard.getValue(),
                        LevelOperationEnum.Gold.getValue(),
                        15000,
                        7));
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.Investment.getValue(),
                        LevelOperationEnum.Standart.getValue(),
                        1500,
                        9));
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.Investment.getValue(),
                        LevelOperationEnum.Gold.getValue(),
                        30000,
                        10));
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.Insurance.getValue(),
                        LevelOperationEnum.Standart.getValue(),
                        50000,
                        12));
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.Insurance.getValue(),
                        LevelOperationEnum.Gold.getValue(),
                        200000,
                        13));
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.Mortgage.getValue(),
                        LevelOperationEnum.Medium.getValue(),
                        1500000,
                        14));
        save(
                new BankProduct(
                        getSize(),
                        ServicesEnum.Mortgage.getValue(),
                        LevelOperationEnum.Standart.getValue(),
                        5000000,
                        15));
    }
}

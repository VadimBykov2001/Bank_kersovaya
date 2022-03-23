package ru.models;

public class Model {
    private Integer id;
    public Integer getId() {
        return id;
    }
    public Model(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "id: " + id;
    }
}

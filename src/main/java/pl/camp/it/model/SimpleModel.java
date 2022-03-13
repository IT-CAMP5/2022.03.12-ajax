package pl.camp.it.model;

public class SimpleModel {
    private String name;
    private String surname;
    private boolean cos;

    public SimpleModel(String name, String surname, boolean cos) {
        this.name = name;
        this.surname = surname;
        this.cos = cos;
    }

    public SimpleModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isCos() {
        return cos;
    }

    public void setCos(boolean cos) {
        this.cos = cos;
    }
}

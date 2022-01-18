package Model;

public class Car {

    private String Auto;
    private String Model;
    private int yearOfProductio;

    public Car (String Auto, String Model, int yearOfProductio) {
        this.Auto = Auto;
        this.Model = Model;
        this.yearOfProductio = yearOfProductio;
    }

    public String getAuto() {
        return Auto;
    }

    public String getModel() {
        return Model;
    }

    public int getYearOfProductio() {
        return yearOfProductio;
    }

    public void setAuto(String auto) {
        Auto = auto;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setYearOfProductio(int yearOfProdutio) {
        this.yearOfProductio = yearOfProdutio;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Auto='" + Auto + '\'' +
                ", Model='" + Model + '\'' +
                ", yearOfProdutio=" + yearOfProductio +
                '}';
    }
}

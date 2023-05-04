package web.model;

public class Car {

    private long id;
    private String model;
    private long mileage;

    public Car(long id, String model, long mileage) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

}

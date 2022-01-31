package Model;

public class Car {
    private double engine;
    private String developer;
    private String colour;

    public Car(double engine, String developer, String colour) {
        this.engine = engine;
        this.developer = developer;
        this.colour = colour;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", developer='" + developer + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}


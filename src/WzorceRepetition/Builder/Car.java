package WzorceRepetition.Builder;

public class Car {
    private String model;
    private Integer speed;
    private Integer gears;
    private String country;

    public static class Builder{
        private String model = null;
        private Integer speed = 0;
        private Integer gears = 0;
        private String country = null;

        public Builder model(String name){
            this.model = model;
            return this;
        }

        public Builder speed(Integer speed){
            this.speed = speed;
            return this;
        }

        public Builder gears(Integer gears){
            this.gears = gears;
            return this;
        }

        public Builder country(String country){
            this.country = country;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    public Car(Builder builder) {
        this.model = builder.model;
        this.speed = builder.speed;
        this.gears = builder.gears;
        this.country = builder.country;
    }

    public String getModel() {
        return model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGears() {
        return gears;
    }

    public String getCountry() {
        return country;
    }
}

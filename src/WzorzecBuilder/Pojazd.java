package WzorzecBuilder;

public class Pojazd {
    private String name;
    private Integer year;
    private Integer speed;
    private Integer doors;
    private String country;

    public static class Builder{
        private String name = null;
        private Integer year = 0;
        private Integer speed = 0;
        private Integer doors = 0;
        private String country = null;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder year(Integer year){
            this.year = year;
            return this;
        }

        public Builder speed(Integer speed){
            this.speed = speed;
            return this;
        }

        public Builder doors(Integer doors){
            this.doors = doors;
            return this;
        }

        public Builder country(String country){
            this.country = country;
            return this;
        }

        public Pojazd build(){
            return new Pojazd(this);
        }
    }

    Pojazd(Builder builder){
        this.name = builder.name;
        this.year = builder.year;
        this.speed = builder.speed;
        this.doors = builder.doors;
        this.country = builder.country;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getDoors() {
        return doors;
    }

    public String getCountry() {
        return country;
    }
}

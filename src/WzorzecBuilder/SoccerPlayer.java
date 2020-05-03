package WzorzecBuilder;

public class SoccerPlayer {
    private String name;
    private Integer height;
    private Integer weight;
    private String team;

    public static class Builder{
        private String name = null;
        private Integer height = 0;
        private Integer weight = 0;
        private String team = null;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder height(Integer height){
            this.height = height;
            return this;
        }

        public Builder weight(Integer height){
            this.weight = weight;
            return this;
        }

        public Builder team(String team){
            this.team = team;
            return this;
        }

        public SoccerPlayer build(){
            return new SoccerPlayer(this);
        }
    }

    private SoccerPlayer(Builder builder){
        this.name = builder.name;
        this.height = builder.height;
        this.weight = builder.weight;
        this.team = builder.team;
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getTeam() {
        return team;
    }
}

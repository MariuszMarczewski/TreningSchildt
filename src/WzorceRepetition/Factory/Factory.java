package WzorceRepetition.Factory;

public class Factory {
    public Scenario produce(WeekDays type){
        if(type.equals(WeekDays.MONDAY)) {
            return new Monday();
        } else {
            return new Friday();
        }
    }
}

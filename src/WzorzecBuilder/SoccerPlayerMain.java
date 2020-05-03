package WzorzecBuilder;

public class SoccerPlayerMain {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer.Builder()
                .name("pele")
                .team("sao paulo")
                .build();

        System.out.println(soccerPlayer.getName());
        System.out.println(soccerPlayer.getHeight());
        System.out.println(soccerPlayer.getWeight());
        System.out.println(soccerPlayer.getTeam());
    }
}

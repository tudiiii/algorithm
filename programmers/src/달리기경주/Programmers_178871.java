package 달리기경주;

import java.util.HashMap;
import java.util.Map;

public class Programmers_178871 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer > playersMap = new HashMap<>();

        int idx = 0;
        for (String player : players) {
            playersMap.put(player, idx++);
        }

        for (String player : callings) {
            int rank = playersMap.get(player);

            String beforePlayer = players[rank - 1];

            players[rank - 1] = player;
            players[rank] = beforePlayer;

            playersMap.put(player, rank - 1);
            playersMap.put(beforePlayer, rank);
        }

        return players;
    }
}

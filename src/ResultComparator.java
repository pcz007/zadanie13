import java.util.Comparator;

public class ResultComparator implements Comparator<Player> {

    public int compare(Player p1, Player p2) {
        return Integer.compare(p1.getResult(), p2.getResult());
    }


}

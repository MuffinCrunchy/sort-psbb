package Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PSBB {

    public static int psbb(List<Integer> member, int family) {
        if (member.size() < family) {
            return -1;
        } else {
            member.sort(Collections.reverseOrder());
            List<Integer> seats = new ArrayList<>();
            while (!member.isEmpty()) {
                seats.add(member.get(0));
                member.remove(0);
                for (int i = 0; i < member.size(); i++) {
                    if (seats.get(seats.size() - 1) + member.get(i) <= 4) {
                        seats.set(seats.size() - 1, seats.get(seats.size() - 1) + member.get(i));
                        member.set(i, -1);
                    }
                }
                member.removeIf(num -> num.equals(-1));
            }
            return seats.size();
        }
    }
}

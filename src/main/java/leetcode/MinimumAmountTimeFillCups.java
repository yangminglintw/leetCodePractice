package leetcode;

public class MinimumAmountTimeFillCups {
    public int fillCups(int[] amount) {

        int count = 0;

        if (amount[0] >= amount[1] && amount[0] >= amount[2]) {
            if (amount[1] + amount[2] > amount[0]) {
                int more = amount[1] + amount[2] - amount[0];
                if (more % 2 == 0) {
                    return amount[0] + (amount[1] + amount[2] - amount[0]) / 2;
                } else {
                    return amount[0] + (amount[1] + amount[2] - amount[0]) / 2 + 1;
                }
            } else {
                return amount[0];
            }
        }

        if (amount[1] >= amount[0] && amount[1] >= amount[2]) {
            if (amount[0] + amount[2] > amount[1]) {
                int more = amount[0] + amount[2] - amount[1];
                if (more % 2 == 0) {
                    return amount[1] + (amount[0] + amount[2] - amount[1]) / 2;
                } else {
                    return amount[1] + (amount[0] + amount[2] - amount[1]) / 2 + 1;
                }
            } else {
                return amount[1];
            }
        }

        if (amount[2] >= amount[0] && amount[2] >= amount[1]) {
            if (amount[1] + amount[2] > amount[2]) {
                int more = amount[1] + amount[2] - amount[2];
                if (more % 2 == 0) {
                    return amount[2] + (amount[1] + amount[2] - amount[2]) / 2;
                } else {
                    return amount[2] + (amount[1] + amount[2] - amount[2]) / 2 + 1;
                }
            } else {
                return amount[2];
            }
        }

        return count;
    }
}

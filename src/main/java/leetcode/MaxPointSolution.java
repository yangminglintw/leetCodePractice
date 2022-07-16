package leetcode;

// leetcode
// 1423. Maximum Points You Can Obtain from Cards
public class MaxPointSolution {

    public int maxScore(int[] cardPoints, int k) {

        return calculateSum(cardPoints, k);
    }

    public int calculateSum(int[] cardPoints, int count) {

        int sum = 0;
        int head = 0;
        int tail = cardPoints.length - 1;

        for (int i = 0; i < count; i++) {
            if (cardPoints[head] > cardPoints[tail]) {
                sum += cardPoints[head];
                head += 1;
            } else {
                sum += cardPoints[tail];
                tail -= 1;
            }
            if (head == tail) break;
        }

        return sum;
    }
}

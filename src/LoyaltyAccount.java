public class LoyaltyAccount<T> {
    private T userData;
    private int points;

    public LoyaltyAccount(T userData) {
        this.userData = userData;
        this.points = 0;
    }

    public void addPoints(int pts) {
        points += pts;
    }

    public int getPoints() {
        return points;
    }

    public T getUserData() {
        return userData;
    }

    public void setUserData(T userData) {
        this.userData = userData;
    }
}

/**
 * Represents a generic loyalty account that holds user-specific data
 * and keeps track of loyalty points earned.
 *
 * @param <T> the type of user data (e.g., String, custom User class, etc.)
 */
public class LoyaltyAccount<T> {

    private T userData;
    private int points;

    /**
     * Constructs a new LoyaltyAccount with the given user data.
     * Points are initialized to zero.
     *
     * @param userData the user-specific data to associate with this account
     */
    public LoyaltyAccount(T userData) {
        this.userData = userData;
        this.points = 0;
    }

    /**
     * Adds the specified number of points to the loyalty account.
     *
     * @param pts the number of points to add
     */
    public void addPoints(int pts) {
        points += pts;
    }

    /**
     * Returns the current number of loyalty points.
     *
     * @return the current points balance
     */
    public int getPoints() {
        return points;
    }

    /**
     * Returns the user data associated with this account.
     *
     * @return the user data of type T
     */
    public T getUserData() {
        return userData;
    }

    /**
     * Sets or updates the user data associated with this account.
     *
     * @param userData the new user data
     */
    public void setUserData(T userData) {
        this.userData = userData;
    }
}



public class Player implements Comparable<Player> {

    private String firstName;
    private String lastName;
    private int result;

    public Player(String firstName, String lastName, int result) {
        setFirstName(firstName);
        setLastName(lastName);
        this.result = result;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", result=" + result +
                '}';
    }
    //naprawić comparator
    @Override
    public int compareTo(Player p) {
        if (this.firstName.compareTo(p.firstName) == 1) {
            return 1;
        } else if (this.firstName.compareTo(p.firstName) == 0) {
            return 0;
        } else if (this.firstName.compareTo(p.firstName) == -1) {
            return -1;
        }
//        if (this.lastName.compareTo(p.lastName) == 1) {
//            return 1;
//        } else if (this.lastName.compareTo(p.lastName) == 0) {
//            return 0;
//        } else if (this.lastName.compareTo(p.lastName) == -1) {
//            return -1;
//        }
        return 0;
    }
}
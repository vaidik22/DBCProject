/*
 * Author Name: Vaidik Nigam
 * IDE: Intellij IDEA Community Edition
 * Date: 03-02-2022
 */

package Model;

import java.util.Objects;

public class Guest extends User {
    private final String[] food;

    public Guest(String userName, String password, int menu) {
        super(userName, password);
        this.food = new String[menu];
    }

    public void addFoodToCart() {
        this.food[0] = "Avocado";
        this.food[1] = "Sandwich";
        this.food[2] = "Baked Potato Soup";
        this.food[3] = "Pudding";
        this.food[4] = "pizza";
    }

    public String[] getFood() {
        return food.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + getUserName() + '\'' +
                ", password='" + getPassword();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getUserName(), user.getUserName()) && Objects.equals(getPassword(), user.getPassword());
    }
}
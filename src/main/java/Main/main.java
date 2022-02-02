/*
 * Author Name: Vaidik Nigam
 * IDE: Intellij IDEA Community Edition
 * Date: 03-02-2022
 */

package Main;

import Model.Guest;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Guest guest = new Guest("Vaidik22", "myworldpower", 5);
        guest.addFoodToCart();
        JOptionPane.showMessageDialog(
                null,
                guest,
                "Guest Details",
                JOptionPane.INFORMATION_MESSAGE);


    }
}

/*
Author - Puneet Soni
 */

package Leetcode;

public class DefangingIPAddress {

    public String defangIpAdress(String address) {

        // Using StringBuilder class
        StringBuilder s = new StringBuilder();

        for (char c : address.toCharArray()) {
            // If char c finds '.' append with square brackets
            if (c == '.') {
                s.append("[.]");
            } else {
                s.append(c);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {

        DefangingIPAddress dip = new DefangingIPAddress();
        String address = "111.222.333.444";

        System.out.println("------- Defanging an IP Address-----------\n");
        System.out.println("IP Address before defanging : " + address);
        System.out.println("\nIP Address after defanging : " + dip.defangIpAdress(address));
    }
}

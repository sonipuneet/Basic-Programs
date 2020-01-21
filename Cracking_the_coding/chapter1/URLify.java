package chapter1;

public class URLify {

    void replaceSpaces(String s1, int string_length) {
        char[] ch1 = s1.toCharArray();

        // To count the spaces in a given string
        int space_count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (ch1[i] == ' ') {
                space_count++;
            }

            int new_length = string_length + space_count * 2;


        }

    }

    public static void main(String[] args) {

        String s1 = "This is a test";

        int string_length = s1.length();

        char[] c1 = s1.toCharArray();

        for (int i = 0; i < s1.length(); i++) {

            int count_space = 0;

            //if (c1[i] == " ") {

            //}

        }

        System.out.println("Initial String output:" + s1);

        System.out.println("Final String output:" + s1);

    }

}

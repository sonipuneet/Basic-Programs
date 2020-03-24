package Leetcode;

public class MaximumNumber69 {

    public int maximumNumber69(int num) {

        char[] ch = String.valueOf(num).toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '6') {
                ch[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(ch));
    }


    public static void main(String[] args) {
        int num = 6699;
        MaximumNumber69 mn = new MaximumNumber69();

        System.out.println("" + "" + mn.maximumNumber69(num));
    }
}

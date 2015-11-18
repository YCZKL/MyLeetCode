public class Solution {

    public String addBinary(String a, String b) {

        if (a == null || b == null) 

            return null;

        if (a.equals("")) 

            return b;

        if (b.equals("")) 

            return a;

        int lenA = a.length();

        int lenB = b.length();

        int i = lenA - 1;

        int j = lenB - 1;

        boolean flag = false;

        StringBuilder builder = new StringBuilder();

        while (i >= 0 && j >= 0) {

            char curA = a.charAt(i);

            char curB = b.charAt(j);

            if (flag) {

                if (curA == '0' && curB == '0') {

                    builder.append(1);

                    flag = false;

                }

                if (curA == '0' && curB == '1') {

                    builder.append(0);

                    flag = true;

                }

                if (curA == '1' && curB == '0') {

                    builder.append(0);

                    flag = true;

                }

                if (curA == '1' && curB == '1') {

                    builder.append(1);

                    flag = true;

                }

            } else {

                if (curA == '0' && curB == '0') {

                    builder.append(0);

                    flag = false;

                }

                if (curA == '0' && curB == '1') {

                    builder.append(1);

                    flag = false;

                }

                if (curA == '1' && curB == '0') {

                    builder.append(1);

                    flag = false;

                }

                if (curA == '1' && curB == '1') {

                    builder.append(0);

                    flag = true;

                }               

            }

            i--;

            j--;

        }

        while (i >= 0) {

            char curA  = a.charAt(i);

            if (flag) {

                if (curA == '0') {

                    builder.append(1);

                    flag = false;

                } else {

                    builder.append(0);

                    flag = true;

                }

            } else {

                builder.append(curA);

            }

            i--;

        }

        while (j >= 0) {

            char curB  = b.charAt(j);

            if (flag) {

                if (curB == '0') {

                    builder.append(1);

                    flag = false;

                } else {

                    builder.append(0);

                    flag = true;

                }

            } else {

                builder.append(curB);

            }

            j--;

        }

        if (flag) {

            builder.append(1);

        }

        return builder.reverse().toString();



    }

}

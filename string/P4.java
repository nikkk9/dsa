public class P4 {
    // Reverse words in a given string
    // Input:
    // S = i.like.this.program.very.much
    // Output: much.very.program.this.like.i

    String reverseWords(String S) {
        // code here
        String res = "";
        int i = S.length() - 1;

        while (i >= 0) {
            while (i >= 0 && S.charAt(i) == '.')
                i--;

            int j = i;

            if (i < 0)
                break;

            while (i >= 0 && S.charAt(i) != '.')
                i--;

            if (res.isEmpty()) {
                res = res.concat(S.substring(i + 1, j + 1));
            } else {
                res = res.concat("." + S.substring(i + 1, j + 1));
            }
        }
        return res;

    }

}

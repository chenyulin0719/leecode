public class Solution_10 implements Solution {
    @Override
    public void solve() {
        System.out.println("Problem 10:");

        assert isMatch("aa", "a") == false;
        assert isMatch("aa", "aa") == true;
        assert isMatch("aaa", "aa") == false;
        assert isMatch("aa", "a*") == true;
        assert isMatch("aa", ".*") == true;
        assert isMatch("ab", ".*") == true;
        assert isMatch("aab", "c*a*b") == true;
    }

    public boolean isMatch(String s, String p) {
        if (s.isEmpty()) {
            if (p.isEmpty()) {
                return true;
            } else if (p.length() >= 2 &&
                    p.substring(1, 2).equals("*")) {
                return isMatch(s, p.substring(2));
            } else {
                return false;
            }
        }

        if (p.isEmpty()) {
            return false;
        }

        if (p.length() >= 2 &&
                p.substring(1, 2).equals("*")) {
            if (p.substring(0, 1).equals(s.substring(0, 1)) ||
                    p.substring(0, 1).equals(".")) {
                return isMatch(s.substring(1), p) || isMatch(s.substring(1), p.substring(2));
            } else {
                return isMatch(s.substring(1), p.substring(2));
            }
        } else if (p.substring(0, 1).equals(".") ||
                s.substring(0, 1).equals(p.substring(0, 1))) {
            return isMatch(s.substring(1), p.substring(1));
        } else {
            return false;
        }
    }

}

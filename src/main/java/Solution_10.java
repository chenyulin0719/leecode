public class Solution_10 implements Solution {
    @Override
    public void solve() {
        System.out.println("Problem 10:");
        assert !isMatch("aa", "a");
        assert !isMatch("aa", "aa");
        assert !isMatch("aaa", "aa");
        assert !isMatch("aa", "a*");
        assert !isMatch("aa", ".*");
        assert !isMatch("ab", ".*");
        assert !isMatch("aab", "c*a*b");
    }
    private boolean isMatch(String s, String p) {
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

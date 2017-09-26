package leet.ez;

import java.util.*;

public class Contest {

    static class Solution {
        public boolean validPalindrome(String s) {
            return paliAttempt(s, true);
        }

        public boolean paliAttempt(String s, boolean deep) {
            System.out.println(s);
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    return deep &&
                            (paliAttempt(s.substring(0, i) + s.substring(i + 1), false) ||
                                    paliAttempt(s.substring(0, s.length() - i - 1) + s.substring(s.length() - i), false));
                }
            }
            return true;
        }
    }

    static class J24 {
        public boolean judge24(int[] nums) {
            List<Double> dnums = new ArrayList<>(nums.length);
            for (int num : nums) {
                dnums.add((double) num);
            }
            return attempt(dnums, "start");
        }

        boolean attempt(List<Double> nums, String label) {
            System.out.println(label);
            for(Double num:nums) {
                System.out.print(num + ", ");
            }
            System.out.println();
            if (nums.size() > 1) {
                for (int i = 0; i < nums.size(); i++) {
                    for (int j = 0; j < nums.size(); j++) {
                        if (i != j) {
                            List<Double> newNums = new ArrayList<>();
                            Double a = nums.get(i);
                            Double b = nums.get(j);
                            for(int x = 0; x < nums.size(); x++) {
                                if(x != i && x != j) {
                                    newNums.add(nums.get(x));
                                }
                            }

                            newNums.add(0, a + b);
                            if (attempt(newNums, a + "+" + b)) return true;
                            newNums.remove(0);
                            newNums.add(0, a - b);
                            if (attempt(newNums, a + "-" + b)) return true;
                            newNums.remove(0);
                            newNums.add(0, a * b);
                            if (attempt(newNums, a + "*" + b)) return true;
                            newNums.remove(0);
                            newNums.add(0, a / b);
                            if (attempt(newNums, a + "/" + b)) return true;
                        }
                    }
                }
                return false;
            }
            if(new Double(1000*nums.get(0)).intValue() == 24000) {
                return true;
            }
            return false;
        }
    }

    static class Parenthesis {
        public boolean checkValidString(String s) {
            Set<Integer> pp = new HashSet<>();
            int p = 0;
            int q = 0;
            int D = 0;
            pp.add(0);
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    pp = inc(pp);
                } else if (c == ')') {
                    pp = dec(pp);
                } else if (c == '*') {
                    pp.addAll(inc(pp));
                    pp.addAll(dec(pp));
                }
                if (pp.isEmpty())
                    return false;
            }
            for (Integer i : pp) {
                if (i == 0) return true;
            }
            return false;

//            return parAttempt(s, 0);
        }

        Set<Integer> inc(Collection<Integer> pp) {
            Set<Integer> res = new HashSet<>();
            for (Integer i : pp) {
                res.add(i + 1);
            }
            return res;
        }

        Set<Integer> dec(Collection<Integer> pp) {
            Set<Integer> res = new HashSet<>();
            for (Integer i : pp) {
                if (i > 0) {
                    res.add(i - 1);
                }
            }
            return res;
        }

        public boolean parAttempt(String s, int p) {
            int i = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    p++;
                } else if (c == ')') {
                    if (--p < 0) {
                        return false;
                    }
                    ;
                } else if (c == '*') {

                    return parAttempt(s.substring(i + 1), p)
                            || parAttempt('(' + s.substring(i + 1), p)
                            || parAttempt(')' + s.substring(i + 1), p);
                }
                i++;
            }
            return p == 0;
        }

/*
        System.out.println(m.checkValidString("((*)(*))((*"));
        System.out.println(m.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
        System.out.println(m.checkValidString("(*))((*"));
        System.out.println(m.checkValidString("*))**)"));
        System.out.println(m.checkValidString("((*)(*))((*"));
        System.out.println(m.checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
*/

    }

    static class MapSum {
        private Map<String, Integer> d;

        /**
         * Initialize your data structure here.
         */
        public MapSum() {
            d = new HashMap<>();
        }

        public void insert(String key, int val) {
            d.put(key, val);
        }

        public int sum(String prefix) {
            int result = 0;
            for (Map.Entry<String, Integer> e : d.entrySet()) {
                result += (e.getKey().startsWith(prefix) ? e.getValue() : 0);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        J24 m = new J24();
        System.out.println(m.judge24(new int[]{1, 1, 7, 7}));
        System.out.println(m.judge24(new int[]{8, 1, 2, 3}));
//        System.out.println(m.judge24(new int[]{7, 6, 7, 5}));
/*
        System.out.println(m.judge24(new int[]{4, 1, 8, 7}));
        System.out.println(m.judge24(new int[]{8, 1, 2, 3}));
        System.out.println(m.judge24(new int[]{1, 2, 1, 2}));
*/
    }
}

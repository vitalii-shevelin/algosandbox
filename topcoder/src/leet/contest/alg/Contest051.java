package leet.contest.alg;

import java.util.*;

public class Contest051 {

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

    static class Baseball {
        public int calPoints(String[] ops) {
            LinkedList<Integer> v = new LinkedList<>();
            int sc = 0;
            for(String op : ops) {
                if(op.equals("C")){
                    v.pollFirst();
                } else
                if(op.equals("D")){
                    if(!v.isEmpty()){
                        v.push(2*v.peekFirst());
                    }
                } else
                if(op.equals("+")){
                    if(!v.isEmpty()) {
                        Integer l = v.pollFirst();
                        Integer vv = l + (v.peekFirst()!= null ? v.peekFirst() : 0);
                        v.push(l);
                        v.push(vv);
                    }
                } else {
                    v.push(Integer.valueOf(op));
                }
            }
            while(!v.isEmpty()) {
                sc +=v.pollFirst();
            }
            return sc;
        }

    }

    public static void mainBaseball(String[] args) {
        Baseball m = new Baseball();
        System.out.println(m.calPoints(new String[]{"5","2","C","D","+"}));
        System.out.println(m.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }

    static class ClosestTime {
        public String nextClosestTime(String time) {
            String[] tt = time.split(":");
            Integer hh = Integer.valueOf(tt[0]);
            Integer mm = Integer.valueOf(tt[1]);
            Integer nn[] = new Integer[]{mm % 10,  mm / 10,  hh % 10, hh / 10};
            Integer dd[] = new Integer[]{mm % 10,  mm / 10,  hh % 10, hh / 10};
            Arrays.sort(nn);
            for(Integer n : nn) {
                if(n > dd[0] && n < 10) {
                    return "" + dd[3]+dd[2] +":"+dd[1] + n;
                }
            }
            for(Integer n : nn) {
                if(n > dd[1] && n < 6) {
                    return "" + dd[3]+dd[2] +":"+n + nn[0];
                }
            }
            for(Integer n : nn) {
                if(n > dd[2] && ( n < (dd[3]== 2 ? 4 : 10))) {
                    return "" + dd[3] + n +":"+nn[0] + nn[0];
                }
            }
            for(Integer n : nn) {
                if(n > dd[3] &&  n < 2) {
                    return "" + n + nn[0] +":"+nn[0] + nn[0];
                }
            }
            return "" + nn[0] + nn[0] + ":" + nn[0] + nn[0];
        }
    }

    public static void mainTime(String[] args) {
        ClosestTime m = new ClosestTime();
        System.out.println(m.nextClosestTime("13:55"));
        System.out.println(m.nextClosestTime("19:34"));
        System.out.println(m.nextClosestTime("23:59"));
        System.out.println(m.nextClosestTime("01:32"));
    }

    static class Redundant {
        public int[] findRedundantConnection(int[][] edges) {
            Map<Integer, Set<Integer>> connect = new HashMap<>();
            int[] answer = edges[edges.length-1];
            for(int[] path : edges) {
                for(int node : path) {
                    if(!connect.containsKey(node)) {
                        connect.put(node, new HashSet<>());
                    }
                }
                connect.get(path[0]).add(path[1]);
                connect.get(path[0]).addAll(connect.get(path[1]));
                connect.get(path[1]).add(path[0]);
                connect.get(path[1]).addAll(connect.get(path[0]));
            }
            for(int[] path : edges) {
                if(connect.get(path[0]).contains(path[1]) && connect.get(path[1]).contains(path[0])) {
                    answer = path;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Redundant m = new Redundant();
        System.out.println(Arrays.toString(m.findRedundantConnection(new int[][]{{5, 2}, {3, 4}, {4, 3}, {5, 3}, {1, 3}})));
        System.out.println(Arrays.toString(m.findRedundantConnection(
                new int[][]{{9, 1}, {2, 10}, {2, 6}, {8, 7}, {5, 7},
                            {8, 9}, {2, 4}, {3, 7}, {1, 5}, {4, 7}})));
/*        System.out.println(Arrays.toString(m.findRedundantConnection(new int[][]{{4, 1}, {3, 5}, {5, 2}, {4, 2}, {1, 3}})));
        System.out.println(Arrays.toString(m.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}})));
        System.out.println(Arrays.toString(m.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {3, 1}})));
*/
    }
    static class KEmpty {
        public int kEmptySlots(int[] flowers, int k) {
            return k;
        }
    }

    public static void main2(String[] args) {
        KEmpty m = new KEmpty();
        System.out.println(m.kEmptySlots(new int[]{1, 3, 2}, 1));
    }
}

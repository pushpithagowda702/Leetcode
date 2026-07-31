class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Character> que = new LinkedList<>();
        int r = 0, d = 0;
        int banR = 0;
        int banD = 0;
        for(int i=0; i<n; i++) {
            char ch = senate.charAt(i);
            que.offer(ch);
            if (ch == 'R') {
                r++;
            } else {
                d++;
            }
        }

        while(!que.isEmpty()) {
            if(r == 0 || d == 0) break;
            char ch = que.poll();
            if(ch == 'R') {
                if(banR > 0) {
                    banR--;
                    r--;
                } else {
                    banD++;
                    que.offer(ch);
                }
            } else {
                if(banD > 0) {
                    banD--;
                    d--;
                } else {
                    banR++;
                    que.offer(ch);
                }
            }
        }
        return d == 0 ? "Radiant" : "Dire";
    }
}
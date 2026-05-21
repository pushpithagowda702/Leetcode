class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        generate(n, res, sb, 0, 0);
        return res;
    }
    private void generate(int n, List<String> res, StringBuilder sb, int op, int cl) {
        if(op == n && cl == n) {
            res.add(sb.toString());
            return;
        }
        if(op < n) {
            sb.append("(");
            generate(n, res, sb, op + 1, cl);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(cl < n && cl < op) {
            sb.append(")");
            generate(n, res, sb, op, cl + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
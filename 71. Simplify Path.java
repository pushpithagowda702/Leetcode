class Solution {
    public String simplifyPath(String path) {
        if(path.length() == 1) return "/";
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        for(int i=0; i<arr.length; i++) {
            switch(arr[i]) {
                case ".":
                case "":
                    break;
                case "..":
                    if(!stack.isEmpty()) stack.pop();
                    break;
                default:
                    stack.push(arr[i]);
                    break;
            }
        }
        if (stack.isEmpty()) return "/";
        StringBuilder s = new StringBuilder();
        for(String str : stack) {
            s.append("/").append(str);
        }
        
        return s.toString();
    }
}
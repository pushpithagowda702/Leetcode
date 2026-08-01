class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        canVisitAllRooms(rooms, 0, visited);
        for(boolean flag : visited) {
            if(!flag) return false;
        }
        return true;
    }

    public void canVisitAllRooms(List<List<Integer>> rooms, int ind, boolean[] visited) {
        if(visited[ind]) return;
        List<Integer> keys = rooms.get(ind);
        visited[ind] = true;
        for(int i=0; i<keys.size(); i++) {
            canVisitAllRooms(rooms, keys.get(i), visited);
        }
    }
}
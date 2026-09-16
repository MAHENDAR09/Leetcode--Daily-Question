class MyHashMap {

    int map[];
    public MyHashMap() {
        map = new int[10_000_001];
        Arrays.fill(map,-1);
    }
    
    public void put(int key, int value) {
        map[key] = value;
    }
    
    public int get(int key) {
        return map[key] == -10 ? -1 : map[key];
    }
    
    public void remove(int key) {
        map[key] = -10;
    }
}
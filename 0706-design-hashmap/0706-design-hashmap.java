class MyHashMap {

    Node map[];
    public MyHashMap() {
        map = new Node[10_000_001];
    }
    
    public void put(int key, int value) {
        map[key] = new Node(key,value);
    }
    
    public int get(int key) {

        if (map[key] == null)
            return -1;
        return map[key].getValue();
    }
    
    public void remove(int key) {
        if (map[key] == null)
            return ;
        map[key] = null;
    }
}
class Node {

    private int key,value;

    public Node (int key,int value){
        this.key = key;
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

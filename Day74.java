// Day 74 - LRU Cache

class LRUCache {
    private int capacity;
    private LinkedHashMap<Integer, Integer> cache;

    LRUCache(int cap) {
        // code here
        this.capacity = cap;
        this.cache = new LinkedHashMap<>(cap, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
                return size() > capacity;
            }
        };
    }

    public int get(int key) {

        
        // your code here
        return cache.getOrDefault(key, -1);
    }

        
    public void put(int key, int value) {
        // your code here
        cache.put(key, value);
    }
}
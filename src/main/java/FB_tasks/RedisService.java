package FB_tasks;

import redis.clients.jedis.Jedis;

public class RedisService {
    private final Jedis jedis;

    public RedisService() {
        this.jedis = new Jedis("127.0.0.1", 6379);
        
        jedis.select(1);
    }

    public String getRecord(String key) {
        return jedis.get(key);
    }

    public void setRecord(String key, String value) {
        jedis.set(key, value);
    }

    public void deleteRecord(String key) {
        jedis.del(key);
    }

    public void close() {
        jedis.close();
    }
}

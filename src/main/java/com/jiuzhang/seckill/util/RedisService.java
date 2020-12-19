package com.jiuzhang.seckill.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class RedisService {
    @Autowired
    private JedisPool jedisPool;

    // set <key, value>
    public void setValue (String key, Long value) {
        Jedis jedisClinet = jedisPool.getResource();
        jedisClinet.set(key, value.toString());
    }

    public String getValue(String key) {
        Jedis jedisClient = jedisPool.getResource();
        return jedisClient.get(key);
    }
}

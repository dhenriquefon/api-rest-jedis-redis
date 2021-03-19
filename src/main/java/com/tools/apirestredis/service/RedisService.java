package com.tools.apirestredis.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import redis.clients.jedis.Jedis;

@Service
public class RedisService {

    @Value("${redis.host}")
    private String redisHost;

    @Value("${redis.port}")
    private int redisPort;

    public void writeOnRedis(String key, String value) {
        Jedis jedis = new Jedis(redisHost, redisPort);
        jedis.set(key, value);
    }

    public String getValueRedis(String key) {
        Jedis jedis = new Jedis(redisHost, redisPort);

        try {
            return jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void deleteFromRedis(String key) {
        Jedis jedis = new Jedis(redisHost, redisPort);
        jedis.del(key);
    }
}
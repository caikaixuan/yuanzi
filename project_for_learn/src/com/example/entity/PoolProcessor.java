package com.example.entity;

import com.example.enums.UserProcessorEvent;
import com.example.listener.Listener;
import com.example.listener.Listeners;

import java.util.*;

public class PoolProcessor {


    public static PoolProcessor getInstance() {
        return instance;
    }

    private static final PoolProcessor instance = new PoolProcessor();


    private final static Map<Long, Pool> currentPools = new HashMap<>();

    public  static Listeners<Pool, UserProcessorEvent> poolListeners = new Listeners<>();

    private PoolProcessor() {
        init_listeners();

    }

    private void init_listeners() {
        System.out.println();
    }

    public boolean isNewParticipant(long userId){
        return false;
    }

    public static Pool getPool(Long poolId) {
        if (currentPools.containsKey(poolId)) {
            return currentPools.get(poolId);
        } else {
            return null;
        }
    }

    public static List<Pool> getPools() {
        List<Pool> pools = new ArrayList<>();
        Set<Long> keys = currentPools.keySet();
        for (Long poolId : keys) {
            pools.add(getPool(poolId));
        }
        return pools;
    }



    public boolean addListener(Listener<Pool> listener, UserProcessorEvent eventType) {
        return poolListeners.addListener(listener, eventType);
    }

    public boolean removeListener(Listener<Pool> listener, UserProcessorEvent eventType) {
        return poolListeners.removeListener(listener, eventType);
    }
}

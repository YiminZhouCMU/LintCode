static int[] countOperationsToK(long[] kValues) {
        int[] results = new int[kValues.length];
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        map.put(0L, 0);
        map.put(1L, 1);
        map.put(2L, 2);
        map.put(3L ,3);
        
        for (int i = 0; i < kValues.length; i++) {
            int level = 0;
            if (map.containsKey(kValues[i])) {
                results[i] = map.get(kValues[i]);
                continue;
            }
            long target = kValues[i];
            if (target % 2 == 0) {
                level = level + 1 + valueLevel(target/2, map);
            } else {
                level = level + 1 + valueLevel(target - 1, map);
            }
            map.put(target, level);
            results[i] = level;
        }
        return results;
    }

    private static int valueLevel(long target, Map<Long, Integer> map) {
        int level = 0;
        if (map.containsKey(target)) {
            level = map.get(target);
            return level;
        }
        if (target % 2 == 0) {
            level = 1 + valueLevel(target/2, map);
        } else {
            level = 1 + valueLevel(target - 1, map);
        }
        map.put(target, level);
        return level;
    }

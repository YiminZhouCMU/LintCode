public static class Node {
        long value;
        int level;
    }
    /*
     * Complete the function below.
     */
    static int[] countOperationsToK(long[] kValues) {
        int[] results = new int[kValues.length];
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        map.put(0L, 0);
        for (int i = 0; i < kValues.length; i++) {
            if (map.containsKey(kValues[i])) {
                results[i] = map.get(kValues[i]);
                continue;
            }
            List<Node> queue = new LinkedList<Node>();
            Set<Long> visitSet = new HashSet<Long>();
            Node initial = new Node();
            initial.value = 0L;
            initial.level = 0;
            queue.add(initial);
            while (queue.size() != 0) {
                Node out = ((LinkedList<Node>) queue).removeFirst();
                
                
                if (out.value == kValues[i]) {
                    results[i] = out.level;
                    break;
                }
                
                if (((out.value * 2L) == kValues[i]) || ((out.value + 1L) == kValues[i])) {
                    results[i] = out.level + 1;
                    break;
                }
                
                visitSet.add(out.value);
                
                if (!visitSet.contains(out.value * 2L)) {
                    Node insert = new Node();
                    insert.value = out.value * 2L;
                    insert.level = out.level + 1;
                    queue.add(insert);
                }
                if (!visitSet.contains(out.value + 1L)) {
                    Node insert = new Node();
                    insert.value = out.value + 1L;
                    insert.level = out.level + 1;
                    queue.add(insert);
                }
            }
        }
        return results;
    }

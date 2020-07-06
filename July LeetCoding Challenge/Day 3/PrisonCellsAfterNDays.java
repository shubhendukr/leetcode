class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        if (cells == null || cells.length == 0 || N <= 0) {
            return cells;
        }
        boolean isRepeating = false;
        int cycle = 0;
        
        Set<String> prisonCellSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int[] next = nextDay(cells);
            String key = Arrays.toString(next);
            if (!prisonCellSet.contains(key)) {
                prisonCellSet.add(key);
                cycle++;
            } else {
                isRepeating = true;
                break;
            }
            cells = next;
        }
        
        if (isRepeating) {
            N %= cycle;
            for (int i = 0; i < N; i++) {
                cells = nextDay(cells);
            }
        }
        
        return cells;
    }
    
    private int[] nextDay(int[] cells) {
        int[] temp = new int[cells.length];
        for (int i = 1; i < cells.length - 1; i++) {
            temp[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
        }
        
        return temp;
    }
}

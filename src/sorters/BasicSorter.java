package sorters;

import cs1c.FHsort;

public class BasicSorter
{
    /**
     * use the shell sort #1 to sort individual chunks
     * @param chunk the chunk to sort
     */
    public static void sortChunk(Integer[] chunk)
    {
        FHsort.shellSort1(chunk);
    }
}

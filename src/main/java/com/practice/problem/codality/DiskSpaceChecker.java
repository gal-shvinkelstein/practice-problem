package com.practice.problem.codality;

import java.util.Set;

public class DiskSpaceChecker {

    public boolean isWritable(int blockSize, int fileSize, Set<Integer> occupiedSectors) {
        int unoccupiedSectors = 0;
        for (int i = 1; i <= blockSize; i++) {
            if (occupiedSectors.contains(i) == false) {
                unoccupiedSectors++;
                if (unoccupiedSectors == fileSize) {
                    return true;
                }
            } else {
                unoccupiedSectors = 0;
            }
        }
        return false;
    }
}

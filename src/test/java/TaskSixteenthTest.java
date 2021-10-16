import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskSixteenthTest {

    @Test
    void setSubst() {
        // Arrange
        int[] emptySrc = {};
        int[] srcA = {1, 2, 3, 4, 5};
        int[] srcB = {1, 4, 3};
        int[] wrongSrc = {1, 1, 2};

        // Act
        int[] emptyDist = TaskSixteenth.setSubst(emptySrc, srcB);
        int[] fullDist = TaskSixteenth.setSubst(srcA, emptySrc);
        int[] normalDist = TaskSixteenth.setSubst(srcA, srcB);
        boolean exceptionArised = false;
        try {
            TaskSixteenth.setSubst(wrongSrc, srcB);
        } catch (IllegalArgumentException err) {
            exceptionArised = true;
        }

        // Assert
        assertArrayEquals(new int[]{}, emptyDist);
        assertArrayEquals(srcA, fullDist);
        assertArrayEquals(new int[]{2, 5}, normalDist);
        assertTrue(exceptionArised);
    }
}
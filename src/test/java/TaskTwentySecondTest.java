import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTwentySecondTest {

    @Test
    void indexesDescending() {
        // Arrange
        int[] src = {17, 4, -5, 16, 9};
        int[] emptySrc = {};

        // Act
        int[] dist = TaskTwentySecond.indexesDescending(src);
        int[] emptyDist = TaskTwentySecond.indexesDescending(emptySrc);

        // Assert
        assertArrayEquals(new int[]{0, 3, 4, 1, 2}, dist);
        assertArrayEquals(new int[]{}, emptyDist);
    }
}
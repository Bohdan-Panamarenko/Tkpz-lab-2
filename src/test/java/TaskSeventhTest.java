import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskSeventhTest {

    @Test
    void minDifference() {
        // Arrange
        int[] array = {14, 6, 8, 12, -1, -17};
        int[] emptyArray = {};

        // Act
        int diff = TaskSeventh.minDifference(array);
        int zeroDiff = TaskSeventh.minDifference(emptyArray);

        // Assert
        assertEquals(2, diff);
        assertEquals(0, zeroDiff);

    }
}
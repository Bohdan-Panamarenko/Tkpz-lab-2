import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTwelvthTest {

    @Test
    void sequenceType() {
        // Arrange
        int[] srcAsc = {-1, 2, 5};
        int[] srcDesc = {5, 4, -10};
        int[] srcDisorder = {1, 2, 1, 1};
        int[] srcEmpty = {};

        // Act
        String distAsc = TaskTwelvth.sequenceType(srcAsc);
        String distDesc = TaskTwelvth.sequenceType(srcDesc);
        String distDisorder = TaskTwelvth.sequenceType(srcDisorder);
        String distEmpty = TaskTwelvth.sequenceType(srcEmpty);

        // Assert
        assertEquals("Ascending order", distAsc);
        assertEquals("Descending order", distDesc);
        assertEquals("Disordered", distDisorder);
        assertEquals("Array too short", distEmpty);
    }
}
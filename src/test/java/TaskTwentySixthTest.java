import static org.junit.jupiter.api.Assertions.*;

class TaskTwentySixthTest {

    @org.junit.jupiter.api.Test
    void reverseArray() {
        // Arrange
        int[] src = {1,2,3,4,5};
        int[] srcEmpty = {};

        // Act
        int[] dist = TaskTwentySixth.reverseArray(src);
        int[] distEmpty = TaskTwentySixth.reverseArray(srcEmpty);

        // Assert
        assertArrayEquals(new int[]{5,4,3,2,1}, dist);

        assertEquals(src.length, dist.length);

        assertEquals(srcEmpty.length, distEmpty.length); // empty array
    }
}
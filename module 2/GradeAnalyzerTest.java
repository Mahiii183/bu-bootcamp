import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeAnalyzerTest {

    @Test
    void calculateAverageWithMultipleScores() {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(80, 90, 100));

        double result = GradeAnalyzer.calculateAverage(scores);

        assertEquals(90.0, result, 0.001);
    }

    @Test
    void calculateAverageWithSingleScore() {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(75));

        double result = GradeAnalyzer.calculateAverage(scores);

        assertEquals(75.0, result, 0.001);
    }

    @Test
    void calculateAverageWithEmptyList() {
        ArrayList<Integer> scores = new ArrayList<>();

        double result = GradeAnalyzer.calculateAverage(scores);

        assertEquals(0.0, result, 0.001);
    }

    @Test
    void calculateAverageWithTwoScores() {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(60, 80));

        double result = GradeAnalyzer.calculateAverage(scores);

        assertEquals(70.0, result, 0.001);
    }

    @Test
    void calculateAverageWithDecimalResult() {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(70, 75, 80));

        double result = GradeAnalyzer.calculateAverage(scores);

        assertEquals(75.0, result, 0.001);
    }

    // Additional test
    @Test
    void calculateAverageWithTenScores() {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(
                50, 60, 70, 80, 90,
                100, 75, 85, 95, 65));

        double result = GradeAnalyzer.calculateAverage(scores);

        assertEquals(77.0, result, 0.001);
    }
}
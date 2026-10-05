public class MainTest {
    public static void main(String[] args) {
        int[] scores = {85, 42, 77, 90, 66};
        System.out.println("Evaluating student scores...");
        evaluateScores(scores);
    }

    // Method to evaluate each score
    public static void evaluateScores(int[] scores) {
        // Validate input
        if (scores == null || scores.length == 0) {
            System.out.println("No scores to evaluate.");
            return;
        }

        // Loop through each score
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i]; // Get current score
            String result;

            // Determine pass/fail
            if (score >= 50) {
                result = "Pass";
            } else {
                result = "Fail";
            }

            // Print result for each student
            System.out.println("Student " + (i + 1) + ": Score = " + score + " => " + result);
        }
    }
}

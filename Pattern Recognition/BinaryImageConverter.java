package PatternRecognition;


public class BinaryImageConverter {

    public static int[][] applyThreshold(int[][] grayImage, int threshold) {
        int[][] binaryImage = new int[grayImage.length][grayImage[0].length];

        // Apply threshold
        for (int i = 0; i < grayImage.length; i++) {
            for (int j = 0; j < grayImage[i].length; j++) {
                if (grayImage[i][j] < threshold) {
                    binaryImage[i][j] = 0;
                } else {
                    binaryImage[i][j] = 1;
                }
            }
        }

        return binaryImage;
    }
}



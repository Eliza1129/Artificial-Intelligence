
//package Pattern_recognition;

import java.util.HashMap;

public class Histogram {

    public static void main(String[] args) {
        // Image data
        int[][] image = {
            {40, 155, 155, 155, 60, 0, 0, 0, 0,0},
            {67, 255, 255, 255, 101, 0, 0, 0, 0, 0}, 
            {65, 255, 255, 255, 98, 0, 0, 0, 0, 0}, 
            {65, 253, 254, 254, 98, 0, 0, 0, 0, 0},
            {13, 50, 50, 50, 17, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 9, 103, 105, 13, 0, 0},
            {0, 0, 0, 1, 157, 255, 255, 162, 1, 0}, 
            {0, 0, 0, 5, 220, 255, 255, 224, 6, 0},
            {0,0, 0, 0, 124, 251, 252, 129, 0,0},
            {0,0, 0, 0, 0, 64, 65, 1, 0, 0},
        };

        // Histogram of the image data
        int[] hist = new int[256];

        // Calculate histogram
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                hist[image[i][j]]++;
            }
        }

        // Display histogram
        System.out.println("gray-level     #-of-pixels");
        for (int i = 0; i < hist.length; i++) {
            if (hist[i] > 0) {
                System.out.printf("%6d %15d\n", i, hist[i]);
            }
        }
        // Apply Otsu threshold filter
        OtsuThresholdFilter otsuFilter = new OtsuThresholdFilter();
        int[][] filteredImage = otsuFilter.filter(image);
    }
}

package com.github.zinchenkoanastasiya;

public class ColorConverter {

    public String convert(String input) {
        if (input == null) {
            return null;
        }

        String[] array = input.trim().split(",\\s+");

        if (array.length != 3) {
            return "";
        }

        try {
            int r = Integer.parseInt(array[0]);
            int g = Integer.parseInt(array[1]);
            int b = Integer.parseInt(array[2]);

            if (r > 255 || r < 0 | g > 255 || g < 0 || b > 255 || b < 0) {
                return "";
            }

            return "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
        } catch ( NumberFormatException ex){
            return "";
        }

    }
}

package Lesson11;

public class LinesChanger {
    private final String[] lines = new String[3];

    public LinesChanger(String line1, String line2, String line3) {
        lines[0] = line1;
        lines[1] = line2;
        lines[2] = line3;
    }

    public void printShortAndLongLine() {
        String shortLine = lines[0];
        String longLine = lines[0];

        for (int i = 1; i < lines.length; i++) {
            if (shortLine.length() > lines[i].length())
                shortLine = lines[i];
            if (longLine.length() < lines[i].length())
                longLine = lines[i];
        }

        System.out.println("Short line: " + shortLine);
        System.out.println("Long line: " + longLine);
    }

    public void sortLinesForLength() {
        for (int i = 0; i < lines.length; i++) {
            int min = i;
            for (int j = i + 1; j < lines.length; j++) {
                if (lines[min].length() > lines[j].length())
                    min = j;
            }
            if (i != min) {
                String temp = lines[i];
                lines[i] = lines[min];
                lines[min] = temp;
            }
        }
    }

    public void printLinesLessThenAverage() {
        sortLinesForLength();
        for (int i = 0; i < lines.length / 2; i++) {
            System.out.println("Line: " + lines[i] + ", length = " + lines[i].length());
        }
    }

    public String findLineWithDifferentSymbols() {
        for (String line : lines) {
            if (isLineWithDifferentSymbols(line))
                return line;
        }
        return "Not found";
    }

    public void printLineWithCloneSymbols(int choose) {
        StringBuilder oldLine;
        StringBuilder newLine = new StringBuilder();
        switch (choose) {
            case 1 -> oldLine = new StringBuilder(lines[0]);
            case 2 -> oldLine = new StringBuilder(lines[1]);
            case 3 -> oldLine = new StringBuilder(lines[2]);
            default -> {
                System.out.println("Error");
                return;
            }
        }

        for (int i = 0; i < oldLine.length(); i++) {
            newLine.append(oldLine.charAt(i));
            newLine.append(oldLine.charAt(i));
        }
        System.out.println(newLine);
    }

    public boolean isLineWithDifferentSymbols(String line) {
        for (int i = 0; i < line.length(); i++) {
            for (int j = i + 1; j < line.length(); j++) {
                if (line.charAt(i) == line.charAt(j))
                    return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "1 line: " + lines[0] + "\n2 line: " + lines[1] + "\n3 line: " + lines[2];
    }
}

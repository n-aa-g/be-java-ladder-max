package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final List<Line> ladder = new ArrayList<>();

    public void addLine(List<Boolean> bool) {
        Line line = new Line(bool);
        ladder.add(line);
    }

    public String drawLadder() {
        StringBuilder sb = new StringBuilder();

        for (Line row : ladder) {
            sb.append(row.drawLine());
            sb.append("\n");
        }
        return sb.toString();
    }

    public List<Integer> play(int numberOfPlayers) {
        List<Integer> position = initializePosition(numberOfPlayers);

        for (Line line : ladder) {
            line.ride(position);
        }
        return position;
    }

    private List<Integer> initializePosition(int size) {
        List<Integer> position = new ArrayList<>();

        for (int cnt = 0; cnt < size; cnt++) {
            position.add(cnt);
        }
        return position;
    }

    public int getLadderSize() {
        return this.ladder.size();
    }
}

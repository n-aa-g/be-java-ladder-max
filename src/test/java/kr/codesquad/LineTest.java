package kr.codesquad;

import kr.codesquad.domain.Line;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class LineTest {
    @Test
    @DisplayName("Line의 모양이 변환되는지 확인")
    void drawLineTest() {
        Line line = new Line(List.of(true, false, false, true, false));
        String figure = line.drawLine();
        assertThat(figure).isEqualTo("|=====|     |     |=====|     |");
    }

    @Test
    void rideTest() {
        Line line = new Line(List.of(true, false, false, true, false));
        List<Integer> input = new ArrayList<>();
        input.add(0);
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        line.ride(input);
        assertThat(input).isEqualTo(List.of(1, 0, 2, 4, 3, 5));
    }
}

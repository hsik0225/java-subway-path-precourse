package subway.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistancesTest {

    @Test
    @DisplayName("거리들을 입력받아 Distances 객체 생성 테스트")
    public void create_DistanceList_NewInstance() {

        // when
        Distances distances = new Distances(1, 2, 3);

        //then
        assertThat(distances.getDistances()).extracting(Distance::getDistance)
                .containsExactly(1, 2, 3);
    }
}

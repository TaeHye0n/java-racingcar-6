package racingcar.controller.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WinnerDtoTest {

    private List<String> winnerNameList;

    @BeforeEach
    void setUp() {
        winnerNameList = List.of("test1", "test2");
    }

    @Test
    void 우승자_이름_출력_포맷_테스트() {
        //given
        WinnerDto winnerDto = new WinnerDto(winnerNameList);

        //when
        String winnerNames = winnerDto.getWinnerNames();

        //then
        assertThat(winnerNames).isEqualTo("test1, test2");

    }

}
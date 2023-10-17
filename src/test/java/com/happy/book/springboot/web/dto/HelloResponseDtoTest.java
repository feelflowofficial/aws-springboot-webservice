package com.happy.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_가능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, amount);

        //then
        assertThat(helloResponseDto.getName()).isEqualTo(name); // 1, 2
        assertThat(helloResponseDto.getAmount()).isEqualTo(amount);
    }
}

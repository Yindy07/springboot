package org.zerock.springex.dto;

import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@ToString
@Data
@Builder
@AllArgsConstructor //다 들어있는 생성자
@NoArgsConstructor  //추상 메서드 생성자

public class TodoDTO {

    private  Long tno;
    @NotEmpty
    private String title;
    @Future
    private LocalDate dueDate;

    private boolean finished;
    @NotEmpty
    private String writer; //새로 추가됨
}

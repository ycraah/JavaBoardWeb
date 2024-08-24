package ycraah.web.member.javaboard.todo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Builder
@ToString
public class TodoVO {
  private Long id;
  private String title;
  private LocalDate dueDate;
  private boolean finished;
}

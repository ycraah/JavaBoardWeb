package ycraah.web.member.javaboard.todo.service;

import ycraah.web.member.javaboard.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
  INSTANCE;

  public void register(TodoDTO todoDTO){
    System.out.println("register 메서드 실행");
  }

  public List<TodoDTO> getList(){
    //테스트용 데이터 생성
    List<TodoDTO> todoList = IntStream.range(0,10).mapToObj(i -> {
      TodoDTO dto = new TodoDTO();
      dto.setId((long)i);
      dto.setTitle(i + "번째 게시물");
      dto.setDueDate(LocalDate.now());
      return dto;
    }).collect(Collectors.toList());
    return todoList;
  }
}

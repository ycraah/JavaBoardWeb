package ycraah.web.member.javaboard.todo.dto;

import java.time.LocalDate;

public class TodoDTO {
  private Long id;
  private String title;
  private LocalDate dueDate;
  private boolean finished;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public boolean isFinished() {
    return finished;
  }

  public void setFinished(boolean finished) {
    this.finished = finished;
  }

  @Override
  public String toString() {
    return "TodoDTO{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", dueDate=" + dueDate +
        ", finished=" + finished +
        '}';
  }
}

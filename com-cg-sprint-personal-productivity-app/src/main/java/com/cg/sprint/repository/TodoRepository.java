package com.cg.sprint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.sprint.model.Todo;

public interface TodoRepository extends JpaRepository<Todo,Integer>  {

//	@Query("select * from ToDo td where td.date=:date ")
//	List<Todo> getTaskListByDateForRemainder(String date);

}

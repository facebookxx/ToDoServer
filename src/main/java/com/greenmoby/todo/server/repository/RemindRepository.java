package com.greenmoby.todo.server.repository;

import com.greenmoby.todo.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}

package com.learn.ex.learnlearn.repositories;

import com.learn.ex.learnlearn.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}

package com.learn.ex.learnlearn.repositories;

import com.learn.ex.learnlearn.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository <Speaker, Long> {
}

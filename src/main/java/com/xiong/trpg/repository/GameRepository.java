package com.xiong.trpg.repository;

import com.xiong.trpg.bean.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}

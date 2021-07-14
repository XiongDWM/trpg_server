package com.xiong.trpg.repository;

import com.xiong.trpg.bean.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character,Long> {
}

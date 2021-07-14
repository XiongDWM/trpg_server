package com.xiong.trpg.repository;

import com.xiong.trpg.bean.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items,Long> {
}

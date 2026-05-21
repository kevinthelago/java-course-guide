package com.kevinthelago.securedapi.repo;

import com.kevinthelago.securedapi.dao.Fortune;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FortuneRepository extends JpaRepository<Fortune, Long> {

    @Transactional
    @Modifying
    @Query(value = "update fortunes set phrase = :phrase where id = :id", nativeQuery = true)
    void update(@Param("phrase") String phrase, @Param("id") long id);

}

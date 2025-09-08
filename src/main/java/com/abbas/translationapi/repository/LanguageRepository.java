package com.abbas.translationapi.repository;

import com.abbas.translationapi.model.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageEntity, Integer> {
    LanguageEntity  findByKeyAndLocale(String key, String locale);
}
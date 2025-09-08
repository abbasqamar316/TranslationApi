package com.abbas.translationapi.mapper;

import com.abbas.translationapi.model.LanguageEntity;
import com.abbas.translationapi.model.Message;
import com.abbas.translationapi.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageMapper {

    @Autowired
    private LanguageRepository languageRepo;

    public LanguageEntity addData(Message msg) throws Exception {

        LanguageEntity languageEntity = languageRepo.findByKeyAndLocale(msg.getKey(), msg.getLocale());
        if(languageEntity == null) {
             languageEntity = new LanguageEntity();
            languageEntity.setContent(msg.getContent());
            languageEntity.setKey(msg.getKey());
            languageEntity.setLocale(msg.getLocale());
            languageRepo.save(languageEntity);
        }
        else {
            throw new DuplicateKeyException("Duplicate Key and Locale");

        }
        return languageEntity;

    }

    public LanguageEntity modifyData(Message msg) throws Exception {

        LanguageEntity languageEntity = languageRepo.findByKeyAndLocale(msg.getKey(), msg.getLocale());

            languageEntity.setContent(msg.getContent());
            languageEntity.setKey(msg.getKey());
            languageEntity.setLocale(msg.getLocale());
            languageRepo.save(languageEntity);
            return languageEntity;


    }

    public LanguageEntity deleteDataByKeyAndLocale(Message msg) throws Exception {

        LanguageEntity languageEntity = languageRepo.findByKeyAndLocale(msg.getKey(), msg.getLocale());

        languageRepo.delete(languageEntity);
        return languageEntity;


    }
    public List<LanguageEntity> getAll() throws Exception {

        List<LanguageEntity> lst = languageRepo.findAll();
        return lst;



    }
}

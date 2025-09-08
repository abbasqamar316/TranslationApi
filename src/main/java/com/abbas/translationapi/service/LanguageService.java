package com.abbas.translationapi.service;

import com.abbas.translationapi.model.LanguageEntity;
import com.abbas.translationapi.model.Message;
import org.springframework.beans.factory.annotation.Autowired;

public interface LanguageService {


    public LanguageEntity findByKeyAndLocal(Message message) throws Exception;

}

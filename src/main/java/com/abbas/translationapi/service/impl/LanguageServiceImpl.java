package com.abbas.translationapi.service.impl;

import com.abbas.translationapi.mapper.MessageMapper;
import com.abbas.translationapi.model.LanguageEntity;
import com.abbas.translationapi.model.Message;
import com.abbas.translationapi.repository.LanguageRepository;
import com.abbas.translationapi.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl  implements LanguageService {


    @Autowired
    MessageMapper messageMapper;

    @Override
    public LanguageEntity findByKeyAndLocal(Message message) throws Exception {

        LanguageEntity lngEntity =  messageMapper.modifyData(message);

        return lngEntity;
    }


}

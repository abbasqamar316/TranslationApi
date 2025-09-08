package com.abbas.translationapi.controller;

import com.abbas.translationapi.mapper.MessageMapper;
import com.abbas.translationapi.model.LanguageEntity;
import com.abbas.translationapi.model.Message;
import com.abbas.translationapi.repository.LanguageRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
public class MessageController {

    @Autowired
    private MessageSource messageSource ;

    @Autowired
    private MessageMapper messageMapper;

    @PostMapping("/getContentByKeyAndLocale")
    public ResponseEntity<?> getbyKeyAndLocale(@RequestBody Message msg)
    {
        String responseBody = messageSource.getMessage(msg.getKey(), null, LocaleContextHolder.getLocale());
        try {

            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        }
        catch (Exception ex) {

            return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
        }


    }

    @PostMapping("/addData")
    public  ResponseEntity<?> add(@RequestBody Message msg)
    {
        String responseBody ="";
        try {
            messageMapper.addData(msg);
            responseBody = "Record Added Successfully";
            return new ResponseEntity<>(responseBody, HttpStatus.CREATED);
        } catch (Exception e) {
            responseBody = "Error while adding please check the values.";
            return new ResponseEntity<>(responseBody, HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }

    @PostMapping("/modifyData")
    public  ResponseEntity<?> modify(@RequestBody Message msg)
    {
        String responseBody ="";
         try {
            messageMapper.modifyData(msg);
            responseBody = "Record Modified Successfully";
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
             responseBody = "Error while updating make sure values are good ";
             return new ResponseEntity<>(responseBody, HttpStatus.INTERNAL_SERVER_ERROR);


         }
     }

    @GetMapping("/deleteByKeyAndLocale")
    public  ResponseEntity<?> deleteByKeyAndLocale(@RequestBody Message msg)
    {
        String responseBody ="";
        try {
             messageMapper.deleteDataByKeyAndLocale(msg);
            responseBody = "Record Modified Successfully";
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody = "Error while updating make sure values are good ";
            return new ResponseEntity<>(responseBody, HttpStatus.INTERNAL_SERVER_ERROR);


        }
    }

    @GetMapping("/getAll")
    public  ResponseEntity<?> getAll()
    {
         try {
            List<LanguageEntity> lst = messageMapper.getAll();

            return new ResponseEntity<>(lst,HttpStatus.OK);
        } catch (Exception e) {
            String responseBody = "Error while getting data";
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);


        }
    }
}

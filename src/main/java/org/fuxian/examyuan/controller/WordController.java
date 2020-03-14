package org.fuxian.examyuan.controller;

import org.fuxian.examyuan.common.Common;
import org.fuxian.examyuan.dao.WordMapper;
import org.fuxian.examyuan.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Random;

@RestController
public class WordController {

    @Autowired
    WordMapper wordMapper;
    @RequestMapping("getWord")
    public Word getWord(){
        Random random = new Random();
        int id = random.nextInt(Common.COUNT)+1;
        return wordMapper.getWordByID(id);
    }

    @PostConstruct
    public void init(){
        int count = wordMapper.getWordCount();
        Common.COUNT = count;
    }
}

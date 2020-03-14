package org.fuxian.examyuan;

import org.fuxian.examyuan.dao.WordMapper;
import org.fuxian.examyuan.model.Word;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExamyuanApplicationTests {

    @Autowired
    WordMapper wordMapper;

    @Test
    void contextLoads() {
      Word word= wordMapper.getWordByID(1);
      System.out.println(word);
    }

}

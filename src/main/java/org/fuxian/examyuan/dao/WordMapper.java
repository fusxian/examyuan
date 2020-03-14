package org.fuxian.examyuan.dao;

import org.fuxian.examyuan.model.Word;


public interface WordMapper {
     Word getWordByID(int id);
     int getWordCount();
}

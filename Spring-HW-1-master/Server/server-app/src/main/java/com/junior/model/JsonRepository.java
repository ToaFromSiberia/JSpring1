package com.junior.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junior.chat.common.Message;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonRepository extends MessageRepositoryImpl {

    private static final int MAX_SIZE_LOAD = 20;            // макс. длина возвращаемого списка

    private String fileName;
    private int maxItems;

    public JsonRepository(String fileName)
    {
        this(fileName, MAX_SIZE_LOAD);
    }

    public JsonRepository(String fileName, int maxItems) {
        this.fileName = fileName;
        this.maxItems = maxItems;
    }

    @Override
    public void add(Message item) {
    }

    @Override
    public void update(Message item) {

    }

    @Override
    public void delete(Message item) {

    }

    @Override
    public Message getById(Long aLong)
    {
        return null;
    }

    @Override
    public List<Message> getAll() {
        return null;
    }


}

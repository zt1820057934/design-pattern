package com.example.design.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.example.design.ignorse.DocParser;
import com.example.design.ignorse.JsonParser;
import com.example.design.ignorse.Parser;
import com.example.design.ignorse.XmlParser;

/**
 * SimpleTwoFactory.
 * 简单工厂模式2
 * @author zhangteng 2/5/21
 */
public class SimpleTwoFactory {

    private static final Map<String, Parser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("xml", new XmlParser());
        cachedParsers.put("json", new JsonParser());
        cachedParsers.put("doc", new DocParser());
    }

    public static Parser getInstance(String type) {
        return cachedParsers.get(type);
    }

}

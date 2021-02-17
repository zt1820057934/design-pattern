package com.example.design.method.two;

import java.util.HashMap;
import java.util.Map;

import com.example.design.method.one.IParserFactory;
import com.example.design.method.one.JsonParserFactory;
import com.example.design.method.one.XmlParserFactory;

/**
 * ParserFactoryMap.
 *
 * @author zhangteng 2/5/21
 */
public class ParserFactoryMap {

    private static final Map<String, IParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("xml", new XmlParserFactory());
        cachedFactories.put("json", new JsonParserFactory());
    }

    public static IParserFactory getFactory(String type) {
        return cachedFactories.get(type);
    }

}

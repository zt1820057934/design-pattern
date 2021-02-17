package com.example.design.method.one;

import com.example.design.ignorse.JsonParser;
import com.example.design.ignorse.Parser;

/**
 * JsonParserFactory.
 *
 * @author zhangteng 2/5/21
 */
public class JsonParserFactory implements IParserFactory {
    @Override
    public Parser createParser() {
        return new JsonParser();
    }
}

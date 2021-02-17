package com.example.design.method.one;

import com.example.design.ignorse.Parser;
import com.example.design.ignorse.XmlParser;

/**
 * XmlParserFactory.
 *
 * @author zhangteng 2/5/21
 */
public class XmlParserFactory implements IParserFactory {
    @Override
    public Parser createParser() {
        return new XmlParser();
    }
}

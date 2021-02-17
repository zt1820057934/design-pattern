package com.example.design.method.one;

import com.example.design.ignorse.Parser;

/**
 * Use.
 * 使用上看，这样设计并没有解决问题
 * @author zhangteng 2/5/21
 */
public class Use {

    public Parser getParser(String type) {
        IParserFactory factory = null;
        if("xml".equals(type)) {
            factory = new XmlParserFactory();
        } else if("json".equals(type)) {
            factory = new JsonParserFactory();
        }
        if(factory != null) {
            return factory.createParser();
        }
        return null;
    }

}

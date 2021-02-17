package com.example.design.method.two;

import com.example.design.ignorse.Parser;

/**
 * Use.
 *
 * @author zhangteng 2/5/21
 */
public class Use {

    public Parser getParser(String type) {
        return ParserFactoryMap.getFactory(type).createParser();
    }

}

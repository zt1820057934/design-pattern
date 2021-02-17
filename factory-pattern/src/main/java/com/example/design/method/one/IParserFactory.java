package com.example.design.method.one;

import com.example.design.ignorse.Parser;

/**
 * IParserFactory.
 * 相比简单工厂， 更加符合开闭原则
 * @author zhangteng 2/5/21
 */
public interface IParserFactory {

    Parser createParser();

}

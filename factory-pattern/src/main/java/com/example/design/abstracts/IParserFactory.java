package com.example.design.abstracts;

/**
 * IParserFactory.
 *
 * @author zhangteng 2/7/21
 */
public interface IParserFactory {

    ILinuxConfigParser createLinuxParser();

    IWinConfigParser createWinParser();

}

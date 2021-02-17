package com.example.design.abstracts;

/**
 * JsonParserFactory.
 *
 * @author zhangteng 2/7/21
 */
public class JsonParserFactory implements IParserFactory {
    @Override
    public ILinuxConfigParser createLinuxParser() {
        return new JsonLinuxConfigParser();
    }

    @Override
    public IWinConfigParser createWinParser() {
        return new JsonWindowsConfigParser();
    }
}

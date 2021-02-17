package com.example.design.simple;

import com.example.design.ignorse.DocParser;
import com.example.design.ignorse.JsonParser;
import com.example.design.ignorse.Parser;
import com.example.design.ignorse.XmlParser;

/**
 * SimpleFactoryOne.
 * 简单工厂模式1
 * @author zhangteng 2/5/21
 */
public class SimpleOneFactory {

    public static Parser createInstance(String type) {
        if("xml".equals(type)) {
            return new XmlParser();
        } else if ("json".equals(type)) {
            return new JsonParser();
        } else if ("doc".equals(type)) {
            return new DocParser();
        }
        return null;
    }

}

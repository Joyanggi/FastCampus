package com.company.design.strategy;

public class NormalStrategy implements EncordingStrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}

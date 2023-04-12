package com.company.design.strategy;

public class AppendStrategy  implements EncordingStrategy{
    @Override
    public String encode(String text) {
        return "ABCD"+text;
    }
}

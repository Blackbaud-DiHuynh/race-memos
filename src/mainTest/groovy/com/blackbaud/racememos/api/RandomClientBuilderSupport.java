package com.blackbaud.racememos.api;
import com.blackbaud.racememos.api.RandomVoiceMemoBuilder;

public class RandomClientBuilderSupport {

    public RandomVoiceMemoBuilder voiceMemo() {
        return new RandomVoiceMemoBuilder();
    }

}

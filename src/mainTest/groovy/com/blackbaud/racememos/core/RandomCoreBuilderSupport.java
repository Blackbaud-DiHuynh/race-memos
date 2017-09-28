package com.blackbaud.racememos.core;
import com.blackbaud.racememos.core.domain.RandomVoiceMemoEntityBuilder;

public class RandomCoreBuilderSupport {

    public RandomVoiceMemoEntityBuilder voiceMemoEntity() {
        return new RandomVoiceMemoEntityBuilder();
    }

}

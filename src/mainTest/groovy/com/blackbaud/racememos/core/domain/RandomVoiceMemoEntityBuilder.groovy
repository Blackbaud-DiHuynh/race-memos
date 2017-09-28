package com.blackbaud.racememos.core.domain;

import static com.blackbaud.racememos.core.CoreARandom.aRandom

class RandomVoiceMemoEntityBuilder extends VoiceMemoEntity.VoiceMemoEntityBuilder {

    public RandomVoiceMemoEntityBuilder() {
        this.id(aRandom.intId())
                .participantId(aRandom.intId())
                .path(aRandom.text(100))
                .eventId(aRandom.intId())
                .mileTarget(aRandom.intBetween(0, 27))
    }

}

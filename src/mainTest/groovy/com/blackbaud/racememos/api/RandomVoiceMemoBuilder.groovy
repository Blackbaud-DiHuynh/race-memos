package com.blackbaud.racememos.api;

import static com.blackbaud.racememos.api.ClientARandom.aRandom

class RandomVoiceMemoBuilder extends VoiceMemo.VoiceMemoBuilder {

    public RandomVoiceMemoBuilder() {
        this.id(aRandom.intId())
                .participantId(aRandom.intId())
                .path(aRandom.text(100))
                .eventId(aRandom.intId())
                .mileTarget(aRandom.intBetween(0, 27))
    }

}

package com.blackbaud.racememos.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VoiceMemo {

    private Integer id;
    private Integer participantId;
    private String path;
    private Integer eventId;
    private Integer mileTarget;
}

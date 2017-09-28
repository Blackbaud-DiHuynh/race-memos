package com.blackbaud.racememos.core.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "voice_memo")
@Table(name = "voice_memo")
@Data
@EqualsAndHashCode(of = "id")
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VoiceMemoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "memo_seq_gen")
    @SequenceGenerator(name = "memo_seq_gen", sequenceName = "memo_seq")
    private Integer id;
    private Integer participantId;
    private String path;
    private Integer eventId;
    private Integer mileTarget;

}

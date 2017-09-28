--liquibase formatted sql

--changeset blackbaud:1
create table voice_memo (
  id int constraint voice_memo_pk primary key,
  participant_id int,
  path VARCHAR (250),
  event_id int,
  mile_target int
)
--rollback drop table voice_memo

--changeset blackbaud:2
create sequence memo_seq
--rollback drop sequence node_seq

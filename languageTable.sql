-- Table: public.languages

-- DROP TABLE IF EXISTS public.languages;

CREATE TABLE IF NOT EXISTS public.languages
(
    id integer NOT NULL DEFAULT nextval('languages_id_seq'::regclass),
    locale character varying(2) COLLATE pg_catalog."default",
    messagekey character varying(255) COLLATE pg_catalog."default",
    messagecontent character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT languages_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.languages
    OWNER to postgres;
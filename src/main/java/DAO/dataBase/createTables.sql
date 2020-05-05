DROP TABLE public."User";

DROP SEQUENCE public.user;

CREATE SEQUENCE public.user;
ALTER SEQUENCE public.user
    OWNER TO postgres;

CREATE TABLE public."User"
(
    "idUser" numeric(10,0) NOT NULL DEFAULT nextval('user'::regclass),
    "firstNameUser" character(30) COLLATE pg_catalog."default" NOT NULL,
    "secondNameUser" character(30) COLLATE pg_catalog."default" NOT NULL,
    "ageUser" numeric(3,0),
    "countryUser" character(30) COLLATE pg_catalog."default",
    "winUser" numeric(20,0) NOT NULL,
    "loseUser" numeric(20,0) NOT NULL,
    CONSTRAINT "User_pkey" PRIMARY KEY ("idUser")
)

    TABLESPACE pg_default;

ALTER TABLE public."User"
    OWNER to postgres;
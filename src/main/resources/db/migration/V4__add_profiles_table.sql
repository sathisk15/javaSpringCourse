create table profiles
(
    id bigint primary key,
    bio text,
    phone_number   varchar(15),
    loyalty_points INT UNSIGNED NOT NULL DEFAULT 0,
    date_of_birth  date,
    constraint profiles_users_id_fk
        foreign key (id) references users (id)
);


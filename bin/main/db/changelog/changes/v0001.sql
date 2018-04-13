create table event (
    id bigserial not null,
    name varchar(50) not null,
    createon date not null,
    primary key (id)
);

create table eventorder (
    id bigserial not null,
    event_id bigint not null references event (id),
    orderno varchar(200) not null,
    phone varchar(50) not null,
    createon date not null,
    primary key (id)
);

create table thirdparty (
    id bigserial not null,
    name varchar(50) not null,
    code varchar(50) not null,
    primary key (id)
);


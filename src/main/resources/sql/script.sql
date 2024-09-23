create table department
(
    id          int auto_increment
        primary key,
    name        varchar(25)  not null,
    description varchar(100) null,
    state       varchar(25)  not null
);

create table personal_file
(
    id            int auto_increment
        primary key,
    code          varchar(50)   not null comment '档案编码',
    name          varchar(50)   not null comment '姓名',
    gender        varchar(2)    not null comment '性别',
    dept_id       int unsigned  not null comment '部门id',
    role_id       int unsigned  not null comment '角色id',
    create_date   datetime      not null comment '建档日期',
    audit_state   varchar(10)   not null comment '审核状态',
    staff_state   varchar(10)   not null comment '员工状态',
    extra_info    varchar(250)  null comment '额外信息',
    email         varchar(50)   null comment '电子邮箱',
    phone_number  varchar(25)   null comment '电话号码',
    address       varchar(100)  null comment '住址',
    domicile      varchar(50)   null comment '户口所在地',
    id_number     varchar(50)   null comment '身份证号码',
    graduate_from varchar(50)   null comment '毕业院校',
    major         varchar(50)   null comment '专业',
    photo         varchar(2083) null comment '照片（以图片地址形式储存）'
)
    comment '人事档案';

create table position_info
(
    id          int auto_increment
        primary key,
    dept_id     int unsigned  not null comment '部门id',
    role_id     int           not null comment '角色id',
    type        varchar(10)   not null comment '职位类型',
    code        varchar(50)   not null comment '职位编码',
    create_date datetime      not null comment '发布时间',
    description varchar(1000) null comment '职位描述',
    requirement varchar(1000) null comment '招聘要求'
)
    comment '职位信息';

create table role
(
    id          int auto_increment
        primary key,
    name        varchar(50)  not null,
    description varchar(100) null,
    state       varchar(10)  not null
);

create table user
(
    id        int auto_increment
        primary key,
    login_id  varchar(50) not null,
    login_pwd varchar(50) not null,
    email     varchar(50) null,
    state     varchar(10) null,
    code      mediumtext  not null,
    role_id   int         null,
    dept_id   int         null
);



/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/4/4 15:24:07                            */
/*==============================================================*/


drop table if exists t_employee_task;

drop table if exists t_female_health_form;

drop table if exists t_male_health_form;

drop table if exists t_task;

drop table if exists t_employee;

drop table if exists t_work_hard;

/*==============================================================*/
/* Table: t_employee_task                                       */
/*==============================================================*/
create table t_employee_task
(
   id                   int(12) not null,
   emp_id               int(12) not null,
   task_id              int(12) not null,
   task_name            varchar(12) not null,
   note                 varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: t_female_health_form                                  */
/*==============================================================*/
create table t_female_health_form
(
   id                   int(12) not null,
   emp_id               int(12) not null,
   heart                varchar(64) not null,
   liver                varchar(64) not null,
   spleen               varchar(64) not null,
   lung                 varchar(64) not null,
   kidney               varchar(64),
   uterus               varchar(64) not null,
   note                 varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: t_male_health_form                                    */
/*==============================================================*/
create table t_male_health_form
(
   id                   int(12) not null,
   emp_id               int(12) not null,
   heart                varchar(64) not null,
   liver                varchar(64) not null,
   spleen               varchar(64) not null,
   lung                 varchar(64) not null,
   kidney               varchar(64) not null,
   prostate             varchar(64) not null,
   note                 varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: t_task                                                */
/*==============================================================*/
create table t_task
(
   id                   int(12) not null,
   title                varchar(60) not null,
   context              varchar(256) not null,
   note                 varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: t_employee                                            */
/*==============================================================*/
create table t_employee
(
   id                   int(12) not null auto_increment,
   name                 varchar(60) not null,
   sex                  int(2) not null comment '1 - ��  0 - Ů',
   birthday             date not null,
   mobile               varchar(20) not null,
   email                varchar(60) not null,
   position             varchar(20) not null,
   note                 varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: t_work_hard                                           */
/*==============================================================*/
create table t_work_hard
(
   id                   int(12) not null,
   emp_id               int(12) not null,
   real_name            varchar(60) not null,
   mobile               varchar(20) not null,
   email                varchar(20) not null,
   position             varchar(20) not null,
   note                 varchar(256),
   primary key (id)
);

alter table t_employee_task add constraint FK_Reference_4 foreign key (emp_id)
      references t_employee (id) on delete restrict on update restrict;

alter table t_employee_task add constraint FK_Reference_5 foreign key (task_id)
      references t_task (id) on delete restrict on update restrict;

alter table t_female_health_form add constraint FK_Reference_2 foreign key (emp_id)
      references t_employee (id) on delete restrict on update restrict;

alter table t_male_health_form add constraint FK_Reference_3 foreign key (emp_id)
      references t_employee (id) on delete restrict on update restrict;

alter table t_work_hard add constraint FK_Reference_1 foreign key (emp_id)
      references t_employee (id) on delete restrict on update restrict;


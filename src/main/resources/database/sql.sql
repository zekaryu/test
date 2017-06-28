create table ac_user
(
	id bigint not null auto_increment
		primary key,
	gmt_create datetime null,
	gmt_modified datetime null,
	username varchar(50) not null,
	password varchar(50) null,
	is_deleted tinyint default '0' null,
	is_active tinyint default '1' null
)
;

comment on column ac_user.id is 'id主键'
;

comment on column ac_user.gmt_create is '创建时间 cteate time'
;

comment on column ac_user.gmt_modified is '最近修改时间，Last modified time'
;

comment on column ac_user.username is '用户名'
;

comment on column ac_user.password is '密码'
;

comment on column ac_user.is_deleted is '用户是否被删除'
;

comment on column ac_user.is_active is '用户是否被激活'
;

create table ac_user_info
(
	id bigint not null
		primary key,
	user_id bigint null,
	constraint ac_user_info_ac_user_id_fk
		foreign key (user_id) references ac_user (id)
)
;

create index ac_user_info_ac_user_id_fk
	on ac_user_info (user_id)
;

comment on table ac_user_info is '用户信息表'
;

comment on column ac_user_info.user_id is 'ac_user外键'
;


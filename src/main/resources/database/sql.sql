create table ac_element
(
	id bigint null,
	gmt_create datetime null,
	gmt_modified datetime null,
	name varchar(20) null,
	code varchar(50) null
)
;

comment on table ac_element is '页面元素权限表'
;

create table ac_menu
(
	id bigint null,
	name varchar(20) null,
	uri varchar(50) null,
	parent_id bigint null
)
;

comment on table ac_menu is '菜单表'
;

create table ac_operation
(
	id bigint null,
	gmt_create datetime null,
	gmt_modified datetime null,
	name varchar(50) null,
	code varchar(50) null,
	type varchar(50) null,
	uri_prefix varchar(100) null,
	parent_id bigint null
)
;

comment on table ac_operation is '功能操作权限表'
;

create table ac_permission
(
	id bigint not null auto_increment
		primary key,
	gmt_create datetime null,
	gmt_modified datetime null,
	type tinyint null
)
;

comment on table ac_permission is '权限表'
;

create table ac_role
(
	id bigint not null auto_increment
		primary key,
	gmt_create datetime null,
	gmt_modified datetime null,
	name varchar(20) null,
	parent_id bigint null
)
;

comment on table ac_role is '角色表'
;

comment on column ac_role.gmt_create is '创建时间'
;

comment on column ac_role.gmt_modified is '最近修改时间'
;

comment on column ac_role.name is '角色名'
;

comment on column ac_role.parent_id is '父角色ID'
;

create table ac_role_group
(
	id bigint not null
		primary key,
	gmt_create datetime null,
	gmt_modified datetime null,
	name varchar(20) null,
	parent_id bigint null
)
;

comment on table ac_role_group is '角色组'
;

create table ac_role_group_role
(
	id bigint null,
	gmt_create datetime null,
	gmt_modified datetime null,
	role_group_id bigint null,
	role_id bigint null,
	constraint ac_role_group_role_ac_role_group_id_fk
		foreign key (role_group_id) references ac_role_group (id),
	constraint ac_role_group_role_ac_role_id_fk
		foreign key (role_id) references ac_role (id)
)
;

create index ac_role_group_role_ac_role_group_id_fk
	on ac_role_group_role (role_group_id)
;

create index ac_role_group_role_ac_role_id_fk
	on ac_role_group_role (role_id)
;

comment on table ac_role_group_role is '角色组角色关联表'
;

create table ac_user
(
	id bigint not null auto_increment
		primary key,
	gmt_create datetime null,
	gmt_modified datetime null,
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

comment on column ac_user.is_deleted is '用户是否被删除'
;

comment on column ac_user.is_active is '用户是否被激活'
;

create table ac_user_auth
(
	id bigint not null
		primary key,
	gmt_create datetime null,
	gmt_modified datetime null,
	identify_type varchar(20) not null,
	credential varchar(200) not null,
	is_verified tinyint default '0' null,
	user_id bigint not null,
	identifier varchar(100) not null,
	log_ip varchar(20) null,
	open_id varchar(0) null,
	access_token varchar(100) null,
	constraint ac_user_auth_id_uindex
		unique (id),
	constraint ac_user_auth_user_id_uindex
		unique (user_id),
	constraint ac_user_auth_identifier_uindex
		unique (identifier),
	constraint ac_user_auth_ac_user_id_fk
		foreign key (user_id) references ac_user (id)
)
;

comment on table ac_user_auth is '用户鉴权表'
;

comment on column ac_user_auth.gmt_create is '创建时间'
;

comment on column ac_user_auth.gmt_modified is '最近修改时间'
;

comment on column ac_user_auth.identify_type is '登录类型（手机号 邮箱 用户名）或第三方应用名称（微信 微博等）'
;

comment on column ac_user_auth.credential is '密码凭证（站内的保存密码，站外的不保存或保存token）'
;

comment on column ac_user_auth.is_verified is '是否已被验证'
;

comment on column ac_user_auth.user_id is 'userid外键'
;

comment on column ac_user_auth.identifier is '标识（手机号 邮箱 用户名或第三方应用的唯一标识）'
;

comment on column ac_user_auth.log_ip is '登录IP地址'
;

create table ac_user_group
(
	id bigint not null auto_increment
		primary key,
	name varchar(20) null,
	parent_id bigint null,
	gmt_create datetime null,
	gmt_modified datetime null
)
;

create table ac_user_group_role
(
	id bigint not null auto_increment
		primary key,
	gmt_create datetime null,
	gmt_modified datetime null,
	user_group_id bigint null,
	role_id bigint null,
	constraint ac_user_group_role_ac_user_group_id_fk
		foreign key (user_group_id) references ac_user_group (id),
	constraint ac_user_group_role_ac_role_id_fk
		foreign key (role_id) references ac_role (id)
)
;

create index ac_user_group_role_ac_role_id_fk
	on ac_user_group_role (role_id)
;

create index ac_user_group_role_ac_user_group_id_fk
	on ac_user_group_role (user_group_id)
;

comment on table ac_user_group_role is '用户组角色关联表'
;

create table ac_user_group_user
(
	id bigint not null auto_increment
		primary key,
	gmt_create datetime null,
	gmt_modified datetime null,
	user_group_id bigint null,
	user_id bigint null,
	constraint ac_user_group_user_ac_user_group_id_fk
		foreign key (user_group_id) references ac_user_group (id),
	constraint ac_user_group_user_ac_user_id_fk
		foreign key (user_id) references ac_user (id)
)
;

create index ac_user_group_user_ac_user_group_id_fk
	on ac_user_group_user (user_group_id)
;

create index ac_user_group_user_ac_user_id_fk
	on ac_user_group_user (user_id)
;

create table ac_user_info
(
	id bigint not null
		primary key,
	user_id bigint null,
	gmt_create datetime null,
	gmt_modified datetime null,
	bday date null,
	email varchar(100) null,
	phone varchar(20) null,
	QQ varchar(15) null,
	wechat varchar(50) null,
	nickname varchar(50) null,
	avatar varchar(200) null,
	age tinyint null,
	gender tinyint null,
	location varchar(100) null,
	profession varchar(20) null,
	hometown varchar(100) null,
	postcode varchar(20) null,
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

comment on column ac_user_info.gmt_create is '创建时间'
;

comment on column ac_user_info.gmt_modified is '最近修改时间'
;

comment on column ac_user_info.bday is '生日'
;

comment on column ac_user_info.email is '电子邮箱'
;

comment on column ac_user_info.phone is '手机'
;

comment on column ac_user_info.QQ is 'QQ'
;

comment on column ac_user_info.wechat is '微信'
;

comment on column ac_user_info.nickname is '昵称'
;

comment on column ac_user_info.avatar is '头像地址'
;

comment on column ac_user_info.age is '年龄'
;

comment on column ac_user_info.gender is '性别'
;

comment on column ac_user_info.location is '地址'
;

comment on column ac_user_info.profession is '职业'
;

comment on column ac_user_info.hometown is '家乡'
;

comment on column ac_user_info.postcode is '邮政编码'
;

create table ac_user_role
(
	id bigint null,
	gmt_create datetime null,
	gmt_modified datetime null,
	user_id bigint null,
	role_id bigint null,
	constraint ac_user_role_ac_user_id_fk
		foreign key (user_id) references ac_user (id),
	constraint ac_user_role_ac_role_id_fk
		foreign key (role_id) references ac_role (id)
)
;

create index ac_user_role_ac_role_id_fk
	on ac_user_role (role_id)
;

create index ac_user_role_ac_user_id_fk
	on ac_user_role (user_id)
;

comment on table ac_user_role is '用户角色关联表'
;


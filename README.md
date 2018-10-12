# KotlinMall-Server
- 如果使用的MySql版本是8.x以下的链接数据库驱动

   	`com.mysql.jdbc.Driver`  
- 链接Url

	`jdbc:mysql://127.0.0.1:3306/mysql?useUnicode=true&characterEncoding=utf-8&useSSL=false`

- 如果使用的MySql版本是8.x以上的链接数据库驱动

 	`com.mysql.cj.jdbc.Driver`
  
- 链接Url

 	`jdbc:mysql://127.0.0.1:3306/mysql?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC`
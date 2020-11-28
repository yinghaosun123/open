XA想要保证事务的一致性也是需要添加@Transaction注解，才能够保障事务的一致性

想要使用XA需添加该jar包
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-jta-atomikos</artifactId>
</dependency>


参考
https://blog.csdn.net/hamster204/article/details/110163918




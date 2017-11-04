jar -cfe mods/myhello.jar com.my.module.hello.MyHello -C target/classes .
@echo %time%
java --module-path target/classes;../my-module-api/target/classes;../my-module-it/target/classes  --module com.my.module.hello.test/com.my.module.hello.MyHello
@echo %time%
java --module-path target/my-module-0.0.1-SNAPSHOT.jar;../my-module-api/target/my-module-api-0.0.1-SNAPSHOT.jar;../my-module-it//target/my-module-it-0.0.1-SNAPSHOT.jar --module com.my.module.hello.test/com.my.module.hello.MyHello
@echo %time%
java --limit-modules java.base,com.my.module.hello.api,com.my.module.hello.it --module-path target/my-module-0.0.1-SNAPSHOT.jar;../my-module-api/target/my-module-api-0.0.1-SNAPSHOT.jar;../my-module-it//target/my-module-it-0.0.1-SNAPSHOT.jar --module com.my.module.hello.test/com.my.module.hello.MyHello
@echo %time%
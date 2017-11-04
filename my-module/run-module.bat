jar -cfe mods/myhello.jar com.my.module.hello.MyHello -C bin .
@echo %time%
java --module-path bin --module com.my.module.hello/com.my.module.hello.MyHello
@echo %time%
java --module-path mods --module com.my.module.hello/com.my.module.hello.MyHello
@echo %time%
java --show-module-resolution --limit-modules java.base --module-path mods --module com.my.module.hello/com.my.module.hello.MyHello
@echo %time%
java --limit-modules java.base --module-path mods --module com.my.module.hello/com.my.module.hello.MyHello
@echo %time%
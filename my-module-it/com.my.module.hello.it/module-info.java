module com.my.module.hello.it {
	requires com.my.module.hello.api;
	
	provides com.my.module.hello.api.IMyHello with com.my.module.hello.it.MyITHello;
}
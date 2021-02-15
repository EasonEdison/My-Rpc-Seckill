package kiruto;


import kiruto.annotation.RpcScan;
import kiruto.controller.HelloController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RpcScan(basePackage = "kiruto")
public class NettyClientTest {
    public static void main(String[] args) {
        // NettyRpcClient nettyRpcClient = new NettyRpcClient();
        // RpcServiceProperties properties = RpcServiceProperties.builder()
        //     .group("JoJo").version("1").build();
        // RpcClientProxy rpcClientProxy = new RpcClientProxy(nettyRpcClient, properties);
        // HelloWorld helloWorld = rpcClientProxy.getProxyInstance(HelloWorld.class);
        // String hello = helloWorld.hello("ko no dio da !");
        // System.out.println("调用后：" + hello);
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(NettyClientTest.class);
        HelloController helloController = (HelloController) applicationContext.getBean("helloController");
        helloController.test();
    }
}
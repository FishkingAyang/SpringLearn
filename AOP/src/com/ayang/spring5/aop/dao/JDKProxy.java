package com.ayang.spring5.aop.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Ayang
 * @date 2021/3/5 - 16:58
 */
public class JDKProxy {

    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = dao.add(1,2);
        System.out.println("add = " + add);

    }
}
class UserDaoProxy implements InvocationHandler {

    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行" + method.getName() + ":传递的参数：" + Arrays.toString(args));

        Object res = method.invoke(obj,args);

        System.out.println("方法之后执行" + obj);
        return res;
    }
}

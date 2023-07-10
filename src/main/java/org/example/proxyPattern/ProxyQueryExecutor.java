package org.example.proxyPattern;

import java.lang.reflect.Proxy;

public class ProxyQueryExecutor implements Query {
    String userType;
    Query query;

    public ProxyQueryExecutor(String userType) {
        this.userType = userType;
        query = new QueryImpl();
    }

    public void save(int a) {
        if (userType.equals("admin")){
            query.save(a);
        }else {
            System.out.println("this action is only allowed for the admins");
        }
    }
}

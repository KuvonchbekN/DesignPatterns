package org.example.proxyPattern;

public class QueryImpl implements Query {
    @Override
    public void save(int a) {
        System.out.println("save method worked with argument " + a);
    }
}

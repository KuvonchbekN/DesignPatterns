package org.example.proxyPattern;

public class ProxyTester {
    public static void main(String[] args) {
        Query proxyQueryExecutor= new ProxyQueryExecutor("admin"); //this is why proxy class should implement the Parent interface as well
        proxyQueryExecutor.save(1);


    }
}

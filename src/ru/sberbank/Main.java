package ru.sberbank;

public class Main {
    public static void main(String[] args) {
        BrandNewHashMap map = new BrandNewHashMap();
        map.put("sosiska", 12);
        System.out.println(map.size());
        System.out.println(map.get(12));
        System.out.println(map.get("sosiska"));
        System.out.println(map.contains("sosiska"));
        map.put("hello", 10);
        map.put("check", 3);
        map.put("Na dobavku", 11);
        System.out.println(map.get("hello"));
        System.out.println(map.get("check"));
        map.remove("hello");
        System.out.println(map.contains("hello"));
        System.out.println(map.size());
    }
}

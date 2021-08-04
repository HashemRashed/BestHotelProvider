package com.example.demo.constant;

/**
 * @author Hashem Rashed
 *
 * add providers
 */
public enum Providers {

   BEST_HOTEL("Best Hotel"),
   CRAZY_HOTEL("Crazy Hotel");

    private String name;

    private Providers(String status) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

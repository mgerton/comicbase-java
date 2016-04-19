package com.mgerton.comicbase.comiccharacter.domain;

public class ComicCharacter {
	private final long id;
    private final String name;
    private final String alias;

    public ComicCharacter(long id, String name, String alias) {
    	this.id = id;
        this.name = name;
        this.alias = alias;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAlias() {
        return this.alias;
    }
}
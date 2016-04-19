package com.mgerton.comicbase.comiccharacter.web;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;

import com.mgerton.comicbase.comiccharacter.domain.ComicCharacter;

@RestController
public class ComicCharacterController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/api/character")
    public ComicCharacter character(
    	@RequestParam(value="name", required=true, defaultValue="") String name,
    	@RequestParam(value="alias", required=true, defaultValue="") String alias
    ) {
    	return new ComicCharacter(counter.incrementAndGet(), name, alias);
    }

    @RequestMapping(value = "/api/characters", method = RequestMethod.GET, produces = "application/json")
    public String index() {
        return "GET /api/characters";
    }
}